package com.wujiang.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.wujiang.dao.UserDao;
import com.wujiang.entity.User;

public class UserService {
	private UserDao userDao = new UserDao();
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getPageUsers(Map<String, Integer> param) throws IOException{
		return userDao.getPageUsers(param);
	}
}
