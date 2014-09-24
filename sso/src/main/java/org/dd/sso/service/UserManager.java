package org.dd.sso.service;

import org.dd.sso.bean.User;
import org.dd.sso.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

	@Autowired
	private UserDao userDao;
	
	public User findUserByUserName(String userName){
		return userDao.findByUserName(userName);
	}
}
