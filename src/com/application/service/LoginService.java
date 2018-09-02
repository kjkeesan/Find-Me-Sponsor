package com.application.service;

import java.util.List;

import com.application.model.Login;

public interface LoginService {

	public void saveUsers(Login login);

	public List<Login> getAllUsers();
	
	public boolean validUser(Login login);
	
	public String getCompName(Login login);

}
