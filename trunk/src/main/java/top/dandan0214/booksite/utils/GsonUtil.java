package top.dandan0214.booksite.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;

/**
 * 
 * @description json或jsonArray反序列化工具类
 *
 * @author YG
 *
 * @version 1.0 YG初始版本2017年7月17日
 */
public class GsonUtil {
	private static Gson gson = new Gson();

	/**
	 * 
	 * @param type
	 *            目标类的类字节码
	 * @param jsonStr
	 *            json字符串
	 * @return 目标类的实例
	 * @throws Exception
	 */
	public static <T> T parseJson(Class<T> type, String jsonStr) throws Exception {
		return gson.fromJson(jsonStr, type);
	}

	/**
	 * 
	 * @param myClass
	 *            目标类的类字节码
	 * @param jsonArrStr
	 *            json数组字符串
	 * @return 包含目标类实例的list数组
	 * @throws Exception
	 */
	public static <T> ArrayList<T> parseJsonArray(Class<T> myClass, String jsonArrStr) throws Exception {
		Type type = new ListParameterizedType(myClass);
		return gson.fromJson(jsonArrStr, type);
	}

	private static class ListParameterizedType implements ParameterizedType {
		private Type type;

		private ListParameterizedType(Type type) {
			this.type = type;
		}

		@Override
		public Type[] getActualTypeArguments() {
			return new Type[] { type };
		}

		@Override
		public Type getRawType() {
			return ArrayList.class;
		}

		@Override
		public Type getOwnerType() {
			return null;
		}
	}

}
