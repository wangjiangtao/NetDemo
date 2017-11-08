package cforcustomer.lovesheep.com.basenetdemo.util;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cforcustomer.lovesheep.com.basenetdemo.exception.RTException;
import cforcustomer.lovesheep.com.basenetdemo.global.RTConstants;

public class JsonUtils {

	/**
	 * Map转换为json
	 * @param map
	 * @return
	 * @throws RTException
	 */
	public static String simpleMapToJsonStr(Map<String, String> map) {
		String jsonStr = "{";
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			jsonStr += "\"" + key + "\":\"" + map.get(key) + "\",";
		}
		jsonStr = jsonStr.substring(0, jsonStr.length() - 1);
		jsonStr += "}";
		return jsonStr;
	}

	/**
	 * json转换为Bean
	 * @param jsonString
	 * @param cls
	 * @return
	 * @throws RTException
	 */
	public static <T> T getBeanFromJson(String jsonString, Class<T> cls)
			throws RTException {
		T t = null;
		try {
			Gson gson = new Gson();
			t = gson.fromJson(jsonString, cls);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RTException(RTConstants.DATE_ERROR);
		}
		return t;
	}


	/**
	 * Bean转换为json
	 * @param o 要转换的对象
	 * @return
	 * @throws RTException
     */
	public static String getJsonFromBean(Object o)
			throws RTException {
		try {
			Gson gson = new Gson();
			return gson.toJson(o);
		} catch (Exception e) {
			throw new RTException(e.getMessage());
		}
	}

	/**
	 * Bean转换为json
	 * @param o 要转换的对象
	 * @return
	 * @throws RTException
	 */
	public static String getJsonFromBeanNotNull(Object o)
			throws RTException {
		try {
			Gson gson = new GsonBuilder().serializeNulls().create();
			String json = gson.toJson(o);
			Type type = new TypeToken<Map<String, Object>>() {}.getType();
			Map<String, Object> map = gson.fromJson(json, type);
            List<String> nullList = new ArrayList<>();
			Set<String> keySet = map.keySet();
			Iterator<String> iterator = keySet.iterator();
			while (iterator.hasNext()){
				String key = iterator.next();
				if (map.get(key) == null){
                    nullList.add(key);
				}
			}
            for (String key : nullList) {
                map.remove(key);
            }
            if (map.size() == 0)
            	return "";
            return gson.toJson(map);
		} catch (Exception e) {
			throw new RTException(e.getMessage());
		}
	}

	public static Set<String> getSetFromJson(String json)
			throws RTException {
		try {
			Gson gson = new Gson();
			return gson.fromJson(json,new TypeToken<Set<String>>(){}.getType());
		} catch (Exception e) {
			throw new RTException(e.getMessage());
		}
	}

	public static <T> List<T> getListFromJson(String json, Class<T> typeOfT) throws RTException{
		try {
			JsonArray jsonArray = new JsonParser().parse(json).getAsJsonArray();
			Gson gson = new Gson();
			List<T> tList = new ArrayList<>();

			//循环遍历
			for (JsonElement str : jsonArray) {
				//通过反射 得到UserBean.class
				T t = gson.fromJson(str.toString(),typeOfT);
				tList.add(t);
			}
			return tList;
		} catch (Exception e) {
			throw new RTException(e.getMessage());
		}

	}

	/**
	 * 获取Json字符串的属性的通用方法.
	 * @param json
	 * @param attr
	 * @return
	 * @throws RTException
	 */
	public static String getJsonObjAttr(String json, String attr) throws RTException{
		try {
			return new JSONObject(json).get(attr).toString();
		}catch (Exception e){
			Log.e(JsonUtils.class.getSimpleName(), e.getMessage());
			throw new RTException(e.getMessage());
		}
	}

}
