package cforcustomer.lovesheep.com.basenetdemo.global;


public interface RTConstants {
    String URL_BASE =  "http://dev.exploiter.ivydad.com.cn";
    String URL_JSON_API = URL_BASE + "/jsonapi";

    // 1.6.0 社区添加
    String URL_PHP_BASE = "http://dev.api.sns.ivydad.com";
    String URL_PHP_JSON_API = URL_PHP_BASE + "/api";

    //阳光的测试接口,用完改回来
//	String URL_JSON_API = "http://192.168.1.222:10086";

    // 亲子时光相关接口
    String API_FAMILY_GET_MY_BOOK_COUNT = "api_family_getMyBookCount";
    String API_FAMILY_GET_HOME_LIST = "api_family_getHomeList";
    String API_FAMILY_GET_CATE_ALL_SUB_CLASS = "api_family_getCateAllSubClass";
    String API_FAMILY_GET_REC_LIST = "api_family_getRecList";
    String API_FAMILY_GET_BOOK_INFO = "api_family_getBookInfo";
    String API_FAMILY_GET_MY_BOOK_LIST = "api_family_getMyBookList";
    String API_FAMILY_GET_DEFAULT_SLEEP_INFO = "api_family_getDefaultSleepInfo";
    String URL_FAMILY_MY_BOOK_COUNT = URL_JSON_API + "/" +
            API_FAMILY_GET_MY_BOOK_COUNT;

    String URL_FAMILY_BOOK_INFO = URL_JSON_API + "/" + API_FAMILY_GET_BOOK_INFO;

    //注册登录相关接口
    String API_IS_PHONE_REGISTER = "api_isPhoneRegister";
    String API_GET_VERIFICATION_CODE = "api_getVerificationCode";
    String API_REGISTER = "api_register";
    String API_LOGIN_MANUAL = "api_loginManual";
    String API_LOGIN_AUTO = "api_loginAuto";
    String API_LOGOUT = "api_logout";
    String API_GET_MEMBER_INFO = "api_getMemberInfo";
    String API_UPDATE_MEMBER_INFO = "api_updateMemberInfo";
    String API_UPDATE_PWD = "api_updatePwd";
    String API_UPDATE_PHONE_NO = "api_updatePhoneNo";
    String API_FORGET_PWD = "api_forgetPwd";
    String API_UPLOAD_AVATAR = "api_uploadAvatar";
    String UPLOADER_UPLOAD_AVATAR = "uploader/api_uploadAvatar";

    String URL_IS_PHONE_REGISTER = URL_JSON_API + "/" + API_IS_PHONE_REGISTER;
    String URL_GET_VERIFICATION_CODE = URL_JSON_API + "/" + API_GET_VERIFICATION_CODE;
    String URL_REGISTER = URL_JSON_API + "/" + API_REGISTER;
    String URL_LOGIN_MANUAL = URL_JSON_API + "/" + API_LOGIN_MANUAL;
    String URL_LOGIN_AUTO = URL_JSON_API + "/" + API_LOGIN_AUTO;
    String URL_LOGOUT = URL_JSON_API + "/" + API_LOGOUT;
    String URL_GET_MEMBER_INFO = URL_JSON_API + "/" + API_GET_MEMBER_INFO;
    String URL_UPDATE_MEMBER_INFO = URL_JSON_API + "/" + API_UPDATE_MEMBER_INFO;
    String URL_UPDATE_PWD = URL_JSON_API + "/" + API_UPDATE_PWD;
    String URL_UPDATE_PHONE_NO = URL_JSON_API + "/" + API_UPDATE_PHONE_NO;
    String URL_FORGET_PWD = URL_JSON_API + "/" + API_FORGET_PWD;
    //	String URL_UPLOAD_AVATAR = URL_JSON_API+"/"+ API_UPLOAD_AVATAR;
    //更改新的头像上传接口
    String URL_UPLOAD_AVATAR = URL_BASE + "/" + UPLOADER_UPLOAD_AVATAR;

    //微讲座相关接口添加
    String API_LEC_GET_SLIDE_LIST = "api_lec_getSlideList";
    String API_LEC_GET_CATEGORY_LIST = "api_lec_getCategoryList";
    String API_LEC_GET_LIVE_LEC_LIST = "api_lec_getLiveLecList";
    String API_LEC_GET_PASS_LEC_LIST = "api_lec_getPassLecList";
    String API_GET_LIVE_MORE_LEC_LIST = "api_getLiveMoreLecList";
    String API_LEC_GET_CATEGORY_DETAIL_LIST = "api_lec_getCategoryDetailList";
    String API_LEC_GET_MY_LEC_LIST = "api_lec_getMyLecList";
    String API_LEC_GET_LEC_DETAIL = "api_lec_getLecDetail";
    String API_LEC_POST_APPLY = "api_lec_postApply";
    String API_LEC_GET_HOME_LIST = "api_lec_getHomeList";
    String API_LEC_GET_ROOM_URL = "api_lec_getRoomUrl";
    String LECTURE_SHARE = "lecture/share";


    String URL_LEC_GET_PASS_LEC_LIST = URL_JSON_API + "/" + API_LEC_GET_PASS_LEC_LIST;
    String URL_GET_LIVE_MORE_LEC_LIST = URL_JSON_API + "/" + API_GET_LIVE_MORE_LEC_LIST;
    String URL_LEC_GET_CATEGORY_DETAIL_LIST = URL_JSON_API + "/" + API_LEC_GET_CATEGORY_DETAIL_LIST;
    String URL_LEC_GET_MY_LEC_LIST = URL_JSON_API + "/" + API_LEC_GET_MY_LEC_LIST;
    String URL_LEC_GET_LEC_DETAIL = URL_JSON_API + "/" + API_LEC_GET_LEC_DETAIL;
    String URL_LEC_POST_APPLY = URL_JSON_API + "/" + API_LEC_POST_APPLY;
    String URL_LEC_GET_HOME_LIST = URL_JSON_API + "/" + API_LEC_GET_HOME_LIST;
    String URL_LEC_GET_ROOM_URL = URL_JSON_API + "/" + API_LEC_GET_ROOM_URL;
    String URL_LECTURE_SHARE = URL_BASE + "/" + LECTURE_SHARE;

    //0.15.0新增接口.
    String API_GET_PHONE_PERMISSION_STATE = "api_getPhonePermissionState";
    String API_GET_PHONE_NUM_PERMISSION = "api_getPhoneNumPermission";

    String URL_GET_PHONE_PERMISSION_STATE = URL_JSON_API + "/" + API_GET_PHONE_PERMISSION_STATE;
    String URL_GET_PHONE_NUM_PERMISSION = URL_JSON_API + "/" + API_GET_PHONE_NUM_PERMISSION;


    //0.16.0新增接口
    String API_GET_COUPON = "api_getCoupon";
    String API_COUPON_CLICKED = "api_CouponClicked";
    String API_GET_COUPON_NOTE = "api_getCouponNote";
    String API_COUPON_NOTE_IS_SHOW = "api_couponNoteIsShow";
    String API_GET_APP_ERROR = "api_getAppError";

    String URL_GET_COUPON = URL_JSON_API + "/" + API_GET_COUPON;
    String URL_COUPON_CLICKED = URL_JSON_API + "/" + API_COUPON_CLICKED;
    String URL_GET_COUPON_NOTE = URL_JSON_API + "/" + API_GET_COUPON_NOTE;
    String URL_COUPON_NOTE_IS_SHOW = URL_JSON_API + "/" + API_COUPON_NOTE_IS_SHOW;
    String URL_GET_APP_ERROR = URL_JSON_API + "/" + API_GET_APP_ERROR;

    //0.17.0新增接口
    String API_GET_MY_MEMBER_TYPE_DETAILS = "api_getMyMemberTypeDetails";
    String API_CHECKOUT_APP_TO_UPDATE = "api_checkoutAppToUpdate";
    String API_GET_INFO_AFTER_LOGIN = "api_getInfoAfterLogin";
    String API_FAMILY_GET_HOME_LIST_V2 = "api_family_getHomeList_v2";

    String URL_GET_MY_MEMBER_TYPE_DETAILS = URL_JSON_API + "/" + API_GET_MY_MEMBER_TYPE_DETAILS;
    String URL_CHECKOUT_APP_TO_UPDATE = URL_JSON_API + "/" + API_CHECKOUT_APP_TO_UPDATE;
    String URL_GET_INFO_AFTER_LOGIN = URL_JSON_API + "/" + API_GET_INFO_AFTER_LOGIN;


    // 1.1.0相关接口
    String API_SCHOOL_GET_PARENTING_ENCYCLOPEDIA_LIST = "api_school_getParentingEncyclopediaList";
    String API_SCHOOL_GET_PASS_LEC_LIST = "api_school_getPassLecList";
    String API_GET_WEIXIN_USER_INFO = "api_getWeixinUserInfo";
    String API_WEIXIN_LOGIN = "api_weixin_login";
    String API_UPDATE_PHONE_V2 = "api_updatePhone_v2";
    String API_SCHOOL_GET_SUBCLASS = "api_school_getSubClass";
    String API_SCHOOL_GET_ARTICLE_LIST = "api_school_getArticleList";
    String API_SCHOOL_GET_SPECIAL_LIST = "api_school_getSpecialList";
    String API_BIND_SNS_ACCOUNT = "api_bind_snsaccount";

    String URL_SCHOOL_GET_PARENTING_ENCYCLOPEDIA_LIST = URL_JSON_API + "/" + API_SCHOOL_GET_PARENTING_ENCYCLOPEDIA_LIST;
    String URL_SCHOOL_GET_PASS_LEC_LIST = URL_JSON_API + "/" + API_SCHOOL_GET_PASS_LEC_LIST;
    String URL_GET_WEIXIN_USER_INFO = URL_JSON_API + "/" + API_GET_WEIXIN_USER_INFO;
    String URL_WEIXIN_LOGIN = URL_JSON_API + "/" + API_WEIXIN_LOGIN;
    String URL_UPDATE_PHONE_V2 = URL_JSON_API + "/" + API_UPDATE_PHONE_V2;
    String URL_SCHOOL_GET_SUBCLASS = URL_JSON_API + "/" + API_SCHOOL_GET_SUBCLASS;
    String URL_SCHOOL_GET_ARTICLE_LIST = URL_JSON_API + "/" + API_SCHOOL_GET_ARTICLE_LIST;
    String URL_SCHOOL_GET_SPECIAL_LIST = URL_JSON_API + "/" + API_SCHOOL_GET_SPECIAL_LIST;
    String URL_BIND_SNS_ACCOUNT = URL_JSON_API + "/" + API_BIND_SNS_ACCOUNT;

    //微信获取
    String URL_WX_GET_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token";
    String URL_WX_GET_REFRESH_TOKEN = "https://api.weixin.qq.com/sns/oauth2/refresh_token";
    String URL_WX_GET_ACCESS_TOKEN_AVAILABLE = "https://api.weixin.qq.com/sns/auth";
    String URL_WX_GET_USER_INFO = "https://api.weixin.qq.com/sns/userinfo";

    //v1.3.0新增接口
    String API_GET_AREA_CODE_DATA = "api_getAreaCodeData";

    String URL_GET_AREA_CODE_DATA = URL_JSON_API + "/" + API_GET_AREA_CODE_DATA;

    //v1.3.2新增接口
    String API_FAMILY_GET_BOOK_INFO_BY_ISBN = "api_family_getInfoByISBN";
    String API_FAMILY_GET_BOOK_LIST_BY_TYPE = "api_family_getBookListByType";
    String URL_FAMILY_GET_BOOK_INFO_BY_ISBN = URL_JSON_API + "/" + API_FAMILY_GET_BOOK_INFO_BY_ISBN;
    String API_FAMILY_GET_HOME_LIST_V3 = "api_family_getHomeList_v3";

    //v1.3.2更改接口
    String API_FAMILY_GET_BOOK_INFO_V2 = "api_family_getBookInfo_v2";
    String API_FAMILY_GET_MY_BOOK_LIST_V2 = "api_family_getMyBookList_v2";
    String API_FAMILY_GET_DEFAULT_SLEEP_INFO_V2 = "api_family_getDefaultSleepInfo_v2";

    //v1.3.3新增接口
    String API_AUDIO_LIST_CHECK_VERSION = "api_audiolist_checkVersion";
    String API_AUDIO_LIST_SYNC = "api_audiolist_sync";
    String API_AUDIO_LIST_GET = "api_audiolist_get";
    String API_AUDIO_LIST_ADD = "api_audiolist_add";
    String API_AUDIO_LIST_DELETE = "api_audiolist_delete";
    String API_AUDIO_LIST_UPDATE_ORDER = "api_audiolist_updateOrder";

    //v1.5.0新增
    String API_SCHOOL_PUNCH_CARD = "api_school_punchCard";
    String API_SCHOOL_GET_LESSON_PACK_LIST = "api_school_getLessonPackList";
    String API_SCHOOL_GET_LESSON_LIST = "api_school_getLessonList";
    String API_SCHOOL_GET_LESSON_DETAIL = "api_school_getLessonDetail";
    String API_SCHOOL_NOTIFY_LESSON_FINISHED = "api_school_notifyLessonFinished";

    String URL_SCHOOL_PUNCH_CARD = URL_JSON_API + "/" + API_SCHOOL_PUNCH_CARD;
    String URL_SCHOOL_GET_LESSON_PACK_LIST = URL_JSON_API + "/" + API_SCHOOL_GET_LESSON_PACK_LIST;
    String URL_SCHOOL_GET_LESSON_LIST = URL_JSON_API + "/" + API_SCHOOL_GET_LESSON_LIST;
    String URL_SCHOOL_GET_LESSON_DETAIL = URL_JSON_API + "/" + API_SCHOOL_GET_LESSON_DETAIL;
    String URL_SCHOOL_NOTIFY_LESSON_FINISHED = URL_JSON_API + "/" + API_SCHOOL_NOTIFY_LESSON_FINISHED;
    //使用兑换码接口
    String API_USE_REDEEM_CODE = "api_useRedeemCode";
    String URL_USE_REDEEM_CODE = URL_JSON_API + "/" + API_USE_REDEEM_CODE;


    //v1.6.0新增
    String API_SCHOOL_GET_ARTICLE_LIST_V2 = "api_school_getArticleList_v2";
    String URL_SCHOOL_GET_ARTICLE_LIST_V2 = URL_JSON_API + "/" + API_SCHOOL_GET_ARTICLE_LIST_V2;
    String API_UPLOADER_UPLOAD_SUBJECT = "uploader/api_uploadSubject";
    String URL_UPLOADER_UPLOAD_SUBJECT = URL_BASE + "/" + API_UPLOADER_UPLOAD_SUBJECT;
    String API_PHP_WEIBO = "weibo";
    String URL_PHP_WEIBO = URL_PHP_JSON_API + "/" + API_PHP_WEIBO;
    String API_PHP_FRIENDS = "friends";
    String URL_PHP_FRIENDS = URL_PHP_JSON_API + "/" + API_PHP_FRIENDS;
    String API_PHP_IVY_TOPIC = "ivy_topic";
    String URL_PHP_IVY_TOPIC = URL_PHP_JSON_API + "/" + API_PHP_IVY_TOPIC;
    String API_PHP_IVY_COUNT_INFO = "ivy_count_info";//我的动态数量获取.
    String URL_PHP_IVY_COUNT_INFO = URL_PHP_JSON_API + "/" + API_PHP_IVY_COUNT_INFO;
    String API_PHP_WEIBO_COMMENT = "weibo_comment";//我的动态数量获取.
    String URL_PHP_WEIBO_COMMENT = URL_PHP_JSON_API + "/" + API_PHP_WEIBO_COMMENT;
    String API_PHP_SHARE = "ivy_share";//我的动态数量获取.
    String URL_PHP_SHARE = URL_PHP_JSON_API + "/" + API_PHP_SHARE;
    // 获取音频/书籍评论数量
    String API_PHP_IVY_COUNT_WEIBO = "ivy_count_weibo";//我的动态数量获取.
    String URL_PHP_IVY_COUNT_WEIBO = URL_PHP_JSON_API + "/" + API_PHP_IVY_COUNT_WEIBO;
    //
    String API_PHP_IVY_LGRG = "ivy_lgrg";//我的动态数量获取.
    String URL_PHP_IVY_LGRG = URL_PHP_JSON_API + "/" + API_PHP_IVY_LGRG;

    //v1.7.0新增
    String API_RADIO_GET_HOME_DATA = "api_radio_getHomeData";
    String URL_RADIO_GET_HOME_DATA = URL_JSON_API + "/" + API_RADIO_GET_HOME_DATA;
    String API_RADIO_GET_SONG_LIST_BY_ID = "api_radio_getSongListByID";

    //v1.9.0新增
    String API_FAMILY_GET_HOME_LIST_V4 = "api_family_getHomeList_v4";
    String URL_FAMILY_GET_HOME_LIST_V4 = URL_JSON_API + "/" + API_FAMILY_GET_HOME_LIST_V4;
    String API_FAMILY_GET_CARTOON_DETAIL = "api_family_getCartoonDetail";
    String URL_FAMILY_GET_CARTOON_DETAIL = URL_JSON_API + "/" + API_FAMILY_GET_CARTOON_DETAIL;

    String API_FAMILY_GET_AUDIO_INFO = "api_family_getAudioInfo";
    String API_FAMILY_GET_AUDIO_PERMISSION = "api_family_getAudioPermission";
    String API_FAMILY_GET_AUDIO_DETAIL = "api_family_getAudioDetail";

    String API_FAMILY_GET_ALBUM_DETAIL = "api_family_getAlbumDetail";
    String API_FAMILY_GET_ALL_ALBUM_BY_TYPE = "api_family_getAllAlbumByType";
    String API_FAMILY_GET_AUDIO_AND_ALBUM_BY_TYPE = "api_family_getAudioAndAlbumByType";
    String API_FAMILY_GET_AUDIO_CATEGORY_SUB_CLASS_LIST = "api_family_getAudioCategorySubClassList";
    String API_FAMILY_GET_MY_AUDIO_SUB_CLASS_LIST = "api_family_getMyAudioSubClassList";
    String API_FAMILY_GET_MY_AUDIO_LIST = "api_family_getMyAudioList";
    String API_FAMILY_GET_LATEST_AUDIO_LIST = "api_family_getLatestAudioList";
    String API_PLAY_LIST_SLEEP_DEFAULT = "api_play_list_getSleepDefault";
    String API_PLAY_LIST_CONVERT = "api_play_list_convert";
    String API_PLAY_LIST_SYNC = "api_play_list_sync";
    String API_PLAY_LIST_GET = "api_play_list_get";
    String API_PLAY_LIST_CHECK_VERSION = "api_play_list_checkVersion";
    String API_PLAY_LIST_ADD = "api_play_list_add";
    String API_PLAY_LIST_DELETE = "api_play_list_delete";
    String API_PLAY_LIST_ORDER = "api_play_list_order";
    String API_RADIO_GET_AUDIO_LIST = "api_radio_getAudioList";

    String API_FAMILY_GET_CARTOON_LIST = "api_family_getCartoonList";


    //v1.9.1新增
    String API_GET_MEMBER_RENEW_NOTIFY = "api_getMemberRenewNotify";
    String API_FAMILY_GET_ACTIVITY_INFO = "api_family_getActivityInfo";

    //v1.10.0新增
    String API_FAMILY_GET_HOME_LIST_V5 = "api_family_getHomeList_v5";
    String API_FAMILY_CATEGORY_LIST = "api_family_category_list";
    String API_FREE_CHOICE_LIST = "api_free_choice_list";
    String API_FAMILY_GET_PURCHASED_AUDIO = "api_family_getPurchasedAudio";
    String API_FAMILY_GET_CATEGORY_LIST = "api_family_getCategoryList";
    String API_FAMILY_GET_FREE_CHOICE_LIST = "api_family_getFreeChoiceList";
    String API_FAMILY_GET_MICRO_PAGE_LIST = "api_family_getMicroPageList";
    String API_FAMILY_GET_AUDIO_PERMISSION_AND_ALBUM = "api_family_getAudioPermissionAndAlbum";
    String API_STAT_PLAY_COUNT = "api_statPlayCount";

    //v1.10.0新增 PHP相关
    String IVY_PUSH_SETTING = "ivy_push_setting";

    //免责声明

    //用户帮助的的URL
//	String URL_USER_HELP_FEED_BACK = URL_BASE + "/appView/feedback.html";


    String DISCLAIMER_SUFFIX = "/disclaimer.html";
    String DISCLAIMER_URL = URL_BASE + DISCLAIMER_SUFFIX;

    // ---------------------------------------------------------------

    // 老接口测试地址
//	String BASE_URL = "http://beta.ivydad.com.cn";
//	String BASE_URL = "http://manager.ivydad.com";
    // 老接口正式地址
    String BASE_URL = "http://service.ivydad.com";

    String URL = BASE_URL + "/ivydad/phoneService";
    String URL_DISCLAIMER = BASE_URL + "/ivydad/notice";
    String URL_SHARE_RECORD = BASE_URL + "/app/signPage";
    String URL_SHARE_BOOK = BASE_URL + "/app/bookPage?bookId=";

    String WEIXIN_APP_ID = "wx0e2dec5e762806fd";
    String WEIXIN_APP_SECRET = "5f4493a82e953c8c23b251c19f043206";
    String WEIXIN_GRANT_TYPE_AUTHORIZATION_CODE = "authorization_code";
    String WEIXIN_GRANT_TYPE_REFRESH_TOKEN = "refresh_token";

    String TINGYUN_APPKEY = "d6a430139f0f46358862dd9f68dc2119";
    String SEX_MAIL = "01";
    String SEX_FEMAIL = "02";
    String DATE_ERROR = "获取数据失败";

    long NETWORK_TIMEOUT = 20 * 1000;
    String NO_PAY_REMINDER =
            "您还没有加入“常青藤爸爸英语俱乐部”，加入后将为您开通音频权限。请在“常青藤爸爸”微信公众号输入“俱乐部”查看成为俱乐部会员的方法。";
    String LECTURE_APPLY_NUMBER = "15";
    String LECTURE_QUERY_TYPE_OVER = "1";
    String LECTURE_QUERY_TYPE_NOT_OVER = "0";

    //头像上传请求头参数
    String CONTENT_TYPE = "Content-Type";
    String CONTENT_TYPE_MULTIPART_FORM_DATA = "multipart/form-data";

    String RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDHoHxhIGmHcp7U0FgHZVWE7eXLeL1SyIr3TAzQLpZsHacDYqHozZQAPyezAzquwRTE0KXoj8jj4bJstj77COH1mZjlYCcqpNSy4IW5vyTanQvhy2CeR1/VQAC3VSYeTv3+rO/iB3pnS9JKBuGE7qv1jHWRAiA0ZTtpFb+iI8D//wIDAQAB";
}
