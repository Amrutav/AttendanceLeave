package com.hrms.domain.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.hrms.dao.UserDao;
import com.hrms.domain.entity.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public boolean newEmployeeRegister(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.newEmployeeRegister(user);
	}

	@Override
	public int getMaxId() throws Exception {
		// TODO Auto-generated method stub
		int getId = userDao.getMaxId();
		return getId;
	}

	@Override
	public User getAuthenticateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		try {
			user = userDao.getAuthenticUser(user);
			return user;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
