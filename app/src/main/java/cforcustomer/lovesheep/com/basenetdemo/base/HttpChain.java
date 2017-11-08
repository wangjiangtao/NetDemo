/**
 * Created by yedf on 2017/10/30.
 */

package cforcustomer.lovesheep.com.basenetdemo.base;


import android.text.TextUtils;
import android.util.Log;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import cforcustomer.lovesheep.com.basenetdemo.exception.RTException;
import cforcustomer.lovesheep.com.basenetdemo.exception.ServerException;
import cforcustomer.lovesheep.com.basenetdemo.global.Constants;
import cforcustomer.lovesheep.com.basenetdemo.global.JsonConstants;
import cforcustomer.lovesheep.com.basenetdemo.global.RTConstants;
import cforcustomer.lovesheep.com.basenetdemo.util.JsonUtils;
import cforcustomer.lovesheep.com.basenetdemo.util.PostUtils;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.schedulers.Schedulers;


class Body {
    String resultCode;
    String resultMessage;
}

public class HttpChain {
    public static String defaultHost = "wechat.ivydad.com";
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private BaseNet mAction;
    private List<NameValuePair> mQuery;
    private List<NameValuePair> mForm;
    private String mApi;
    private String mMethod;
    private boolean mCache = false;
    private boolean mCustomError = false;
    private String mBaseUrl = RTConstants.URL_JSON_API;
    private static final String TAG = "HttpChain";
    private CacheMode mCacheMode = CacheMode.NetFirst;

    public enum CacheMode {
        CacheFirst, NetFirst
    }

    public HttpChain(String api, BaseNet action) {
        this.mApi = api;
        this.mAction = action;
        mQuery = new ArrayList<>();
        mForm = new ArrayList<>();
    }

    public HttpChain customError(boolean customError) {
        this.mCustomError = customError;
        return this;
    }

    public HttpChain cache(boolean cache) {
        this.mCache = cache;
        return this;
    }

    public HttpChain cacheMode(CacheMode cacheMode) {
        this.mCacheMode = cacheMode;
        return this;
    }

    public HttpChain method(String method) {
        this.mMethod = method;
        if (method.equals("POST")) {
            // TODO: 2017/11/8 创建的公共参数 .
            Map<String, String> map = PostUtils.getPublicParaMap();
            for (String key : map.keySet()) {
                form(key, map.get(key) == null ? "" : map.get(key));
            }
        }
        return this;
    }

    public HttpChain query(String key, String val) {
        mQuery.add(new BasicNameValuePair(key, val));
        return this;
    }

    public HttpChain form(String key, String val) {
        mForm.add(new BasicNameValuePair(key, val));
        return this;
    }

    public HttpChain formId(String id) {
        form(JsonConstants.ID, id);
        return this;
    }

    public HttpChain formType(String type){
        form(JsonConstants.TYPE, type);
        return this;
    }

    public HttpChain formType(int type){
        form(JsonConstants.TYPE, String.valueOf(type));
        return this;
    }

    public HttpChain formPageNo(String pageNum){
        form(JsonConstants.PAGE_NO, pageNum);
        return this;
    }

    public HttpChain formPageNo(int pageNum){
        form(JsonConstants.PAGE_NO, String.valueOf(pageNum));
        return this;
    }

    private void runInMain(Action0 func) {
        Observable.just(null)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(r -> func.call())
        ;
    }

    /**
     * 可以根据需求设置不同的 BaseUrl
     */
    public HttpChain setBaseUrl(String baseUrl) {
        mBaseUrl = baseUrl;
        return this;
    }

    public HttpChain setCommunityBaseUrl(){
        setBaseUrl(RTConstants.URL_PHP_JSON_API);
        return this;
    }

    public String getResponse() throws Exception {
        Request.Builder rBuilder = new Request.Builder()
                .url(mBaseUrl + '/' + this.mApi);
        if (mMethod.equals("POST")) {
            JSONObject jsonObject = new JSONObject();
            for (NameValuePair kv : mForm) {
                jsonObject.put(kv.getName(), kv.getValue());
            }
            RequestBody requestBody = RequestBody.create(JSON, jsonObject.toString());
            rBuilder.post(requestBody);
        }
        Response response = new OkHttpClient.Builder() // TODO 使用这个api设置超时后，response就不对了
                .readTimeout(RTConstants.NETWORK_TIMEOUT, TimeUnit.MILLISECONDS)
                .writeTimeout(RTConstants.NETWORK_TIMEOUT, TimeUnit.MILLISECONDS)
                .connectTimeout(RTConstants.NETWORK_TIMEOUT, TimeUnit.MILLISECONDS)
                .build()
                .newCall(rBuilder.build())
                .execute();
        //Response response = new OkHttpClient().newCall(rBuilder.build()).execute();
        if (response.code() >= 300 || response.code() < 200) {
            throw new ServerException(response.code() + "", response.message());
        }
        return response.body().string();
    }

    private void onNetworkError(String type, String resultCode, String resultMessage, String cachedData) {
        runInMain(() -> mAction.onNetworkError(type, resultCode, resultMessage, cachedData));
        // report to server
        // TODO: 2017/11/8 这里将错误信息提交给服务器.
//        PostUtils.postErrorToServer(ReadToolApp.sContext, mBaseUrl + '/' + mApi, null, resultCode, resultMessage);
    }

    private <T> Observable<String> getResultObservableString(Class<T> cls) {
        Observable<String> observableResult = getObservableString(cls);
        if (CacheMode.CacheFirst.equals(mCacheMode)) {
            String cachedData = this.mCache ? Cache.getCacheData(this.mForm) : null;
            if (!TextUtils.isEmpty(cachedData))
                observableResult = Observable.merge(Observable.just(cachedData), observableResult);
        }
        return observableResult;
    }

    private <T> Observable<String> getObservableString(Class<T> cls) {
        mAction.hideNetworkErrorCover();
        // TODO: 2017/11/8 这里判断网络是否连接
//        boolean isConn = ConnectUtil.isNetworkConnected(ReadToolApp.instance.getApplicationContext());
        boolean isConn = true;
        String cachedData = this.mCache ? Cache.getCacheData(this.mForm) : null;
        // 网络无连接，可以直接报错，返回cache值
        if (!isConn) {
            mAction.onNetworkError(Constants.NETWORK_ERROR_UNCONNECTED, null, null, cachedData);
            return Observable.just(cachedData);
        }
        mAction.startRefresh();
        return Observable.defer(() -> {
            try {
                String s1 = getResponse();
                Body body = JsonUtils.getBeanFromJson(s1, Body.class);
                // 返回的数据失败，则报告错误，返回cache值
                if (!JsonConstants.RESULT_SUCCESS.equals(body.resultCode)) {
                    onNetworkError("", body.resultCode, body.resultMessage, cachedData);
                    return Observable.just(cachedData);
                }
                String data = JsonUtils.getJsonObjAttr(s1, "data");
                if (this.mCache) {
                    if (data.startsWith("{")) {
                        JsonUtils.getBeanFromJson(data, cls);
                    } else {
                        JsonUtils.getListFromJson(data, cls);
                    }
                    Cache.createCacheData(this.mForm, data);
                }
                return Observable.just(data);
            } catch (Exception e) {
                handleNetworkException(cachedData, e);
                return Observable.just(cachedData);
            }
        });
    }

    private void handleNetworkException(String cachedData, Exception e) {
        String errorType = "";
        String code = "";
        String msg = "";
        if (e instanceof ServerException) {//http请求错误.
            errorType = Constants.NETWORK_ERROR_SERVICE_ERROR;
            code = ((ServerException) e).getCode();
            msg = ((ServerException) e).getMsg();
        } else if (e instanceof SocketTimeoutException) {//网络超时异常
            errorType = Constants.NETWORK_ERROR_TIMEOUT;
        } else if (e instanceof RTException) {//Json转换出错.服务器异常
            errorType = Constants.NETWORK_ERROR_SERVICE_ERROR;
        } else {//其他异常.默认为App内部异常.
            msg = Constants.NETWORK_ERROR_SERVICE_ERROR;
        }
        onNetworkError(errorType, code, msg, cachedData);
    }

    private <T> Observable<T> send(Class<T> typeOfT) {
        return getResultObservableString(typeOfT).map(s -> {
            // 如果结果字符串为空，则调用onNoData，并吃掉事件，保证最终给出的数据是T的对象
            try {
                return JsonUtils.getBeanFromJson(s, typeOfT);
            } catch (RTException e) {
                runInMain(mAction::onNoData);
                e.printStackTrace();
                return null;
            }
        }).filter(e -> e != null);
    }

    private <T> Observable<List<T>> sendArray(Class<T> typeOfT) {
        return getResultObservableString(typeOfT).map(s -> {
            try {
                List<T> list = JsonUtils.getListFromJson(s, typeOfT);
                return list;
            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
                return null;
            }
        }).filter(e -> e != null && !e.isEmpty());
    }

    public <T> Observable<List<T>> resultList(Class<T> typeOfT) {
        return resultFinish(sendArray(typeOfT));
    }

    public <T> Observable<T> result(Class<T> typeOfT) {
        return resultFinish(send(typeOfT));
    }

    private <T> Observable<T> resultFinish(Observable<T> obs) {
        return obs
                .compose(mAction.bindToLifecycle())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnTerminate(() -> mAction.endRefresh())
                ;
    }
}
