package cforcustomer.lovesheep.com.basenetdemo.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.ivydad.readtool.R;
import com.ivydad.readtool.global.Constants;
import com.ivydad.readtool.global.JsonConstants;
import com.ivydad.readtool.global.ReadToolApp;
import com.ivydad.readtool.interfaces.ICustomShareCallback;
import com.ivydad.readtool.jpush.ActivityResultCallBack;
import com.ivydad.readtool.module.audio.player.AudioPlayerActivity;
import com.ivydad.readtool.module.home.parenting.lesson.LessonPlayActivity;
import com.ivydad.readtool.module.widget.OperationTip;
import com.ivydad.readtool.service.AudioServiceBinder;
import com.ivydad.readtool.utils.ConnectUtil;
import com.ivydad.readtool.utils.DensityUtil;
import com.ivydad.readtool.utils.DeviceUtils;
import com.ivydad.readtool.utils.DialogUtils;
import com.ivydad.readtool.utils.DownloadUtil;
import com.ivydad.readtool.utils.LogUtil;
import com.ivydad.readtool.utils.ResourceUtil;
import com.ivydad.readtool.utils.StringUtils;
import com.ivydad.readtool.utils.UmengShareUtil;
import com.ivydad.readtool.utils.Util;
import com.ivydad.readtool.utils.ViewUtil;
import com.ivydad.readtool.utils.statistics.StatisticsUtils;
import com.trello.rxlifecycle.components.support.RxFragmentActivity;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import static com.ivydad.readtool.global.Constants.NETWORK_ERROR_NOCACHE_TIMEOUT;
import static com.ivydad.readtool.global.Constants.NETWORK_ERROR_NOCACHE_UNCONNECTED;
import static com.ivydad.readtool.global.Constants.NETWORK_ERROR_SERVICE_ERROR;
import static com.ivydad.readtool.utils.DownloadUtil.BROADCAST_ACTION_LESSON_SHARE_PHOTO_FAILURE;
import static com.ivydad.readtool.utils.DownloadUtil.BROADCAST_ACTION_LESSON_SHARE_PHOTO_SUCCESS;

public abstract class BasicActivity extends RxFragmentActivity implements BaseNet, View.OnClickListener, SwipeRefreshLayout.OnRefreshListener {
    public String sPageName = "";
    public boolean mIsActivityVisible = false;
    private int loadingProgressHigh = 100;
    public static final int DELAY_REQUEST = 1;

    private Handler handler = new BasicActivityHandler(this);

    private static class BasicActivityHandler extends Handler {
        private final BasicActivity mActivity;
        private BasicActivityHandler(BasicActivity activity){
            mActivity = activity;
        }
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case DELAY_REQUEST:
                    removeMessages(DELAY_REQUEST);
                    if (ReadToolApp.isAutoLoginFinished) {
                        mActivity.initData();
                        removeCallbacksAndMessages(null);
                    } else {
                        sendEmptyMessageDelayed(DELAY_REQUEST, 500);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private BroadcastReceiver mReceiver;
    private TextView mTvReload, mTvError;
    private View mRlErrorCover;
    private SwipeRefreshLayout mSsrlRefresh;
    private TextView mTvTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置标题栏颜色为浅色
        DeviceUtils.setLightStatus(getWindow());

        IntentFilter priority = new IntentFilter(Constants.INTENT_ACTION_UPDATE_MINE_INFO);
        priority.setPriority(ReadToolApp.sAutoLoginBroadcastPriority);
        ReadToolApp.sAutoLoginBroadcastPriority += 1;
        setContentView(getLayoutId());
        IntentFilter filter = new IntentFilter(BROADCAST_ACTION_LESSON_SHARE_PHOTO_SUCCESS);
        if (isListeningLessonShare()) {
            filter.addAction(DownloadUtil.BROADCAST_ACTION_LESSON_SHARE_PHOTO_FAILURE);
        }
        filter.addAction(AudioServiceBinder.BROADCAST_ACTION_PLAY_STATE_CHANGE);
        mReceiver = new LessonShareBroadReceiver();
        registerReceiver(mReceiver, filter);

        mTvTitle = find(R.id.tv_title);

        mRlErrorCover = find(R.id.rl_network_error);
        if (mRlErrorCover != null)
            mRlErrorCover.setOnClickListener(this);
        mTvReload = find(R.id.tv_reload);
        if (mTvReload != null) {
            mTvReload.setOnClickListener(this);
        }
        mTvError = find(R.id.tv_network_error);
        mSsrlRefresh = find(R.id.ssrl_refresh);
        if (mSsrlRefresh != null) {
            mSsrlRefresh.setOnRefreshListener(this);
        }
        initView();
        initListener();

        if (!ConnectUtil.isNetworkConnected(ReadToolApp.sContext)) {
            initData();
        } else {
            if (ifNeedAfterLogin()) {
                if (ReadToolApp.isAutoLoginFinished) {
                    initData();
                } else {
                    showLoadingProgress();
                    handler.sendEmptyMessageAtTime(DELAY_REQUEST, 500);
                }
            } else {
                initData();
            }
        }

        loadingProgressHigh = DensityUtil.dip2px(getApplicationContext(), 80);
        registerCommonBtn();
    }

    protected boolean isListeningLessonShare() {
        return false;
    }

    /**
     * 当前页面是否需要登录以后再请求网络.
     *
     */
    public boolean ifNeedAfterLogin() {
        return false;
    }

    /**
     * 表明该Activity是否包含Fragment.
     *
     * @return true包含Fragment, false不包含Fragment.
     */
    protected boolean isContainFragment(){
        return false;
    }

    /**
     * 表明该Activity是否需要显示优惠券.
     *
     * @return true包含Fragment, false不包含Fragment.
     */
    protected boolean isShowCoupon() {
        return true;
    }

    protected boolean isExecuteOnResumeStatistic() {
        return true;
    }

    protected boolean isAutoProcessPlayAnim() {
        return true;
    }

    protected boolean isAutoProcessBack() {
        return true;
    }

    /**
     * 简化findviewbyId过程
     *
     */
    protected <T> T find(@IdRes int viewId) {
        return (T) findViewById(viewId);
    }

    /**
     * 简化findviewbyId过程
     *
     */
    protected <T> T find(View view, @IdRes int viewId) {
        return (T) view.findViewById(viewId);
    }

    /**
     * 填充View
     *
     */
    protected View inflate(@LayoutRes int layoutId) {
        return View.inflate(ReadToolApp.sContext, layoutId, null);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        exitActivity();
    }

    @Override
    public void finish() {
        super.finish();
    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        //super.onSaveInstanceState(outState, outPersistentState);
    }

    /**
     * 在多个界面间公用的按钮，在此处注册点击事件
     */
    private void registerCommonBtn() {
        View back = findViewById(R.id.back);
        View backSecond = findViewById(R.id.iv_back_second);
        if (isAutoProcessBack()) {
            if (back != null)
                back.setOnClickListener(this);
            if (backSecond != null)
                backSecond.setOnClickListener(this);
        }
    }

    /**
     * 返回当前Activity使用的布局ID
     */
    @LayoutRes
    protected abstract int getLayoutId();

    /**
     * 只执行findViewById操作
     */
    protected abstract void initView();

    /**
     * 注册监听器，适配器
     */
    protected void initListener(){}

    /**
     * 获取数据，填充界面
     */
    protected void initData(){
        requestDataWithErrorProcess();
    }

    /**
     * BaseActivity没有处理的点击事件，在此方法处理
     */
    protected void processClick(View v){

    }

    /** 后台启动Activity */
    protected static void launchFromBg(Context context, Intent intent){
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 退出当前Activity
     */
    protected final void exitActivity() {
        finish();
        switchAnim();
    }

    /**
     * 退出Activity时的切换动画
     */
    protected void switchAnim() {

    }

    protected void requestDataWithErrorProcess(){
        hideNetworkErrorCover();
        startRefresh();
        requestData();
    }

    protected void requestData() {
    }

    protected void requestDataFailedWithErrorProcess(String msg){
        endRefresh();
        ViewUtil.getInstance().showOperationTip(this, msg, OperationTip.STATE_WARNING);
        requestDataFailed(msg);
    }

    protected void requestDataFailed(String msg){
    }

    protected void loadDataWithErrorProcess() {
        hideNetworkErrorCover();
        endRefresh();
        loadData();
    }

    protected void loadData() {
    }

    protected void reloadData() {

    }

    protected void clearData() {

    }

    @Override
    public void onRefresh() {
        reloadData();
    }

    protected void setRefreshOffset() {
        if (!isNull(mSsrlRefresh))
            mSsrlRefresh.setProgressViewOffset(false, 0, (int) ResourceUtil.getDimen(R.dimen.length_2x_50px));
    }

    public final void startRefresh() {
        if (!isNull(mSsrlRefresh) && !mSsrlRefresh.isRefreshing())
            ConnectUtil.startRefresh(mSsrlRefresh);
    }

    public final void endRefresh() {
        if (!isNull(mSsrlRefresh) && mSsrlRefresh.isRefreshing())
            ConnectUtil.completeRefresh(mSsrlRefresh);
    }

    protected final void setRefreshEnabled() {
        if (!isNull(mSsrlRefresh))
            mSsrlRefresh.setEnabled(true);
    }


    protected final void setRefreshDisabled() {
        if (!isNull(mSsrlRefresh))
            mSsrlRefresh.setEnabled(false);
    }

    /**
     * 用于设置标题的方法.
     */
    protected void setTitle(String title) {
        if (title == null)
            title = "";
        if (!isNull(mTvTitle))
            mTvTitle.setText(title);
    }

    public void setTitle(@StringRes int resId) {
        String title = ResourceUtil.getString(resId);
        setTitle(title);
    }

    public final void showNetworkErrorCover(String msg) {
        if (!isNull(mRlErrorCover) && mRlErrorCover.getVisibility() != View.VISIBLE){
            mRlErrorCover.setVisibility(View.VISIBLE);
            if (!isNull(mTvReload) && !isNull(mTvError)){
                switch(msg){
                    case NETWORK_ERROR_NOCACHE_TIMEOUT:
                        mTvReload.setText(R.string.public_network_refresh);
                        mTvError.setText(NETWORK_ERROR_NOCACHE_TIMEOUT);
                        break;
                    case NETWORK_ERROR_NOCACHE_UNCONNECTED:
                        mTvReload.setText(R.string.public_network_reload);
                        mTvError.setText(NETWORK_ERROR_NOCACHE_UNCONNECTED);
                        break;
                    case NETWORK_ERROR_SERVICE_ERROR:
                        mTvReload.setText(R.string.public_network_reload);
                        mTvError.setText(NETWORK_ERROR_SERVICE_ERROR);
                        break;
                    default :
                        break;
                }
            }
        }
    }

    public final void showNetworkErrorCover() {
        showNetworkErrorCover("");
    }

    public final void hideNetworkErrorCover() {
        if (!isNull(mRlErrorCover) && mRlErrorCover.getVisibility() != View.GONE){
            mRlErrorCover.setVisibility(View.GONE);
        }
    }

    protected static boolean isNull(Object object) {
        return object == null;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fl_public_title_next && isAutoProcessPlayAnim()) {
            AudioPlayerActivity.enterAudioPlayer(this);
            return;
        }
        switch (v.getId()) {
            case R.id.back:
            case R.id.iv_back_second:
                if (isAutoProcessBack()) {
                    exitActivity();
                } else
                    defaultProcessClick(v);
                break;
            case R.id.tv_reload:
                reloadData();
                break;
            default:
                // 同一个点击事件只能填入到下列两个方法的其中一个，都填入会执行两次
                defaultProcessClick(v);
                break;
        }
    }

    private void defaultProcessClick(View v) {
        processClick(v);
        if (!Util.isFastDoubleClick()) {
            processNoFastClick(v);
        }
    }

    protected void processNoFastClick(View v){

    }

    @Override
    protected void onStart() {
        mIsActivityVisible = true;
        super.onStart();
        if (isAutoProcessPlayAnim()) {
            ViewUtil.showAndHidePlayAnim(BasicActivity.this, getWindow().getDecorView());
        }
    }

    /**
     * 重写基础Activity的生命周期方法,用于友盟统计.
     */
    @Override
    protected void onResume() {
        super.onResume();
        if (isExecuteOnResumeStatistic()) {
            if (!isContainFragment() && !StringUtils.isNull(sPageName)) {//仅有Activity
                StatisticsUtils.onPageStart(sPageName);
                LogUtil.i(StatisticsUtils.TAG, sPageName + " onPageStart()");
                StatisticsUtils.onActivityResume(this);
                LogUtil.i(StatisticsUtils.TAG, sPageName + " onActivityResume");
            } else {//Activity+Fragment
                StatisticsUtils.onActivityResume(this);
            }
        }
    }

    /**
     * 重写基础Activity的生命周期方法,用于友盟统计.
     */
    @Override
    protected void onPause() {
        mIsActivityVisible = false;
        super.onPause();
        if (!isContainFragment() && !StringUtils.isNull(sPageName)) {//Activity+Fragment
            StatisticsUtils.onPageEnd(sPageName);
            StatisticsUtils.onActivityPause(this);
        } else {//仅有Activity
            StatisticsUtils.onActivityPause(this);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private MaterialDialog mCommonNotifyIsLoading;

    /**
     * 显示玩命加载中对话框
     */
    public void showLoadingDialog() {
        if (mCommonNotifyIsLoading == null) {
            mCommonNotifyIsLoading = new MaterialDialog.Builder(this).backgroundColorRes(R.color.white)
                    .contentColorRes(R.color.text_gray1).content(getText(R.string.common_notify_is_loading)).progress(true, 0).progressIndeterminateStyle(false).build();
            mCommonNotifyIsLoading.show();
            Window mWindow = getWindow();
            WindowManager.LayoutParams lp = mWindow.getAttributes();
            lp.dimAmount = 0f;
            mWindow.setAttributes(lp);
        } else {
            if (!mCommonNotifyIsLoading.isShowing())
                mCommonNotifyIsLoading.show();
        }
    }

    /**
     * 隐藏玩命加载中对话框
     */
    public void hideLoadingDialog() {
        if (mCommonNotifyIsLoading != null) {
            if (mCommonNotifyIsLoading.isShowing())
                mCommonNotifyIsLoading.dismiss();
        }
    }

    private PopupWindow mPopupWindow;
    private View popupView;
    private ScaleAnimation scaleAnimation;
    private boolean isNeedShowProgress;


    public void showLoadingProgress() {
        if (mPopupWindow == null) {
            popupView = ViewUtil.inflate(R.layout.public_loading_progress_popu, true);
            mPopupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT, true);
            mPopupWindow.setBackgroundDrawable(new BitmapDrawable());//不设置动画无法显示.
            mPopupWindow.setTouchable(false);
            mPopupWindow.setFocusable(true);
            mPopupWindow.setOutsideTouchable(false);
            scaleAnimation = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            scaleAnimation.setDuration(250);

            if (hasWindowFocus()) {
                mPopupWindow.showAtLocation(getWindow().getDecorView().findViewById(android.R.id.content), Gravity.TOP, 0, loadingProgressHigh);
                popupView.startAnimation(scaleAnimation);
            } else {
                isNeedShowProgress = true;
            }

        } else if (!mPopupWindow.isShowing()) {
            if (hasWindowFocus()) {
                mPopupWindow.showAtLocation(getWindow().getDecorView().findViewById(android.R.id.content), Gravity.TOP, 0, loadingProgressHigh);
                popupView.startAnimation(scaleAnimation);
            } else {
                isNeedShowProgress = true;
            }
        }
    }

    public void hideLoadingProgress() {
        if (mPopupWindow != null) {
            isNeedShowProgress = false;
            mPopupWindow.dismiss();
        }
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            if (isNeedShowProgress && mPopupWindow != null && !mPopupWindow.isShowing()) {
                try {
                    isNeedShowProgress = false;
                    mPopupWindow.showAtLocation(getWindow().getDecorView().findViewById(android.R.id.content), Gravity.TOP, 0, loadingProgressHigh);
                    popupView.startAnimation(scaleAnimation);
                } catch (WindowManager.BadTokenException badTokenException) {
                    LogUtil.i(BasicActivity.class, "showLoadingProgress mPopupWindow 添加失败...");
                }
            }
        }
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            LogUtil.i(getClass().getSimpleName(), "返回键点击....");
        }
        return super.onKeyUp(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        hideLoadingDialog();
        if (mPopupWindow != null && mPopupWindow.isShowing()) {
            mPopupWindow.dismiss();
        }
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            handler = null;
        }

        ReadToolApp.sAutoLoginBroadcastPriority -= 1;
        if (mReceiver != null)
            unregisterReceiver(mReceiver);
    }

    private ActivityResultCallBack activityResultCallBack;

    public void setActivityResultCallBack(ActivityResultCallBack activityResultCallBack) {
        this.activityResultCallBack = activityResultCallBack;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (activityResultCallBack != null) {
            activityResultCallBack.onActivityResultCallBack(requestCode, resultCode, data);
        }

        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }

    private void sharePhoto(SHARE_MEDIA media, String title, String content) {
        Bitmap bitmap = ViewUtil.getInstance().generateSharePhoto(title, content);
        if (bitmap == null)
            DialogUtils.showToast("分享失败，请稍后再试");
        else
            UmengShareUtil.getInstance().shareBitmapToPlatform(media, bitmap, this);

    }

    private class LessonShareBroadReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null)
                return;
            switch (intent.getAction()) {
                case BROADCAST_ACTION_LESSON_SHARE_PHOTO_SUCCESS:
                    if (ReadToolApp.instance.currentActivity == null || BasicActivity.this != ReadToolApp.instance.currentActivity)
                        return;
                    SHARE_MEDIA media = (SHARE_MEDIA) intent.getSerializableExtra(JsonConstants.SHARE_MEDIA);
                    String title = intent.getStringExtra(JsonConstants.LESSON_SHARE_TITLE);
                    String content = intent.getStringExtra(JsonConstants.LESSON_SHARE_CONTENT);
                    if (BasicActivity.this instanceof LessonPlayActivity) {
                        UmengShareUtil.getInstance().setCustomShareCallback(new ICustomShareCallback() {
                            @Override
                            public void onStart(SHARE_MEDIA var1) {
                                //不需要操作.
                            }

                            @Override
                            public void onResult(SHARE_MEDIA var1) {
                                BasicActivity.this.exitActivity();
                            }

                            @Override
                            public void onError(SHARE_MEDIA var1, Throwable var2) {
                                BasicActivity.this.exitActivity();
                            }

                            @Override
                            public void onCancel(SHARE_MEDIA var1) {
                                BasicActivity.this.exitActivity();
                            }
                        });
                    }
                    sharePhoto(media, title, content);
                    break;
                case BROADCAST_ACTION_LESSON_SHARE_PHOTO_FAILURE:
                    DialogUtils.showToast("分享失败，请稍后再试");
                    break;
                case AudioServiceBinder.BROADCAST_ACTION_PLAY_STATE_CHANGE:
                    if (isAutoProcessPlayAnim()) {
                        ViewUtil.showAndHidePlayAnim(BasicActivity.this, getWindow().getDecorView());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
