package com.gz.common;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class StaticData {
	public static final String FAILER = "failer";  //ʧ�ܱ�ʶλ
	public static final String SUCCESS = "success";  //�ɹ���ʶλ
	public static final SimpleDateFormat YMD_FORMAT = new SimpleDateFormat("yyyy-MM-dd"); //��ʽ����ǰϵͳ����
	public static final SimpleDateFormat YMDHMS_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //��ʽ����ǰϵͳ����
	public static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("0"); //���ָ�ʽ��
	
	
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