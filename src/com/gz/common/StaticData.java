package com.gz.common;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class StaticData {
	public static final String FAILER = "failer";  //失败标识位
	public static final String SUCCESS = "success";  //成功标识位
	public static final SimpleDateFormat YMD_FORMAT = new SimpleDateFormat("yyyy-MM-dd"); //格式化当前系统日期
	public static final SimpleDateFormat YMDHMS_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //格式化当前系统日期
	public static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("0"); //数字格式化
	
	
	public static Map<String, String> DESCR_USER_KEY_MAP = new HashMap<String, String>();
	static {
		DESCR_USER_KEY_MAP.put("USERID", "USERID");
		DESCR_USER_KEY_MAP.put("userId", "userId");
		DESCR_USER_KEY_MAP.put("userid", "userid");
		DESCR_USER_KEY_MAP.put("ur_USERID", "ur_USERID");
		DESCR_USER_KEY_MAP.put("create_user_id", "create_user_id");
		DESCR_USER_KEY_MAP.put("update_user_id", "update_user_id");
	};
	
}
