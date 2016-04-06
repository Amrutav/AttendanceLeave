package com.hrms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.hrms.domain.entity.User;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	Transaction transaction;
	
	@Override
	public int getMaxId() throws Exception {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		SQLQuery query = session.createSQLQuery("SELECT MAX(user_id) AS user_id FROM user");
		List<Integer> list = query.list();
		int id = list.get(0);
		System.out.println(id);
		return id;
	}

	@Override
	public boolean newEmployeeRegister(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean boo = false;
		try {
			System.out.println("done");
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
			boo = true;
			System.out.println("done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			transaction.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return boo;
	}

	@Override
	public User getAuthenticUser(User user) throws Exception {
		// TODO Auto-generated method stub
		try {
			session=sessionFactory.openSession();
			Criteria criteria=session.createCriteria(user.getClass());
			criteria.add(Restrictions.eq("username", user.getUser_name()));
			criteria.add(Restrictions.eq("password", user.getUser_password()));
			user=(User) criteria.uniqueResult();
			return user;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
