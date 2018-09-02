package com.application.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUsers(Login login) {
		sessionFactory.getCurrentSession().save(login);
	}

	@Override
	public List<Login> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from login").list();
	}
	
	public boolean validUser(Login login) {
		boolean found=false;
		Query query=sessionFactory.getCurrentSession().createQuery("from Login where username= :username and password= :password");
		query.setParameter("username",login.getUsername());
		query.setParameter("password",login.getPassword());
		List<Login> list=query.getResultList();
		if((list!=null) && (list.size()>0)){
			found=true;
		}
		return found;
	}
	
	public String getCompName(Login login){
		Query query=sessionFactory.getCurrentSession().createQuery("from Login where username= :username and password= :password");
		query.setParameter("username",login.getUsername());
		List<Login> list=query.getResultList();
		return "Hello";
	}
}
