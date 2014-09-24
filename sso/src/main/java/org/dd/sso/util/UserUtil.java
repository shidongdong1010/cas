package org.dd.sso.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.dd.sso.bean.User;

/**
 * 用户工具类.
 *
 * @author 咖啡兔
 * @site www.wsria.cn
 *
 */
public class UserUtil {

	/**
	 * 用户的Session标志
	 */
	public static String USER = "user";

	/**
	 * 已登录的用户
	 */
	public static Map<String, User> loginUsers = new HashMap<String, User>();

	/**
	 * 保存用户信息到Session
	 * 
	 * @param user
	 */
	public static void saveUserToSession(HttpServletRequest request, User user) {
		getSession(request).setAttribute(USER, user);
		loginUsers.put(user.getUserName(), user);
	}

	/**
	 * 获取当前登录的用户
	 * 
	 * @return
	 */
	public static User getCurrentUser(HttpServletRequest request) {
		return getCurrentUser(getSession(request));
	}

	/**
	 * 获取当前登录的用户
	 * 
	 * @param session
	 * @return
	 */
	public static User getCurrentUser(HttpSession session) {
		Object sessionUser = session.getAttribute(USER);
		if (sessionUser == null) {
			return null;
		}
		User User = (User) sessionUser;
		return User;
	}

	/**
	 * 从session中移除用户
	 */
	public static void removeUserFromSession(HttpServletRequest request) {
		getSession(request).removeAttribute(USER);
	}

	public static HttpSession getSession(HttpServletRequest request){
		return request.getSession();
	}
}
