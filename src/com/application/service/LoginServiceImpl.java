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
	public boolean SaveUsers(Login login) {
		boolean decesive = false;
		if(login.getEmail() == "H@gmail.com" && login.getPassword() == "hello") {
			decesive = true;
		}
		return decesive;
	}

	@Override  @Transactional
	public List<Login> getAllUsers() {
		
		return loginDao.getAllUsers();
	}

}
