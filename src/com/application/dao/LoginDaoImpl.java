package com.application.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void SaveUsers(Login login) {
		sessionFactory.getCurrentSession().save(login);
	}

	@Override
	public List<Login> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from login").list();
	}
}
