package cforcustomer.lovesheep.com.basenetdemo.global;

public interface JsonConstants {

	String PARAMS = "params";
	String INFO_NO = "inf_no";
	String JPUSH_TAG = "jpush_tag";
	String PHONE_NO = "phone_no";
	String IMEI = "imei";
	String LOGIN_SYS = "login_sys";
	String LOGIN_SYS_VERSION = "login_sys_version";
	String LOGIN_SYS_ANDRIOD = "android";
	String PASSWORD = "password";
	String OLD_PASSWORD = "old_password";
	@Deprecated
    String NEW_PASSWORD = "new_password";
	String RESULT = "result";
	String RESULT_INFO = "result_info";
	String USER_ID = "user_id";
	String TOKEN = "token";
	String VERIFICATION_CODE = "verification_code";
	String PROVINCE_CODE = "province_code";
	String CITY_CODE = "city_code";
	String BABY_NICK = "baby_nick";
	String BABY_BIRTHDAY = "baby_birthday";
	String BABY_SEX = "baby_sex";
	String REQUEST_TYPE = "request_type";
	String BOOK_ID = "book_id";
	String PAGE = "page";
	String ROW = "row";
	String GUEST = "GUEST";
	String DISCUSS_CONTENT = "discuss_content";
	String DISCUSS_TAG = "discuss_tag";
	String ZAN = "zan";
	String READ_ENGLISH_TIME = "readEnglishTime";
	String READ_CHINESE_TIME = "readChineseTime";
	String MESSAGE_ID = "message_id";
	String VERSION = "version";
	String MODEL = "model";
	String TIP_CODE = "tip_code";
	String USER_SEX ="user_sex";
	String USER_NICK ="user_nick";

	// 2016.4.20 开始使用新接口添加
	String MODEL_FLAG = "model_flag";
	String CACHE_PREFIX = "cache_prefix";
	String STAGE_TYPE_CODE = "stage_type_code";
	String BOOK_SERIES_ID = "book_series_id";
	String AUDIO_TYPE = "audio_type";
	String SHOW_NUMBER = "show_number";
	String BOOK_IS_FREE = "1";
	String BOOK_NOT_FREE = "0";
	String MODEL_SLEEPING = "00";


	// 亲子时光需要字段
	String FAMILY_CAT_ID = "cat_id";
	String TYPE_ID = "type_id";
	String FAMILY_BOOK_ID = "book_id";
	String FAMILY_BOOK_AVAILABLE_PLAY = "available_play";
	String IS_CONTAIN_FREE = "is_contain_free";

	//微讲座新添加的字段
	String LAST_LEC_ID = "last_lec_id";
	String PAGE_SIZE = "page_size";
	String CAT_ID = "cat_id";
	String LEC_STATE = "lec_state";
	String LEC_STATE_LIVE = "0";
	String LEC_STATE_ABOUT_BEGIN = "1";
	String LEC_STATE_PASS = "2";
	String LEC_QUERY_TYPE = "query_type";
	String LEC_ID = "lec_id";
	String LEC_IS_SHARE = "is_share";
	String LEC_IS_ENROLL = "is_enroll";
	String LEC_IS_ADD = "is_add";
	String LEC_PLAY_HTML = "lec_play_url";
	// 多贝云请求进入房间相关字段
	String LEC_DUOBEIYUN_PARTNER = "partner";
	String LEC_DUOBEIYUN_SIGN = "sign";
	String LEC_DUOBEIYUN_TIMESTAMP= "timestamp";
	String LEC_DUOBEIYUN_UID = "uid";
	String LEC_DUOBEIYUN_ROOMID = "roomId";
	String LEC_DUOBEIYUN_NICKNAME = "nickname";
	String LEC_DUOBEIYUN_USERROLE = "userRole";

	//新注册登录添加字段
	String DEVICE_ID = "device_id";
	String PHONE_NO_ENCRYP = "phone_no_encryp";
	String DEVICE_NAME = "device_name";
	String MEMBER_TYPE = "member_type";
	String MEMBER_TYPE_GUEST = "0";
	String MEMBER_TYPE_MEMBER = "1";
	String MEMBER_TYPE_WX_REGISTER = "2";
	String MEMBER_UUID = "member_uuid";
	String PHONE_NUMBER_REGISTED = "1";
	String PHONE_NUMBER_UN_REGISTED = "0";
	String PHONE_NUMBER_BIND_WX_NO_PWD = "2";
	String MEMBER_NICK = "member_nick";
	String MEMBER_SEX = "member_sex";
	String VERIFICATION_TYPE = "verification_type";
	String VERIFICATION_TYPE_REGISTER = "register";
	String VERIFICATION_TYPE_FORGET_PWD = "forget_pwd";
	String VERIFICATION_TYPE_UPDATE_PHONE_NO = "update_phone_no";
	String VERIFICATION_TYPE_GET_PERMISSION = "get_permission";
	String IS_UERS_ACTION = "is_uers_action";
	String IS_UERS_ACTION_FALSE = "0";
	String IS_UERS_ACTION_TRUE = "1";
	String FREE_USER = "1";
	String PREMIUM_USER = "2";
	String NEW_PWD = "new_pwd";
	String PAGE_NO = "page_no";
	String PAGE_NUMBER = "page_number";

	//用户身份
	String MEMBER_IDENTIFY = "member_identity";

	//0.16.0
	String COUPON_ID = "coupon_id";
	String LONGITUDE = "longitude";
	String LATITUDE = "latitude";

	// 0.17.0即1.0.0
	// 检查更新时的当前构建号
	String CURRENT_VERSION_CODE = "current_version_code";

	String ERROR_VERSION = "error_version";
	String ERROR_CODE = "error_code";
	String SPECIFIC_MESSAGE = "specific_message";
	String PHONE_MODEL = "phone_model";
	String PHONE_SYSTEM = "phone_system";
	String PHONE_SYSTEM_ANDROID = "android";
	String REQUEST_PARAM = "request_param";
	String REQUEST_URL = "request_url";

	// 1.1.0
	String PARENTING_CAT_2_ID = "cat_2_id";
	String PARENTING_CAT_3_ID = "cat_3_id";
	String PARENTING_CAT_4_ID = "cat_4_id";
	String PARENTING_CURRENT_NO = "current_no";

	String VERIFICATION_TYPE_BIND_WEIXIN = "bind_weixin";
	String VERIFICATION_TYPE_BIND_WEIXIN_UPDATE_PWD = "bind_weixin_update_pwd";

	String SNS_TYPE = "sns_type";
	String SNS_TYPE_WEIXIN = "1";
	String SNS_TYPE_SINA = "2";
	String SNS_ID = "sns_id";
	String SNS_UNION_ID = "sns_union_id";

	//微信相关
	String WX_OP_APPID = "appid";
	String WX_OP_SECRET = "secret";
	String WX_OP_CODE = "code";
	String WX_OP_GRANT_TYPE = "grant_type";
	String WX_OP_ACCESS_TOKNE = "access_token";
	String WX_OP_OPENID = "openid";

	String WX_OPEN_ID = "wx_open_id";
	String WX_UNION_ID = "wx_union_id";
	String WX_NICK = "wx_nick";
	String WX_HEADIMG_URL = "wx_headimg_url";
	String WX_SEX = "wx_sex";
	String WX_PROVINCE = "wx_province";
	String WX_CITY = "wx_city";
	String WX_COUNTRY = "wx_country";
	String ACCESS_TOKEN = "access_token";
	String REFRESH_TOKEN = "refresh_token";
	String EXPIRES_IN = "expires_in";

	//v1.2.0逐句播放,推送相关.
	String JPUSH_REGISTRATION_ID = "jpush_registration_id";

	String MODEL_PIC_BOOKS = "01";
	String MODEL_GUOXUE = "02";
	// TODO: 2016/4/15 更新版本名称.
	String VERSION_CODE = "1.3.0";

	//v1.3.0区域号添加
	String AREA_CODE = "area_code";
	String AREA_CODE_ID = "area_code_id";

	//v1.3.2版本增加的
	String BOOK_ISBN = "book_isbn";

	//v1.3.3云歌单版本增加
	String ID = "id";
	String TARGET_ID = "target_id";

	//v1.5.0微课增加
	String FINISH_STATE = "finsh_state";
	String FINISH_STATE_DESC = "finsh_state_desc";
	String PACK_TYPE = "pack_type";
	String PACK_ID = "pack_id";
	String CURRENT_NO = "current_no";
	String SHARE_CODE = "share_code";
	String LESSON_PHOTO_URL = "lesson_photo_url";
	String LESSON_TITLE = "lesson_title";
	String LESSON_SHARE_TITLE = "lesson_share_title";
	String LESSON_SHARE_CONTENT = "lesson_share_content";
	String SHARE_MEDIA = "share_media";
	String REDEEM_CODE = "redeem_code";


	// v1.9.0 添加
	String IS_SAVE = "is_save";
	String TYPE = "type";
	String AUDIO_ID = "audio_id";
	String PLAY_LIST = "play_list";
	String PLAY_LIST_VERSION = "play_list_version";
	String BOOK_AUDIO_LIST = "book_audio_list";
	String PLAY_LIST_ITEM_ID = "play_list_item_id";
	String TARGET_PLAY_LIST_ITEM_ID = "target_play_list_item_id";
	String PLAY_ITEM_ID = "play_item_id";

	// v1.9.1 添加
	String IS_CLICK = "is_click";

	String REQUEST_TYPE_REGISTER = "1";
	String REQUEST_TYPE_FORGETPWD = "2";
	String REQUEST_TYPE_MODIFYPNO = "3";

	String RESULT_SUCCESS = "1";
	String RESULT_FAILURE = "0";
	String RESULT_OTHERLOGIN = "-1";
	String ERROR_OTHER_LOGIN = "0x00000026";//账号在另一台设备登录,请重新登录
	String ERROR_TOKEN_OVERDUE= "0x00000002";//token过期
	String ERROR_TOKEN_ERROR= "0x00000002";//token错误
	String ERROR_TOKEN_NULL= "0x00000020";//token为空


	String TIP_ABOUT = "101";
	String TIP_DETAIL = "102";
	String TIP_NOPOWER = "103";

	String INFO_NO_GET_CODE = "201";// 获取验证码
	String INFO_NO_SEND_CODE = "203";// 验证短信验证码
	String INFO_NO_PROVINCE_LIST = "204";// 获取省份列表
	String INFO_NO_CITY_LIST = "205";// 获取城市列表
	String INFO_NO_REGISTER = "206";// 注册
	String INFO_NO_LOGIN = "207";// 登录
	String INFO_NO_CHANGE_PWD = "208";// 修改密码
	String INFO_NO_LOGIN_AUTO = "209";// 自动登录
	String INFO_NO_USER_INFO = "210";// 用户信息
	String INFO_NO_PRODUCT_RECORD = "211";// 购买记录
	String INFO_NO_MODIFY_BABY_NICK = "212";// 修改宝贝昵称
	String INFO_NO_MODIFY_BIRTHDAY = "213";// 修改生日
	String INFO_NO_MODIFY_CITY = "214";// 修改城市
	String INFO_NO_MODIFY_PHONE = "215";// 更换手机号
	String INFO_NO_MODIFY_PWD = "216";// 修改密码
	String INFO_NO_MODIFY_SEX = "217";// 修改宝宝性别
	String INFO_NO_FREE_LIST = "218";// 试听列表
	String INFO_NO_PAID_LIST = "220";// 购买书目
	String INFO_NO_LOGOUT = "221";// 退出
	String INFO_NO_STAGE = "222";// stage列表
	String INFO_NO_BOOK_DETAIL = "223";// 书籍详情
	String INFO_NO_PLAYING_TIME = "224";// 统计播放时长
	String INFO_NO_LOAD_MY_DISCUSS = "225";// 加载个人评论
	String INFO_NO_POST_MY_DISCUSS = "226";// 发表评论对某本书
	String INFO_NO_POST_ZAN = "227";// 对某本图书点赞（取消）
	String INFO_NO_LOAD_DISCUSSES = "229";// 获取某书籍评论列表（按照时间倒排序）
	String INFO_NO_READ_RECORD = "230";// 获得阅读记录
	String INFO_NO_SHARE_RECORD = "233";// 上传打卡记录
	String INFO_NO_RECORD_QUERY = "234";// 打卡记录
	String INFO_NO_GET_NEWS = "236";// 用户消息获取接口
	String INFO_NO_READ_NEWS = "237";// 用户消息已读接口
	String INFO_NO_CLRAR_NEWS = "238";// 用户消息已读接口
	String INFO_NO_TIP = "243";// 提示信息接口
	String INFO_NO_MODIFY_USER_SEX = "244";//修改用户性别
	String INFO_NO_MODIFY_USER_NICK = "245";//修改用户昵称

	String[] CACHE_INFO_NOS = new String[] { INFO_NO_USER_INFO,
			INFO_NO_PRODUCT_RECORD, INFO_NO_STAGE, INFO_NO_FREE_LIST,
			INFO_NO_PAID_LIST, INFO_NO_LOGIN_AUTO,
			INFO_NO_BOOK_DETAIL, INFO_NO_PRODUCT_RECORD, INFO_NO_PROVINCE_LIST,
			INFO_NO_CITY_LIST, INFO_NO_LOAD_MY_DISCUSS, INFO_NO_LOAD_DISCUSSES,INFO_NO_GET_NEWS,INFO_NO_TIP };// 用户缓存接口
	String[] CACHE_FIRST_INFO_NOS = new String[] {};// 缓存优先
	String[] CACHE_AND_NETWORK_INFO_NOS = new String[] {
			INFO_NO_PRODUCT_RECORD, INFO_NO_BOOK_DETAIL, INFO_NO_USER_INFO,
			INFO_NO_PROVINCE_LIST, INFO_NO_CITY_LIST, INFO_NO_LOAD_MY_DISCUSS,INFO_NO_GET_NEWS };// 先缓存再网络请求
	String[] CACHE_PUB_INFO_NOS = new String[] {
			INFO_NO_PROVINCE_LIST, INFO_NO_CITY_LIST };// 公共缓存接口

	String WX_REQ_SCOPE_SNSAPI_USER_INFO = "snsapi_userinfo";
}
