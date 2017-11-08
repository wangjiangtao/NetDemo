package cforcustomer.lovesheep.com.basenetdemo.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ivydad.readtool.R;
import com.ivydad.readtool.global.ReadToolApp;
import com.ivydad.readtool.module.audio.player.AudioPlayerActivity;
import com.ivydad.readtool.service.AudioServiceBinder;
import com.ivydad.readtool.utils.ConnectUtil;
import com.ivydad.readtool.utils.LogUtil;
import com.ivydad.readtool.utils.ResourceUtil;
import com.ivydad.readtool.utils.StringUtils;
import com.ivydad.readtool.utils.Util;
import com.ivydad.readtool.utils.ViewUtil;
import com.ivydad.readtool.utils.statistics.StatisticsUtils;
import com.squareup.leakcanary.RefWatcher;
import com.trello.rxlifecycle.components.support.RxFragment;

import static com.ivydad.readtool.global.Constants.NETWORK_ERROR_NOCACHE_TIMEOUT;
import static com.ivydad.readtool.global.Constants.NETWORK_ERROR_NOCACHE_UNCONNECTED;
import static com.ivydad.readtool.global.Constants.NETWORK_ERROR_SERVICE_ERROR;


/** Created by Administrator on 2015/11/2. */
public abstract class BaseFragment extends RxFragment implements BaseNet, View.OnClickListener, SwipeRefreshLayout.OnRefreshListener {
    public String TAG = this.getClass().getSimpleName();
    private static final String STATE_SAVE_IS_HIDDEN = "STATE_SAVE_IS_HIDDEN";
    protected boolean isCreated = false;
    //用于标记是否开始统计.
    private boolean isStartStatistic = false;
    private View view;
    private TextView mTvTitle;
    private TextView mTvReload, mTvError;
    private View mRlErrorCover;
    private SwipeRefreshLayout mSsrlRefresh;
    private BroadcastReceiver mReceiver = new BaseFragmentReceiver();

    protected String getPageName() {
        return "";
    }

    protected boolean isAutoProcessBack() {
        return true;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            boolean isSupportHidden = savedInstanceState.getBoolean(STATE_SAVE_IS_HIDDEN);

            FragmentTransaction ft = getFragmentManager().beginTransaction();
            if (isSupportHidden) {
                ft.hide(this);
            } else {
                ft.show(this);
            }
            ft.commit();
        }
        isCreated = true;
    }

    /**
     * 简化findviewbyId过程
     */
    protected <T> T find(View view, int viewId) {
        return (T) view.findViewById(viewId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view != null) {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null)
                parent.removeView(view);
        }
        try {
            view = inflater.inflate(getLayoutId(), container, false);
        } catch (InflateException e) {
        /* map is already there, just return view as it is */
        }
        /*View ivBackSecond = find(view, R.id.iv_back_second);
        if (ivBackSecond != null){
            if (isAutoProcessBack()) {
                ivBackSecond.setVisibility(View.VISIBLE);
            } else {
                ivBackSecond.setVisibility(View.GONE);
            }
        }*/

        mTvTitle = find(view, R.id.tv_title);

        mRlErrorCover = find(view, R.id.rl_network_error);
        if (mRlErrorCover != null){
            mRlErrorCover.setOnClickListener(this);
        }
        mTvReload = find(view, R.id.tv_reload);
        if (mTvReload != null) {
            mTvReload.setOnClickListener(this);
        }
        mTvError = find(view, R.id.tv_network_error);
        mSsrlRefresh = find(view, R.id.ssrl_refresh);
        if (mSsrlRefresh != null) {
            mSsrlRefresh.setOnRefreshListener(this);
        }

        IntentFilter intentFilter = new IntentFilter(AudioServiceBinder.BROADCAST_ACTION_PLAY_STATE_CHANGE);
        getContext().registerReceiver(mReceiver, intentFilter);

        initView(view);
        initListener();
        initData();
        registerCommonBtn(view);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // 使用LeakCanary检测Fragment的内存泄漏
        RefWatcher refWatcher = ReadToolApp.getRefWatcher(getActivity());
        refWatcher.watch(this);

        if (mReceiver != null){
            getContext().unregisterReceiver(mReceiver);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    /**
     * 在多个界面间公用的按钮，在此处注册点击事件
     */
    private void registerCommonBtn(View root) {
        View view = root.findViewById(R.id.back);
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    /**
     * 返回当前Activity使用的布局ID
     */
    protected abstract int getLayoutId();

    /**
     * 只执行findViewById操作
     */
    protected abstract void initView(View view);

    /**
     * 注册监听器，适配器
     */
    protected void initListener(){}

    /**
     * 获取数据，填充界面
     */
    public void initData(){
        requestData();
    }

    /**
     * BaseActivity没有处理的不需防止重复点击的点击事件，在此方法处理
     */
    protected void processClick(View v){}

    /**
     * BaseActivity没有处理的需防止重复点击的点击事件，在此方法处理
     */
    protected void processNoFastClick(View v) {}

    protected boolean isAutoProcessPlayAnim() {
        return true;
    }

    protected void requestData() {
    }

    protected void requestDataFailed(String msg){
    }

    protected void loadData() {
    }

    /**
     * 重新加载数据
     */
    protected void reloadData() {
    }

    protected void clearData() {
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

    @Override
    public void onRefresh() {
        reloadData();
    }

    /**
     * 用于设置标题的方法.
     *
     * @param title 标题文本
     */
    protected final void setTitle(String title) {
        if (title == null)
            title = "";
        if (!isNull(mTvTitle))
            mTvTitle.setText(title);
    }

    protected final void setTitle(@StringRes int resId) {
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

    protected final void showNetworkErrorCover() {
        showNetworkErrorCover("");
    }

    public final void hideNetworkErrorCover() {
        if (!isNull(mRlErrorCover) && mRlErrorCover.getVisibility() != View.GONE)
            mRlErrorCover.setVisibility(View.GONE);
    }

    protected static boolean isNull(Object object) {
        return object == null;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fl_public_title_next && isAutoProcessPlayAnim()) {
            AudioPlayerActivity.enterAudioPlayer(getActivity());
            return;
        }

        if ((v.getId() == R.id.back || v.getId() == R.id.iv_back_second)) {
            if (isAutoProcessBack()){
                if (getActivity() != null)
                    getActivity().finish();
                else
                    getFragmentManager().popBackStack();
            }
            else {
                processClick(v);
            }
        }

        switch (v.getId()) {
            case R.id.tv_reload:
                reloadData();
                break;
            default:
                // 同一个点击事件只能填入到下列两个方法的其中一个，都填入会执行两次
                processClick(v);
                if (!Util.isFastDoubleClick()) {
                    processNoFastClick(v);
                }
                break;
        }
    }

    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
        if (menuVisible) {
            if (!StringUtils.isNull(getPageName()) && !isStartStatistic) {//需要友盟统计
                isStartStatistic = true;
                StatisticsUtils.onPageStart(getPageName());
                LogUtil.i(StatisticsUtils.TAG, this.getClass().getName() + " 开始页面统计...");
            }
        } else {
            // TODO: 2016/7/12 没有隐藏
            if (!StringUtils.isNull(getPageName()) && isStartStatistic) {//需要友盟统计
                isStartStatistic = false;
                StatisticsUtils.onPageStart(getPageName());
                LogUtil.i(StatisticsUtils.TAG, this.getClass().getName() + " 停止页面统计...");
            }
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (isAutoProcessPlayAnim()) {
            ViewUtil.showAndHidePlayAnim(BaseFragment.this, BaseFragment.this.getView());
        }
    }

    /**
     * 重写基础Activity的生命周期方法,用于友盟统计.
     */
    @Override
    public void onResume() {
        super.onResume();
        if (!StringUtils.isNull(getPageName()) && !isStartStatistic && isNeedOnResume) {//需要友盟统计
            isStartStatistic = true;
            isNeedOnResume = false;
            StatisticsUtils.onPageStart(getPageName());
            LogUtil.i(StatisticsUtils.TAG, this.getClass().getName() + " 开始页面统计...");
        }
    }

    private boolean isNeedOnResume = false;

    /**
     * 重写基础Activity的生命周期方法,用于友盟统计.
     */
    @Override
    public void onPause() {
        super.onPause();
        if (!StringUtils.isNull(getPageName()) && isStartStatistic) {//需要友盟统计
            StatisticsUtils.onPageEnd(getPageName());
            isStartStatistic = false;
            isNeedOnResume = true;
            LogUtil.i(StatisticsUtils.TAG, this.getClass().getName() + " 停止页面统计...");
        }
    }


    public void showLoadingProgress() {
        FragmentActivity activity = getActivity();
        if (activity != null && activity instanceof BasicActivity) {
            BasicActivity basicActivity = (BasicActivity) activity;
            basicActivity.showLoadingProgress();
        }
    }

    public void hideLoadingProgress() {
        FragmentActivity activity = getActivity();
        if (activity != null && activity instanceof BasicActivity) {
            BasicActivity basicActivity = (BasicActivity) activity;
            basicActivity.hideLoadingProgress();
        }
    }

    private class BaseFragmentReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null)
                return;
            switch(intent.getAction()){
                case AudioServiceBinder.BROADCAST_ACTION_PLAY_STATE_CHANGE:
                    if (isAutoProcessPlayAnim()) {
                        ViewUtil.showAndHidePlayAnim(BaseFragment.this, BaseFragment.this.getView());
                    }
                    break;
                default :
                    break;
            }
        }
    }
}
