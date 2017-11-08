package cforcustomer.lovesheep.com.basenetdemo.global;


public interface Constants {
    //应用包名
    String IVYDAD_PACKAGE_NAME = "com.ivydad.readtool";

    // APP文件本地的保存外置存储路径
    String PATH_EXTERNAL_STORAGE = "";
    String PATH_APP_FILE = PATH_EXTERNAL_STORAGE + "/IvyDad";

    // APP内部缓存路径
    String PATH_INTERNAL_STORAGE_SYSTEM_CACHE = "";

    // 新版本APK下载路径
    String PATH_NEW_VERSION_APP_DOWNLOAD = PATH_APP_FILE + "/Apk";

    // APP文件本地的内置存储路径
    String PATH_INTERNAL_STORAGE = "";
    String PATH_INTERNAL_APP_FILE = PATH_INTERNAL_STORAGE + "/IvyDad";
    String PATH_EXTERNAL_APP_FILE = PATH_EXTERNAL_STORAGE + "/IvyDad";

    // APP本地内置存储缓存数据路径
    String PATH_INTERNAL_APP_FILE_CACHE = PATH_INTERNAL_APP_FILE + "/Cache";

    // 亲子时光相关下载路径
    String PATH_FAMILY_FILE = PATH_INTERNAL_APP_FILE + "/Family";
    String PATH_FAMILY_AUDIO = PATH_FAMILY_FILE + "/audio";
//    String PATH_FAMILY_AUDIO_ORIGINAL = PATH_FAMILY_AUDIO + "/original";
//    String PATH_FAMILY_AUDIO_ORIGINAL_CACHE = PATH_FAMILY_AUDIO + "/original_cache";
    String PATH_FAMILY_AUDIO_NORMAL = PATH_FAMILY_AUDIO + "/normal";
    String PATH_FAMILY_AUDIO_CACHE = PATH_FAMILY_AUDIO + "/cache";
    String PATH_FAMILY_AUDIO_DECODE = PATH_FAMILY_AUDIO + "/decode";
    String PATH_FAMILY_LYRIC = PATH_FAMILY_FILE + "/lyric";
    String PATH_FAMILY_LYRIC_NORMAL = PATH_FAMILY_LYRIC + "/normal";
    String PATH_FAMILY_LYRIC_CACHE = PATH_FAMILY_LYRIC + "/cache";

    String PATH_INTERNAL_IMAGE = PATH_INTERNAL_APP_FILE + "/Image";
    String PATH_EXTERNAL_IMAGE = PATH_EXTERNAL_APP_FILE + "/Image";
    String PATH_IMAGE_TEMP = PATH_INTERNAL_IMAGE + "/temp";
    String PATH_IMAGE_AD = PATH_INTERNAL_IMAGE + "/ad";
    String FILE_NAME_TEMP_BITMAP = "bitmap_temp.jpg";

    // APP文件本地保存的名称
    String NAME_IVYDAD = "ivydad";
    String NAME_SUFFIX_IVYDAD = ".ivydad";
    String NAME_IVYDAD_PICTURE = NAME_IVYDAD + "_picture_";
    String NAME_IVYDAD_PICTURE_TEMP = NAME_IVYDAD_PICTURE + "temp_";
    int IO_BUFFER_SIZE = 1024 * 100;
    String UMENG_COMMUNITY_USER_NAME = "umeng_community_user_name";

    //Sp存储中保存的用户名字字段
    String SP_USER_STATUS = "sp_user_status";
    String SP_PROVINCE_CODE = "sp_province_code";
    String SP_PROVINCE_NAME = "sp_province_name";
    String SP_CITY_CODE = "sp_city_code";
    String SP_CITY_NAME = "sp_city_name";
    String SP_LOGO_URL = "sp_logo_url";
    String SP_USER_SEX = "sp_user_sex";
    String SP_GUIDE_SLIDE_VERBATIM_PLAYER_IS_SHOWED = "sp_guide_slide_verbatim_player_is_showed";
    String SP_MALL_TIP_NEW_IS_SHOWED = "sp_mall_tip_new_is_showed";
    @Deprecated//改为使用SP_MEMBER_NICK
            String SP_USER_NICK = "SP_USER_NICK";
    String SP_IS_USERINFO_COMPLETE = "sp_is_userinfo_complete";
    String SP_TOKEN = "SP_TOKEN";
    //用于将个人资料页Json缓存到本地
    String SP_PERINFO_JSON = "sp_per_info";

    String IS_OTHER_LOGIN = "is_other_login";
    String BEFORE_GUEST_TOKEN = "before_guest_token";
    long REFRESH_TIMEOUT = 900;

    int LEC_STATE_IS_SHOWING = 0;
    int LEC_STATE_ABOUT_TO_BEGIN = 1;
    int LEC_STATE_IS_OVER = 2;
    int LEC_STATE_IS_EDITING = 3;
    int LEC_APPLY_STATE_TRUE = 1;
    int LEC_APPLY_STATE_FALSE = 0;
    int LEC_IF_MORE_TURE = 1;
    int LEC_IF_MORE_FALSE = 0;
    String DELIVERY_LECTURE_ID = "delivery_lecture_id";
    int MAX_CLICK_INTERVAL_TIME = 700;
    String IS_ENTER_HOME_PAGE = "is_enter_home_page";
    String DELIVERY_LECTURE_CATEGORY_ID = "delivery_lecture_category_id";
    String DELIVERY_LECTURE_CATEGORY_NAME = "delivery_lecture_category_name";
    String IS_LIVE_LECTURE_MORE = "is_live_lecture_more";

    //事件统计的事件ID
    String Lecture_Banner_Slide_TheLeft = "Lecture_Banner_Slide_TheLeft";
    String Lecture_Banner_Slide_TheRight = "Lecture_Banner_Slide_TheRight";
    String Lecture_BannerClick = "Lecture_BannerClick";
    String Lecture_Home_MyButtonClick = "Lecture_Home_MyButtonClick";
    String Lecture_LiveMoreClick = "Lecture_LiveMoreClick";
    //     String Lecture_BannerClick2 = "Lecture_BannerClick2";
    String Lecture_TypeButtonClick = "Lecture_TypeButtonClick";
    String Lecture_Mine_LoginButtonClick = "Lecture_Mine_LoginButtonClick";
    String Lecture_Mine_IngButtonClick = "Lecture_Mine_IngButtonClick";
    String Lecture_Mine_OverButtonClick = "Lecture_Mine_OverButtonClick";
    String Lecture_Mine_Slide_TheRight = "Lecture_Mine_Slide_TheRight";
    String Lecture_Mine_Slide_TheLeft = "Lecture_Mine_Slide_TheLeft";
    String Lecture_NavigationClick = "Lecture_NavigationClick";
    String Lecture_Particulars_description_Expand_Button = "Lecture_Particulars_description_Expand_Button";
    String Lecture_Particulars_description_Putaway_Button = "Lecture_Particulars_description_Putaway_Button";
    String Lecture_Particulars_JoinButton = "Lecture_Particulars_JoinButton";
    String Lecture_Particulars_EnrollButton = "Lecture_Particulars_EnrollButton";
    String Lecture_Particulars_AlreadyEnrollButton = "Lecture_Particulars_AlreadyEnrollButton";
    String Lecture_Particulars_ListenButton = "Lecture_Particulars_ListenButton";
    String Lecture_Particulars_ShareButton = "Lecture_Particulars_ShareButton";
    String Lecture_Particulars_SharewithfriendButton = "Lecture_Particulars_ListenButton";
    String STAT_LECTURE_PARTICULARS_ENTERROOMBUTTON = "Stat_Lecture_Particulars_EnterRoomButton";

    String Lecture_Particulars_Log_Out = "log out";
    String Lecture_Particulars_Type_Key = "type";
    String Lecture_Particulars_Log_In = "log in";
    String Lecture_Particulars_Share = "share";


    String EVENT_STATISTICS_LOG_TAG = "event_statistics_log_tag";

    //页面时长统计
    String Lecture_Home = "Lecture_Home";
    String Lecture_ByType = "Lecture_ByType";
    String Lecture_Live = "Lecture_Live";
    String Lecture_Mine = "Lecture_Mine";
    String Lecture_Particulars = "Lecture_Particulars";
    String Lecture_Room = "Lecture_Room";
    //    String Login = "Login";
    String Picture = "Picture";
    String Chinese = "Chinese";
    //    String Playlist = "Playlist";
    String Sleep = "Sleep";

    //微讲座提示语新增
    //网络异常提示
    String NETWORK_ERROR_NOCACHE_TIMEOUT = "网络不畅，请刷新重试";//无缓存，网络超时
    String NETWORK_ERROR_NOCACHE_UNCONNECTED = "无可用网络，你可以听已下载的音频";//无缓存，无网络
    String NETWORK_ERROR_CACHED_TIMEOUT = "网络不畅，请检查网络";//有缓存，网络超时
    String NETWORK_ERROR_CACHED_UNCONNECTED = "无可用网络，你可以听已下载的音频";//有缓存，无网络
    String NETWORK_ERROR_UNCONNECTED_CLICK_BTN = "网络不畅，请稍后重试";//点有网络请求的按钮

    String NETWORK_ERROR_TIMEOUT = "网络不畅，请刷新重试";
    String NETWORK_ERROR_UNCONNECTED = "无可用网络";
    String NETWORK_ERROR_SERVICE_ERROR = "数据加载失败，请稍后重试";//服务器异常
    String NETWORK_ERROR_RETURN_ERROR = "数据加载失败，服务器返回错误";//服务器异常

    String NORMAL_ERROR_APP_BUG = "系统出错，请稍后重试";//客户端异常

    //常规提示
    String LECTURE_NOT_BEGGING = "讲座未开始";//点击“已报名”按钮
    String IS_LOADING_HARD = "正在玩命加载";//提示正在加载

    String BROADCAST_ACTION_AUDIO = "com.ivydad.readtool.audio";
    String BROADCAST_ACTION_NOTIFY = "com.ivydad.readtool.notify";
    String BROADCAST_ACTION_LOCAL_LIST_ADD = "com.ivydad.readtool.local_list_add";
    String BROADCAST_ACTION_LOCAL_LIST_DELETE = "com.ivydad.readtool.local_list_delete";
    String BROADCAST_ACTION_AUDIO_DOWNLOAD_STATE_CHANGE = "com.ivydad.readtool.local_list_change";
    String BROADCAST_ACTION_LOCAL_LIST_ORDER = "com.ivydad.readtool.local_list_order";
    String BROADCAST_ACTION_KILL_AUDIO_PLAYER = "com.ivydad.readtool.kill_audio_player";
    String BROADCAST_ACTION_YOUZAN_LOGIN = "com.ivydad.readtool.youzan_login";
    // 本地SP存储的当前音频相关数据
    String SP_AUDIO_CURR_PLAY_MODE = "sp_audio_curr_play_mode";
    String FAMILY_BOOK_AUDIO_NOT_AVAILABLE = "0";
    String FAMILY_BOOK_AUDIO_AVAILABLE = "1";
    String FAMILY_BOOK_NEWEST_AUDIO = "-04";

    String FAMILY_CATEGORY_TITLE = "family_category_title";
    String FAMILY_CATEGORY_CAT_ID = "family_category_cat_id";
    String FAMILY_CATEGORY_TYPE_ID = "family_category_type_id";
    String FAMILY_BOOK_LIST_HAVE_MORE = "1";
    String FAMILY_BOOK_LIST_NOT_MORE = "0";

    // 音频所属的歌单、哄睡或已下载的标识常量
    String FAMILY_AUDIO_LIST_TYPE = "family_audio_list_type";
    String FAMILY_AUDIO_DATABASE_BEAN = "family_audio_database_bean";
    String FAMILY_AUDIO_IS_PLAYER_NETWORK_ERROR = "family_audio_is_player_network_error";
    String FAMILY_AUDIO_IS_LOAD_UI_DATA = "family_audio_is_load_ui_data";
    String FAMILY_AUDIO_IS_SWITCH_OTHER = "family_audio_is_switch_other";
    int FAMILY_AUDIO_LIST_TYPE_NONE = -1;
    int FAMILY_AUDIO_LIST_TYPE_SINGLE_BOOK = 0;
    int FAMILY_AUDIO_LIST_TYPE_SONG_LIST = 1;
    int FAMILY_AUDIO_LIST_TYPE_SLEEP_LIST = 2;
    int FAMILY_AUDIO_LIST_TYPE_DOWNLOADED_LIST = 3;
    int FAMILY_AUDIO_LIST_TYPE_LIKE_LIST = 4;
    int FAMILY_AUDIO_LIST_TYPE_RADIO_LIST = 5;
    int FAMILY_AUDIO_LIST_TYPE_PLAY_LIST = 6;
    int FAMILY_AUDIO_LIST_TYPE_ADD_FEED = 7;

    // 1.6.0 添加
    int FAMILY_AUDIO_PLAYER_TIMING = 0;
    //用于标示权限记录,没有播放模式的关系.
    int FAMILY_AUDIO_LIST_TYPE_AUTHORITY_RECORD = 9;

    int FAMILY_AUDIO_LIST_UNDOWNLOAD = 0;
    int FAMILY_AUDIO_LIST_DOWNLOADED = 1;

    // 音频操作类型
    String FAMILY_AUDIO_OPERATE_TYPE = "family_audio_operate_type";
    int FAMILY_AUDIO_OPERATE_TYPE_NONE = -1;
    int FAMILY_AUDIO_OPERATE_TYPE_DELETE = 0;
    int FAMILY_AUDIO_OPERATE_TYPE_ORDER = 1;

    // 商城相关常量
    String MALL_INFO_WEB_URL = "mall_info_web_url";
    String MALL_YOUZAN_USER_AGENT = "ecb43be651efd9c24b1469500721804";
    //    String MALL_YOUZAN_TEST_MAIN_PAGE = "https://wap.koudaitong.com/v2/feature/27tbuor6";
    String MALL_YOUZAN_URL = "https://wap.koudaitong.com";
    String MALL_YOUZAN_URL_VERSION = "v2";
    String MALL_YOUZAN_URL_GOODS = "/goods";
    String MALL_BOOK_DETAIL_URL_PREFIX = MALL_YOUZAN_URL + "/" + MALL_YOUZAN_URL_VERSION +
            MALL_YOUZAN_URL_GOODS;

    // 哄睡时长
    String FAMILY_SLEEP_SET_TIME = "family_sleep_set_time";
    String FAMILY_AUDIO_SET_TIME = "family_audio_set_time";


    // 优惠券相关常量
    String COUPON_NOTE_ID = "coupon_note_id";

    String COUPON_IS_NOT_NEED_SHOW = "0";
    String COUPON_IS_NEED_SHOW = "1";

    String COUPON_NOTE_TYPE_TEXT = "0";
    String COUPON_NOTE_TYPE_IMAGE = "1";

    String COUPON_NOTE_PAGE_TYPE_FOREGROUND = "1";
    String COUPON_NOTE_PAGE_TYPE_CLICK_MALL = "2";
    String COUPON_NOTE_PAGE_TYPE_CLICK_MINE = "3";

    String SYMBOL_SPLIT_URL_PARAMS = "\\?";


    //登录注册添加
    String SP_PHONE_NO = "sp_phone_no";
    String SP_USER_ID = "user_id";
    String SP_MEMBER_UUID = "member_uuid";
    String SP_MEMBER_NICK = "member_nick";
    String SP_MEMBER_SEX = "member_sex";
    String SP_BABY_NICK = "baby_nick";
    String SP_BABY_SEX = "baby_sex";
    String SP_BABY_BIRTHDAY = "baby_birthday";
    String SP_MEMBER_STATUS = "member_status";
    String SP_AVATAR_URL = "avatar_url";
    //用于存储设备的唯一标识...
    String SP_DEVICE_ID = "device_id";
    //我的订单的Url
    String SP_MY_ORDER_URL = "my_order_url";
    //分享app地址
    String SP_APP_SHARE_URL = "app_share_url";
    //商城首页地址
    String SP_SHOP_URL = "shop_url";
    //常青藤用户唯一标识
    String SP_APP_USER_ID = "app_user_id";

    //分享邀请好友的地址
    String SP_INVITE_FRIEND_URL = "invite_friend_url";
    //邀请好友的内容文本
    String SP_INVITE_TITLE = "invite_title";
    //邀请好友的内容文本
    String SP_INVITE_CONTENT = "invite_content";
    //邀请好友的分享的标题
    String SP_INVITE_SHARE_TITLE = "invite_share_title";
    //分享邀请好友的内容
    String SP_INVITE_SHARE_CONTENT = "invite_share_content";
    //邀请好友的内容文本
    String SP_INVITE_SHARE_IMAGE_URL = "invite_share_image_url";

    //0.16.0新加
    String SP_MEMBER_IDENTITY = "member_identity";
    String SP_LOCATION_LATITUDE = "location_latitude";
    String SP_LOCATION_LONGITUDE = "location_longitude";

    //0.17.0新加的
    String SP_MEMBER_TYPE = "member_type";
    String SP_MEMBER_TYPE_TEXT = "member_type_text";
    String SP_MEMBER_TYPE_DESC = "member_type_desc";
    String SP_NOT_SHARE_URL_LIST = "not_share_url_list";

    String SP_INVITE_FRIEND_DESC = "invite_friend_desc";



    //v0.12.0添加的
    String SP_JPUSH_ALIAS = "jpush_alias";
    String SP_JPUSH_TAGS = "jpush_tags";
    String SP_SHARE_TO_URL = "share_to_url";
    String SP_QUESTION_URL = "question_url";

    //游客默认数值
    String GUEST_DEFAULT_MUMBER_ID = "0";


    //用于更新我的页面信息的Action
    String INTENT_ACTION_UPDATE_MINE_INFO = "intent_action_update_mine_info";
    //用于通知用户被挤下线的广播意图
    String INTENT_ACTION_OTHER_DEVICE_LOGIN = "intent_action_update_mine_info";
    //通知Activity关闭.
    String INTENT_ACTION_CLOSE_ACTIVITY = "intent_action_close_activity";
    //通知用户身份发生变化
    String INTENT_ACTION_USER_STATE_CHANGED = "intent_action_user_state_changed";

    //用于提示需要显示异地登录
    String INTENT_ACTION_SHOW_OTHER_LOGIN = "intent_action_show_other_login";

    //通知商城登录成功的广播.
    String INTENT_ACTION_LOGIN_MALL_SUCCESS = "intent_action_login_mall_success";


    //用于传递临时解码音频的Action
    String INTENT_ACTION_DELIVER_DECODE_FILE = "intent_action_deliver_decode_file";
    String DELIVER_DECODE_FILE = "deliver_decode_file";
    String FLAG_IS_WHOLE_FILE = "flag_is_whole_file";
    String IS_DECODE_SUCCESS = "is_decode_success";
    String IS_DECODE_CACHE_FINISH = "is_decode_cache_finish";

    //
    String DELIVER_DECODE_FILE_TYPE = "deliver_file_type";
    String DELIVER_DECODE_FILE_TYPE_CACHE_CHUNK = "deliver_decode_file_type_cache_chunk";
    String DELIVER_DECODE_FILE_TYPE_CACHE_WHOLE = "deliver_decode_file_type_cache_whole";
    String DELIVER_DECODE_FILE_TYPE_DOWNLOAD_WHOLE = "deliver_decode_file_type_download_whole";

    //缓存取消的回调字段
    String IDOWNLOADCALLBACK_ONFAILURE_DELIVER_FLAG = "缓存取消";

    //歌词相关.
    String AUDIO_FLAG_US = "american";
    String AUDIO_FLAG_ENGLAND = "english";
    String AUDIO_FLAG_MUSIC = "music";
    String AUDIO_FLAG_ENGLISH_SONG = "english_song";//儿歌
    String AUDIO_FLAG_READING = "reading";
    String AUDIO_FLAG_RHYTHM = "rhythm";
    String AUDIO_FLAG_SLEEPING = "sleeping";


    // 设置页面
    String SP_SETTINGS_IS_USE_MOBILE_NETWORK = "sp_settings_is_use_mobile_network";
    boolean SETTINGS_NOT_USE_MOBILE_NETWORK = false;
    boolean SETTINGS_IS_USE_MOBILE_NETWORK = true;


    //0.14.0友盟统计新加
    String OPEN_LECTURE_NAVIGATION = "OpenLecture_Navigation";
    String OpenNavigation = "OpenNavigation";//点击底部导航按钮
    String NavigationName = "导航名字";//点击底部导航按钮
    String ShareTo = "Shareto";//分享到
    String WeixinFriendster = "朋友圈";//分享到
    String SongName = "歌曲名称";//歌曲名称
    String AudioTrackType = "音轨类型";//音轨类型
    String LoopMode = "循环模式";//循环模式
    String SingleRepeat = "单曲循环";
    String AllRepeat = "顺序播放";
    String CancelSingleRepeat = "关闭单曲循环";
    String RandomPlay = "随机循环";
    String PlayLength = "播放时长";//播放时长
//    String PlayLength = "播放时长";//播放时长

    String TriggerRegistPosition = "位置";
    String PositionLecShare = "微讲座详情_分享";
    String PositionEnterLecRoom = "微讲座详情_进入教室";
    String PositionMineRegisterLogin = "我的_注册/登录";
    String PositionMinePortrait = "我的_头像";
    String PositionMinePersonalInfo = "我的_个人资料";
    String PositionMineAuthorityRecord = "我的_权限记录";
    String PositionMineMyLec = "我的_我的讲座";

    String CommonPosition = "位置";
    String PositionDiscover = "亲子时光首页";
    String PositionMySong = "我的歌单";
    String PositionSleepTools = "哄睡";
    String PositionMyDownload = "下载";
    String PositionLike = "喜欢";
    String PositionRadio = "磨耳朵";
    String PositionMyBookAndAudio = "我的书和音频";
    String PositionAlbum = "专辑";
    String PositionAudioPlayer = "播放器";
    String PositionMyLike = "我喜欢的";
    String PositionMoreIvyDadRec = "更多常爸推荐";
    String PositionPLayList = "播放列表";
    String PositionMoreNewest = "更多最新音频";
    String PositionCatePage = "分类页";
    String PositionMicroPage = "微页面";
    String PositionCatePage2 = "分类页";
    String PositionFreeSift = "免费精选";
    String PositionParentingHome = "亲子首页";
    String PositionAdSplash = "启动页广告";
    String PositionBanner = "轮播图";
    String PositionThemeBanner = "首页banner";
    String PositionISBN = "扫码";
    String PositionAllCartoon = "全部动画";
    String PositionCartoonDetail = "动画详情";

    String CategoryName = "分类名称";
    String EnglishClassics1 = "英文经典一岁+";
    String EnglishClassics2 = "英文经典二岁+";
    String StereoscopicBook = "立体书";
    String FairyTale = "童话";
    String PeppaPig = "Peppa Pig";
    String TrafficTool = "交通工具";
    String MolesStory = "鼹鼠的故事";
    String ThreeCharacterPrimer = "三字经";
    String OneThousandCharacterPrimer = "千字文";
    String SanskritEnlightenment = "声律启蒙";
    String FloorName = "楼层名称";
    String OldLecture = "往期讲座";
    String LecCategoryName = "分类";


    String SHARE_IN_LECTURE_DETAIL = "ShareInLectureDetail";
    String ENTER_A_LECTURE = "EnterALecture";
    String PLAY_IN_SLEEPING_TOOLS = "PlayInSleepingTools";
    String PLAY_IN_PLAYER = "PlayInPlayer";
    String SHARE_IN_PLAYER = "ShareInPlayer";
    String OPEN_PLAYER = "OpenPlayer";//侦测播放常驻按钮的使用情况
    String OPEN_LOGIN = "OpenLogin";//侦测触发登录的情况
    String CHOOSE_TO_GOON = "ChooseToGoon";
    String CHOOSE_TO_CANCEL = "ChooseToCancel";
    String LOGIN = "Login";
    String REGISTER = "Register";
    String GET_CODE_AGAIN_REGISTER = "GetCodeAgain_Register";
    String FORGET_PASSWORD_IN_LOGIN = "ForgetPasswordInLogin";
    String GET_CODE_AGAIN_FORGET_PASSWORD = "GetCodeAgain_Forgetpassword";
    String LOGIN_IN_FORGET_PASSWORD_PAGE = "LoginInForgetPasswordPage";
    String LOGOUT = "Logout";
    String TAP_MY_KIDS_BUTTON = "TapMykidsButton";
    String OPEN_AN_AUDIO = "OpenAnAudio";
    String OPEN_A_LECTURE = "OpenALecture";
    String PLAY_IN_PLAYER_FROM_MY_SONG_SHEET = "PlayInPlayerFromMySongSheet";
    String PLAY_IN_PLAYER_FROM_MY_LIKE = "PlayInPlayerFromMySongLike";
    String Play_In_Player_From_MyDownload = "PlayInPlayerFromMyDownload";
    String PlayInPlayerFromSleeping = "PlayInPlayerFromSleeping";

    String Lecture = "Lecture";
    String Lecture_MoreLive = "Lecture_MoreLive";
    String Login_p = "Login";
    //分类列表先不做
//    String Picbook = "Picbook";
//    String Chinese = "Chinese";
    String Playlist = "Playlist";
    String Sleeping = "Sleeping";
    //    String Lecture = "Lecture";
    String Lecture_Catelist = "Lecture_Catelist";
    String MyLecture = "MyLecture";
    String LectureDetail = "LectureDetail";
    String LectureRoom = "LectureRoom";
    String Kids = "Kids";
    String Kids_Catelist = "Kids_Catelist";
    //分类列表先不做
//    String Picbook = "Picbook";
//    String Chinese = "Chinese";
    String Kids_Newest = "Kids_Newest";
    String Mykids = "Mykids";
    String SleepingTools = "SleepingTools";
    String Sleepingsheet = "Sleepingsheet";
    String Mysongsheet = "Mysongsheet";
    String Mydownload = "Mydownload";
    String Mylike = "MyLike";
    String Myitem = "Myitem";
    String Player = "Player";
    String Mine = "Mine";
    String Personalinformation = "Personalinformation";
    String PermissionRecord = "PermissionRecord";
    String Mylecture = "Mylecture";
    String AboutUs = "AboutUs";
    String EnterPhoneNumber = "EnterPhoneNumber";
    String Login = "Login";
    String Register = "Register";
    String ForgetPassword = "ForgetPassword";
    String GuidePages = "GuidePages";

    //用于启动页的显示控制.
    String IS_NEED_SHOW_SPLASH_SCREEN = "is_need_show_splash_screen";
    String IS_NEED_TO_REGISTER_LOGIN = "is_need_to_register_login";


    //重复下载
    String DownloadRepeat = "重复下载";
    //友盟统计键和值


    //该手机号是否可用于赋权
    String PHONE_PERMISSION_STATE_TRUE = "1";
    String PHONE_PERMISSION_STATE_FALSE = "0";
    String DELIVER_PHONE = "deliver_phone";


    ////0.15.0版本的统计事件添加
    String SHARE_APP_WITH_MY_FRIEND = "ShareAppWithMyFriend";
    String OPEN_ORDERS = "OpenOrders";
    String OPEN_RIGHTS = "OpenRights";
    String TAP_GO_GETTING_BUTTON = "TapGoGettingButton";
    String TAP_GET_BUTTON = "TapGetButton";
    String TAP_BACK_TO_MINE_BUTTON = "TapBackToMineButton";
    String TAP_VIEW_RIGHTS_BUTTON = "TapViewRightsButton";
    String OPEN_PERSONAL_INFORMATION = "OpenPersonalinformation";
    String OPEN_ABOUT = "OpenAbout";

    String PAGE_NAME_MALL = "Mall";//页面访问路径商城

    String SHARE_WAY = "分享途径";
    String SHARE_WAY_WEIXIN_FRIEND = "微信好友";
    String SHARE_WAY_CIRCLES = "朋友圈";

    //0.17.0添加



    String DELIVER_ACTIVITY_TITLE = "deliver_activity_title";
    String DELIVER_COMMON_URL = "deliver_common_url";

    String CHECKOUT_APP_HAS_NEW_VERSION = "1";
    String APP_NAME_PREFIX = "readtool";
    String APP_NAME_SUBFIX = ".apk";

    //0.16.0添加统计事件
    String SHARE_APP_WITH_MY_FRIEND_TO_INVITE = "ShareAppWithMyFriendToInvite";

    int REQUEST_CODE_TO_REGISTER_OR_LOGIN = 0x0101;
    int REQUEST_CODE_MALL_TO_REGISTER_OR_LOGIN = 0x0102;
    int REQUEST_CODE_GET_COUPON_LIST_TO_REGISTER_OR_LOGIN = 0x0103;
    int REQUEST_CODE_NOTIFI_REGISTE_LOGIN = 0x0104;
    int REQUEST_CODE_CHOOSE_AREA_CODE = 0x0105;
    int REQUEST_CODE_COMMUNITY_START_LOGIN = 0x0106;//社区登录.
    //启动二维码扫描页面.
    int REQUEST_CODE_START_BARCODE_PAGE = 0x0106;

    int REQUEST_CODE_TO_MALL_OF_SPECIFIED_BOOK = 0;
    int REQUEST_CODE_TO_MY_MEMBER = 1;
    int REQUEST_CODE_TO_VERBATIM_PLAYER = 2;
    int REQUEST_CODE_PARENTING_LIST = 3;
    int REQUEST_CODE_SHARE_DISCOVER = 4;
    int REQUEST_CODE_ADD_AUDIO_LIKE = 5;
    int REQUEST_CODE_ADD_AUDIO_SLEEP = 6;
    int REQUEST_CODE_USER_PERMISSION = 7;
    int REQUEST_CODE_TO_RELATED_BOOK = 8;

    //0.17.0时间统计
    String PLAY_IN_PLAYER_PRIVILEGE_TYPE = "权限类型";
    String PLAY_IN_PLAYER_PERMISSION_TYPE_NONE = "试听";
    String PLAY_IN_PLAYER_PERMISSION_TYPE = "非试听";
    //登录用户更新后打开APP立即体验
    String ENTER_APP = "EnterAPP";
    //头一次打开APP选择立即体验
    String CHOOSE_TO_ENTER_APP_IN_FIRST = "ChooseToEnterAPPInFirst";
    //头一次打开APP选择登录/注册
    String CHOOSE_TO_LOGIN_IN_FIRST = "ChooseToLoginInFirst";
    //打开邀请好友页面
    String EVENT_ID_OPEN_INVITE = "OpenInvite";
    String OPEN_INVITE_FORM = "from";
    String OPEN_INVITE_FORM_BANNER = "banner";
    String OPEN_INVITE_FORM_GET_COUPON = "领取优惠券页";
    String OPEN_INVITE_FORM_MINE = "我的";
    String OPEN_INVITE_FORM_MALL_BTN = "商城button";
    //分享商品
    String EVENT_ID_SHARE_GOODS_WITH_MY_FRIEND = "ShareGoodsWithMyFriend";
    String SHARE_GOODS_WITH_MY_FRIEND_SHARE_WAY = "分享途径";
    String SHARE_GOODS_WITH_MY_FRIEND_SHARE_WAY_CIRCLES = "朋友圈";
    String SHARE_GOODS_WITH_MY_FRIEND_SHARE_WAY_WEIXIN_FRIEND = "微信好友";
    //页面访问路径
    String GUIDE_PAGES_NEW = "GuidePages";
    String INVITE_FRIENDS = "InviteFriends";
    String COUPON_LIST = "CouponList";
    String SETTINGS = "Settings";
    String MY_MEMBER = "MyMember";
    String EVENT_ID_OPEN_MY_MEMBER = "OpenMyMember";

    String OPEN_MY_MEMBER_FORM_PLAYER_MEMBER_EXCLUSIVE = "播放器【会员专享】按钮";
    String OPEN_MY_MEMBER_FORM_PLAYER_PERMISSION_DIALOG = "付费音频提示窗";
    String OPEN_MY_MEMBER_FORM_ARTICLE_LIST = "百科文章付费提示窗";
    String OPEN_MY_MEMBER_FORM_LESSON_DETAIL = "微课详情【会员专享】按钮";
    String OPEN_MY_MEMBER_FORM_MINE = "我的";
    String OPEN_MY_MEMBER_FORM_VIDEO_PLAYER = PositionCartoonDetail;
    String OPEN_MY_MEMBER_FORM_ALBUM_DETAIL = "专辑详情【立即开通】按钮";
    String OPEN_MY_MEMBER_FORM_MALL_FLOAT = "商城悬浮窗";
    String OPEN_MY_MEMBER_FORM_MY_MEMBER_OPEN = "我的会员【立即开通】按钮";


    String OPEN_MY_MEMBER_IDENTITY = "身份";
    String OPEN_MY_MEMBER_IDENTITY_FREE_USER = "注册用户";
    String OPEN_MY_MEMBER_IDENTITY_GOLD_CARD = "金卡会员";
    String FROM = "from";

    String OPEN_MY_MEMBER_FORM_TRY_LESTENE_BTN = "试听页button";
    String OPEN_MY_MEMBER_FORM_PUSH = "推送";

    //0.17.0
    String MEMBER_TYPE_GUEST = "0";
    String MEMBER_TYPE_FREE_USER = "1";


    // 用户反馈相关常量（集成阿里云的用户反馈）
    String ALI_FEEDBACK_APP_KEY = "24639032";
    String ALI_FEEDBACK_APP_SECRET = "11c403d0b82b495b83769909174ad3ec";
    // 用户反馈中用户头像的默认地址
    String ALI_FEEDBACK_TOURIST_DEFAULT_AVATAR_URL = "http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%94%AF%E7%BE%8E%E6%91%84%E5%BD%B1&step_word=&hs=0&pn=2&spn=0&di=72318278120&pi=&rn=1&tn=baiduimagedetail&is=&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=1978205210%2C2226637880&os=756120643%2C2555985262&simid=0%2C0&adpicid=0&ln=1915&fr=&fmq=1470223098862_R_D&fm=&ic=0&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg1.3lian.com%2F2015%2Fw7%2F85%2Fd%2F102.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bnstwg_z%26e3Bv54AzdH3F2tuAzdH3Fda8cAzdH3Fa0-abAzdH3Fbbn9m_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0";
    // 用户反馈中客服头像的默认地址
    String ALI_FEEDBACK_TOURIST_DEFAULT_TO_AVATAR_URL = "http://image.baidu" +
            ".com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%94%AF%E7%BE%8E%E6%91%84%E5%BD%B1&step_word=&hs=0&pn=2&spn=0&di=72318278120&pi=&rn=1&tn=baiduimagedetail&is=&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=1978205210%2C2226637880&os=756120643%2C2555985262&simid=0%2C0&adpicid=0&ln=1915&fr=&fmq=1470223098862_R_D&fm=&ic=0&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg1.3lian.com%2F2015%2Fw7%2F85%2Fd%2F102.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bnstwg_z%26e3Bv54AzdH3F2tuAzdH3Fda8cAzdH3Fa0-abAzdH3Fbbn9m_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0";

    //用于切割不可以分享有赞Url的切割符
    String NOT_SHARE_URL_LIST_SPLIT_CHAR = ";;;";


    // 1.1.0常量
    String PARENTING_LIST_CAT_ID = "parenting_list_cat_id";
    String PARENTING_LIST_CAT_NAME = "parenting_list_cat_name";
    String PARENTING_LIST_CAT_2_BEAN = "parenting_list_cat_2_bean";
    String PARENTING_LIST_CAT_2_BEAN_LIST = "parenting_list_cat_2_bean_list";
    String PARENTING_ARTICLE_BEAN = "parenting_article_bean";
    String PARENTING_ARTICLE_ID = "parenting_article_id";
    String PARENTING_ARTICLE_NAME = "parenting_article_name";
    String PARENTING_ARTICLE_URL = "parenting_article_url";
    String PARENTING_SPECIAL_LIST_CAT_ID = "parenting_special_list_cat_id";
    String PARENTING_SPECIAL_LIST_CAT_NAME = "parenting_special_list_cat_name";
    String PARENTING_ARTICLE_IS_READ = "1";
    String PARENTING_ARTICLE_IS_FOR_MEMBER = "1";
    String PARENTING_ARTICLE_IS_SHARE = "1";
    String PARENTING_ARTICLE_IS_SHARE_FALSE = "0";
    String PARENTING_IS_SPECIAL_LIST = "1";
    String PARENTING_IS_COMMON_LIST = "0";

    String WX_TRANSACTION_GET_CODE = "wx_transaction_get_code";

    String SP_WX_AUTH_CODE = "wx_auth_code";
    String SP_WX_EXPIRES_IN = "wx_expires_in";
    String SP_WX_ACCESS_TOKEN = "wx_access_token";
    String SP_WX_OAUTH_TIMEOUT_DATE = "wx_oauth_timeout_date";
    String SP_WX_REFRESH_TOKEN = "wx_refresh_token";
    String SP_WX_OPENID = "wx_openid";
    String SP_WX_SCOPE = "wx_scope";
    String SP_WX_UNIONID = "wx_unionid";

    int WX_ERRCODE_SUCCESS = 0;
    String DELIVER_WX_USER_INFO_BEAN = "deliver_wx_user_info_bean";

    int WX_SEX_MALE = 1;
    int WX_SEX_FEMALE = 2;
    //用于传递update_pwd_type更改密码的类型
    String UPDATE_PWD_TYPE = "update_pwd_type";
    String UPDATE_PWD_TYPE_FORGET_PWD = "update_pwd_type_forget_pwd";
    String UPDATE_PWD_TYPE_BIND_WEIXIN_UPDATE_PWD = "bind_weixin_update_pwd";

    String IS_BIND_WEIXIN_FALSE = "0";
    String IS_BIND_WEIXIN_TURE = "1";
    String BROADCAST_ACTION_MODIFY_PHONE_NUM = "modify_phone_num";
    String SNS_IS_BIND_TURE = "1";
    String SNS_IS_BIND_FALSE = "0";
    String DELEVER_PHONE_NUM = "delever_phone_num";
    String PACKAGE_NAME_WEIXIN = "com.tencent.mm";
    //v1.1.0事件统计.
    //事件id
    String EVENT_ID_OPEN_AN_ARTICLE = "OpenAnArticle";
    String EVENT_ID_SHARE_AN_ARTICLE_WITH_MY_FRIEND = "ShareAnArticleWithMyFriend";
    String EVENT_ID_TAP_BUY_BUTTON_IN_PLAYER = "TapBuyButtonInPlayer";
    String EVENT_ID_TAP_WECHAT_BUTTON = "TapWeChatButton";
    String EVENT_ID_BIND_SUCCESSFULLY_IN_BIND_PHONENUMBER = "BindSuccessfullyInBindPhoneNumber";
    String EVENT_ID_TAP_CATEGORY_BUTTON_IN_ENCYCLOPEDIA = "TapCategoryButtonInEncyclopedia";
    String EVENT_ID_LOGIN_WECHAT = "LoginWeChat";
    //事件key-value
    String LISTEN_PRIVILEGE_TYPE = "类型";
    String LISTEN_PRIVILEGE_TYPE_TRY = "试听";
    String LISTEN_PRIVILEGE_TYPE_NO_TRY = "听";
    String ENCYCLOPEDIA_CATEGORY_NAME = "分类名称";
    //页面访问路径
    String BIND_PHONE_NUMBER = "BindPhoneNumber";
    String ACCOUNT = "Account";
    String MODIFY_PHONE_NUMBER = "ModifyPhoneNumber";
    String ARTICLE = "Article";
    String LIST_OF_ARTICLES_OF_ENCYCLOPEDIA = "BindPhoneNumber";
    String PARENTS_CLASS = "ParentsClass";

    //v1.2.0添加
    String IS_NORMAL_LAUNCH = "is_normal_launch";
    String LAUNCH_DATA = "launch_data";
    String LAUNCH_MAIN_WITH_INDEX = "launch_main_with_index";
    String VERBATIM_CURR_BOOK_AUDIO = "verbatim_curr_audio_database_bean";
    String VERBATIM_CURR_LYRIC_LIST = "verbatim_curr_lyric_list";
    String VERBATIM_TIP_NEW_IS_SHOWED = "verbatim_tip_new_is_showed";
    String PUSH_TARGET_USER_TAG = "1";
    String PUSH_TARGET_USER_ALIAS = "0";
    String PUSH_AUDIO_TYPE = "push_audio_type";
    String BROADCAST_ACTION_MAIN_CLICK_TAB_INDEX = "main_click_tab_index";


    //v1.2.0友盟统计
    String ENTER_MODE_OF_WORD_FOR_WORD = "EnterModeOfWordForWord";//进入逐句播放模式
    String ENTER_HELP_AND_FEEDBACK = "EnterHelpAndFeedback";//进入帮助与反馈页面
    String TAP_GLOBAL_TIMING_BUTTON = "TapGlobalTimingButton";//点击全局定时按钮
    String TAP_TIMING_BUTTON_SLEEP = "TapTimingButton";//点击哄睡定时按钮
    String CHOOSE_TIME_LENGTH_OF_GLOBAL_TIMING = "ChooseTimeLengthOFGlobalTiming";//选择全局定时时长
    String TAP_OPEN_MEMBER_BUTTON_IN_MY_MEMBER = "TapOpenMemberButtonInMyMember";//点击开通会员按钮

    String TIMING_LENGTH_KEY = "时长";
    String TIMING_LENGTH_10 = "10分钟";
    String TIMING_LENGTH_20 = "20分钟";
    String TIMING_LENGTH_30 = "30分钟";
    String TIMING_LENGTH_60 = "60分钟";
    String TIMING_LENGTH_CURR_LIST = "播完当前列表";
    String TIMING_LENGTH_CLOSE = "不开启";
    String BTN_NAME_KEY = "按钮名称";
    //页面统计
    String MODE_OF_WORD_FOR_WORD = "ModeOfWordForWord";//逐句播放
    String HELP_AND_FEEDBACK = "HelpAndFeedback";//帮助和反馈

    String INVITE_FRIEND_CLICK_FRIENDS = "dad://weixin_timeline";
    String INVITE_FRIEND_CLICK_WEIXIN = "dad://weixin_session";

    //v1.3.0添加
    String DELIVER_AREA_CODE = "deliver_area_code";
    String DELIVER_AREA_CODE_BEAN = "deliver_area_code_bean";
    String SP_AREA_CODE = "sp_area_code";
    String SP_AREA_CODE_BEAN = "sp_area_code_bean";
    String AREA_CODE_DEFAULT = "+86";
    String AREA_CODE_BEAN_DEFAULT = "{    \"area_code\": \"+86\",    \"area_code_id\": \"\"}";
    String INVITE_FRIEND_SHARE_TO_FRIENDS = "dad://openShareView";//显示分享的底部视图.


    //v1.3.2添加
    String IS_ISBN_AVAILABLE_FALSE = "0";
    String IS_ISBN_AVAILABLE_TRUE = "1";
    String BOOK_IS_FOR_MEMBER_TRUE= "1";
    String BOOK_IS_FOR_MEMBER_FALSE= "0";
    boolean IS_SHOW_LOCK_ON_BOOK = false;

    //v1.4.0添加
    String COMM_LOGIN_ERROR_IS_GUEST = "用户尚未登录";//如果未登录,应该先登录.
    String SP_MY_COUPON_URL = "my_coupon_url";
    //v1.4.0事件统计
    String TAP_MEMBER_DISCOUNT_BUTTON = "TapMemberDiscountButton";
    String TAP_BECOME_MEMBER_BUTTON = "TapBecomeMemberButton";
    String SHARE_WAY_QQ_FRIEND = "QQ好友";
    String SHARE_WAY_SINA = "微博";

    //v1.5.0添加
    int LESSON_STATE_ABOUT_TO_BEGINING = 1;
    int LESSON_STATE_ALREADY_BEGAN = 0;
    int LESSON_IS_FINISHED = 1;
    int LESSON_NOT_FINISHED = 0;
    String DAD_PROTOCOL = "dad://";
    String SP_IS_SHOW_FLOAT = "is_show_float";
    String SP_FLOAT_IMG_URL = "float_img_url";
    String SP_PHP_MSG_LIST_URL = "php_msg_list_url";
    String SP_BUY_MEMBER_URL = "buy_member_url";
    String SP_YOUZAN_ACCESS_TOKEN = "sp_youzan_access_token";
    String SP_YOUZAN_COOKIE_KEY = "sp_youzan_cookie_key";
    String SP_YOUZAN_COOKIE_VALUE = "sp_youzan_cookie_value";

    String SP_REDEEM_CODE_PAGE_DATA = "redeem_code_page_data";


    //v1.5.0事件统计
    String TapPlaylistButtonInPlayer = "TapPlaylistButtonInPlayer";
    String TapAddToMySongSheetButtonInPlayer = "TapAddToMySongSheetButtonInPlayer";
    String TapAddToSleepingToolsButtonInPlayer = "TapAddToSleepingToolsButtonInPlayer";
    String TapDownloadButtonInPlayer = "TapDownloadButtonInPlayer";
    String EnterModeOfWordForWord = "EnterModeOfWordForWord";//值已经存在
    String POSITION_LYRIC = "歌词";//值已经存在
    String POSITION_BUTTON = "按钮";//值已经存在
    String TapPlayButtonInLyric = "TapPlayButtonInLyric";//侦测歌词里的播放按钮的使用情况
    String TapWordForWordButtonInLyric = "TapWordForWordButtonInLyric";//侦测歌词里的逐句播放按钮的使用情况
    String OpenScanISBN = "OpenScanISBN";//侦测使用扫码功能的情况
    String TapTrackButtonInPlayer = "TapTrackButtonInPlayer";//侦测Pos页面，音轨按钮点击情况
    String POSITION_PLAYER_LIST = "播放列表";
    String ARTICLE_NAME = "文章名称";
    String ARTICLE_BELONG_CATE_NAME = "所属分类名称";
    String OpenACoursePackage = "OpenACoursePackage";//打开一个课程包
    String COURSE_PACKAGE_NAME = "课程包名称";
    String OpenACourse = "OpenACourse";
    String COURSE_NAME = "课程名称";
    String BELONG_COURSE_PACKAGE_NAME = "所属课程包名称";
    String EnterClassroom = "EnterClassroom";//进入课堂
    String MEMBER_TYPE = "用户类型";//进入课堂
    String TapFinishButton = "TapFinishButton";//侦测每节课的完成情况
    String ShareACoursePackage = "ShareACoursePackage";//分享一个课程包
    String ShareAFinishedCourse = "ShareAFinishedCourse";//侦测用户已完成课程被分享的情况
    String TapSharetoListenButton = "TapSharetoListenButton";//侦测访客和普通用户点击分享听课按钮的情况
    String TapEnterClassroomButton = "TapEnterClassroomButton";//侦测普通用户点击进入课堂按钮的情况
    String TapSharetoWeChatMomentsButton = "TapSharetoWeChatMomentsButton";//侦测金卡会员分享微课的情况
    String TapMembersListenButton = "TapMembersListenButton";//侦测访客、普通用户、金卡会员点击会员畅听按钮的情况
    String ShareCourseSchedule = "ShareCourseSchedule";//侦测用户课程学习进度被分享的情况
    String TapStudyButton = "TapStudyButton";//侦测用户点击立即学习或继续学习按钮的情况
    String Share21thActivity = "Share21thActivity";//侦测活动被分享的情况

    // 1.6.0 添加
    String TYPE_FROM_PAGE = "type_from_page";
    String SP_PHP_LOGIN_URL = "php_login_url";
    String SP_PHP_MY_DYNAMICS_URL = "php_my_dynamics_url";
    String ARTICLE_IS_SHOW_TRUE = "1";
    String SP_MEMBER_NICK_AVAILABLE = "member_nick_available";
    String MEMBER_NICK_AVAILABLE_TURE = "1";

    // 1.7.0 添加
    String BROADCAST_LIST_TYPE = "broad_cast_list_type";
    String SP_AD_PAGE_DATA_JSON = "ad_page_data_json";
    String SP_NEED_SHOW_MY_LIKE_GUIDE = "need_show_my_like_guide";
    String SP_AD_LAST_SHOW_DATE = "ad_last_show_date";
    //友盟统计
    String PAGE_NAME_USE_REDEEM_CODE = "UseRedeemCode";
    String PAGE_NAME_RADIO_STATION = "RadioStation";

    String OpenAnAudioInRadioStation = "OpenAnAudioInRadioStation";//从磨耳朵打开一本书
    String RADIO_NAME = "电台名称";
    String TapFinishButtonWhenTimed = "TapFinishButtonWhenTimed";//全局定时点击“完成”
    String TIMED_STATE = "定时状态";
    String TapLoopModeButton = "TapLoopModeButton";//点击切换循环模式
    String TapLikeButtonInPlayer = "TapLikeButtonInPlayer";//播放器中"喜欢"
    String TapDislikeButtonInPlayer = "TapDislikeButtonInPlayer";//播放器中"不喜欢"
    String OpenMyFavoriteSongSheet = "OpenMyFavoriteSongSheet";//打开"我喜欢的"列表

    // 1.9.0 添加
    String IF_MORE = "1";
    String IF_MORE_NOT = "0";

    //页面统计
    String PAGE_NAME_21TH_ACTIVITY = "21thActivity";
    String PAGE_NAME_COURSE_PACKAGE_DETAIL = "CoursePackageDetail";
    String PAGE_NAME_COURSE_DETAIL = "CourseDetail";
    String PAGE_NAME_CLASSROOM = "Classroom";

    //1.9.0
    String HOME_RECOMMEND_LIST_TYPE_CARTOON = "1";
    String HOME_RECOMMEND_LIST_TYPE_DAD_REC = "2";
    String HOME_RECOMMEND_LIST_TYPE_DAD_AUDIO_THIRD = "3";
    String HOME_RECOMMEND_LIST_TYPE_NEWEST_AUDIO = "4";


    String HOME_ITEM_TYPE_CARTOON = "1";
    String HOME_ITEM_TYPE_ALBUM = "2";
    String HOME_ITEM_TYPE_AUDIO = "3";

    // Crashlytics相关
    String CRASHLYTICS_LYRIC_EXCEPTION = "crashlytics_lyric_exception";

    // 1.9.0 添加
    String EXTRA_TITLE = "extra_title";
    String EXTRA_ID = "extra_id";
    String EXTRA_TYPE_ID = "extra_type_id";
    String EXTRA_OBJECT = "extra_object";
    String EXTRA_LIST = "extra_list";
    String EXTRA_TYPE = "extra_type";
    String EXTRA_POSITION = "extra_position";
    String EXTRA_ENTER_VERBATIM = "extra_enter_verbatim";

    //1.9.1添加
    String PAGE_TYPE_OTHER_URL = "page_type_other_url";
    String PAGE_TYPE_BBS_URL = "page_type_bbs_url";

    String HAS_DETAIL = "1";
    String PATH_INTERNAL_VIDEO_CACHE = PATH_INTERNAL_APP_FILE + "/Video/Cache";
    String VIDEO_AVAILABLE_PLAY_FALSE = "0";
    String VIDEO_AVAILABLE_PLAY_TRUE = "1";
    //页面统计
    String PAGE_NAME_ALBUM_DETAIL = "AlbumDetail";
    String PAGE_NAME_VIDEO_PLAYER = "VideoPlayer";
    String PAGE_NAME_MORE_RECOMMENDATIONS = "MoreRecommendations";
    String PAGE_NAME_ALL_VIDEO = "AllVideo";
    //事件统计

    String TapIntroButtonInAlbumDetail = "TapintroButtonInAlbumDetail";
    String TapMusicListButtonInAlbumDetail = "TapMusicListButtonInAlbumDetail";
    String TapPlayAllButtonInAlbumDetail = "TapPlayAllButtonInAlbumDetail";
    String TapBuyBooksButtonInAlbumDetail = "TapBuyBooksButtonInAlbumDetail";
    String TapFullScreenButtonInVideoPlayer = "TapFullScreenButtonInVideoPlayer";
    String TapDetailButtonInPlayer = "TapDetailButtonInPlayer";
    String TapOriginalAlbumButtonInPlayer = "TapOriginalAlbumButtonInPlayer";
    String TapRelatedPicbooksButtonInPlayer = "TapRelatedPicbooksButtonInPlayer";


    //1.10.0 添加
    String STAT_TYPE_AUDIO = "1";
    String STAT_TYPE_CARTOON = "2";
    //页面统计
    String PAGE_NAME_MICRO_PAGE = "MicroPage";
    //事件统计
    String OPEN_MEMBER_GOODS = "OpenMemberGoods";
    String CHOOSE_CATEGORY_IN_KIDS = "ChooseCategoryInKids";
    String OPEN_AN_ALBUM = "OpenAnAlbum";
    String OPEN_A_CARTOON = "OpenACartoon";
    String NAME = "名称";
    String TapMoreButtonInKids = "TapMoreButtonInKids";
    String DownAnAudio = "DownAnAudio";
    String LikeAnAudio = "LikeAnAudio";
    String DisLikeAnAudio = "DisLikeAnAudio";
    String ShareAnAudio = "ShareAnAudio";
    String ShareAnAlbum = "ShareAnAlbum";
    String TapCommentButton = "TapCommentButton";
    String EnterAudioDetail = "EnterAudioDetail";
    String EnterExclusiveAlbum = "EnterExclusiveAlbum";
    // TODO: 2017/11/2 这个点先不埋
    String TapRelatedPicbooksButtonInAlbumDetail = "TapRelatedPicbooksButtonInAlbumDetail";
    String TapBootPageAD = "TapBootPageAD";
    String TapSkipButtonInBootPage = "TapSkipButtonInBootPage";
    String OPEN_A_SOUND   = "OpenASound";
}
