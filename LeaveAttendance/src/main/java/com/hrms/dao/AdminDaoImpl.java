package com.hrms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.hrms.domain.entity.User;

public class AdminDaoImpl implements AdminDao {

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	Transaction transaction;
	
	@Override
	public List<User> getHRListByAcctFlag()
			throws Exception {
		// TODO Auto-generated method stub
		List<User> getHRlist = new ArrayList<User>();
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			String sql = "SELECT * FROM user WHERE user_account_flag = 0 AND user_type='HR'";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(User.class);
			getHRlist = query.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getHRlist;
	}

	@Override
	public boolean approveHR(int user_id) throws Exception {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			System.out.println(user_id);
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			String sql="UPDATE user SET user_account_flag=1 WHERE user_id="+user_id;
			System.out.println("ok");
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(User.class);
			query.executeUpdate();
			transaction.commit();
			b=true;
			System.out.println(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		return b;
	}

	@Override
	public boolean removeHR(int user_id) throws Exception {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			System.out.println(user_id);
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			String sql="DELETE FROM user WHERE user_id="+user_id;
			System.out.println("ok");
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			transaction.commit();
			b=true;
			System.out.println(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		return b;
	}

	@Override
	public List<User> getEmployeeListByAcctFlag() throws Exception {
		// TODO Auto-generated method stub
		List<User> getEmployeeList = new ArrayList<User>();
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			String sql = "SELECT * FROM user WHERE user_account_flag = 0 AND user_type='EMPLOYEE'";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(User.class);
			getEmployeeList = query.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getEmployeeList;
	}

	@Override
	public boolean approveEmployee(int user_id) throws Exception {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			System.out.println(user_id);
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			String sql="UPDATE user SET user_account_flag=1 WHERE user_id="+user_id;
			System.out.println("ok");
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(User.class);
			query.executeUpdate();
			transaction.commit();
			b=true;
			System.out.println(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		return b;
	}

	@Override
	public boolean removeEmployee(int user_id) throws Exception {
		// TODO Auto-generated method stub
		boolean b = false;
		try {
			System.out.println(user_id);
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			String sql="DELETE FROM user WHERE user_id="+user_id;
			System.out.println("ok");
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			transaction.commit();
			b=true;
			System.out.println(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		return b;
	}

}
