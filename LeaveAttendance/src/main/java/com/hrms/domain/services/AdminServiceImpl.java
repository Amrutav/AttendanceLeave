package com.hrms.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hrms.dao.AdminDao;
import com.hrms.domain.entity.User;

public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;
	
	@Override
	public List<User> getHRListByAcctFlag()
			throws Exception {
		// TODO Auto-generated method stub
		return adminDao.getHRListByAcctFlag();
	}

	@Override
	public boolean approveHR(int user_id) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.approveHR(user_id);
	}

	@Override
	public boolean removeHR(int user_id) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.removeHR(user_id);
	}

	@Override
	public List<User> getEmployeeListByAcctFlag() throws Exception {
		// TODO Auto-generated method stub
		return adminDao.getEmployeeListByAcctFlag();
	}

	@Override
	public boolean approveEmployee(int user_id) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.approveEmployee(user_id);
	}

	@Override
	public boolean removeEmployee(int user_id) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.removeEmployee(user_id);
	}

}
