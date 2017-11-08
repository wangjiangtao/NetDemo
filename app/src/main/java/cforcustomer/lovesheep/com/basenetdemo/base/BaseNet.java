package cforcustomer.lovesheep.com.basenetdemo.base;


import android.text.TextUtils;
import android.util.Log;

import com.trello.rxlifecycle.LifecycleTransformer;

import cforcustomer.lovesheep.com.basenetdemo.global.Constants;
import cforcustomer.lovesheep.com.basenetdemo.global.JsonConstants;

/**
 * Created by wangxi on 2017/10/31.
 */

public interface BaseNet {
    void hideNetworkErrorCover();

    void showNetworkErrorCover(String msg);

    void startRefresh();

    void endRefresh();

    <T> LifecycleTransformer<T> bindToLifecycle();

    default String getErrorMessage(String type, String resultCode, String message, String cachedData) {
        switch (type) {
            case Constants.NETWORK_ERROR_TIMEOUT:
                return TextUtils.isEmpty(cachedData) ? Constants.NETWORK_ERROR_NOCACHE_UNCONNECTED : Constants.NETWORK_ERROR_CACHED_TIMEOUT;
            case Constants.NETWORK_ERROR_UNCONNECTED:
                return  TextUtils.isEmpty(cachedData) ? Constants.NETWORK_ERROR_NOCACHE_UNCONNECTED : Constants.NETWORK_ERROR_CACHED_UNCONNECTED;
            case Constants.NETWORK_ERROR_SERVICE_ERROR:
                return Constants.NETWORK_ERROR_SERVICE_ERROR;
            default:
                return message;
        }
    }

    /**
     * 发生网络错误的回调函数
     * type 错误消息类型字符串，取值为：
     * Constants.NETWORK_ERROR_TIMEOUT:
     * Constants.NETWORK_ERROR_UNCONNECTED:
     * Constants.NETWORK_ERROR_SERVICE_ERROR:
     * Constants.NETWORK_ERROR_RETURN_ERROR:
     */
    default void onNetworkError(String type, String resultCode, String resultMessage, String cachedData) {
        if (JsonConstants.ERROR_OTHER_LOGIN.equals(resultCode)) {//0x00000001:其他手机登陆;
            // TODO: 2017/11/8 执行异地登录操作
//            LoginUtils.otherLogin(ReadToolApp.sContext, resultMessage);
        } else if (JsonConstants.ERROR_TOKEN_OVERDUE.equals(resultCode)//token过期
                || JsonConstants.ERROR_TOKEN_ERROR.equals(resultCode) //token错误
                || JsonConstants.ERROR_TOKEN_NULL.equals(resultCode)) {//token为空
            // TODO: 2017/11/8 清除本地数据 ,执行方可登录.
//            ConfigUtils.clearUserInfo(ReadToolApp.sContext);
//            LoginUtils.guestLogin(ReadToolApp.sContext);
        } else {
            String msg = getErrorMessage(type, resultCode, resultMessage, cachedData);
            // TODO: 2017/11/8 弹错误提示
//            DialogUtils.showToast(msg);
        }
    }

    default void onNoData() {
        showNetworkErrorCover("");

    }

    default void printError(Throwable err) {
        Log.e(this.getClass().getSimpleName(), err.toString());
    }

    default HttpChain get(String path) {
        return new HttpChain(path, this).method("GET");
    }

    default HttpChain post(String path) {
        return new HttpChain(path, this).method("POST");
    }

}
