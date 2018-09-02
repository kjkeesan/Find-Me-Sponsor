package com.application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.LoginDao;
import com.application.model.Login;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public void saveUsers(Login login) {
		loginDao.saveUsers(login);
	
	}
		

	@Override  @Transactional
	public List<Login> getAllUsers() {
		
		return loginDao.getAllUsers();
	}
	
	@Override  @Transactional
	public boolean validUser(Login login) {
		return loginDao.validUser(login);
		
	}
	
	public String getCompName(Login login){
		return loginDao.getCompName(login);
	}
}
