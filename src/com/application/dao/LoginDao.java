package com.application.dao;

import java.util.List;

import com.application.model.Login;

public interface LoginDao {

	public void SaveUsers(Login login);

	public List<Login> getAllUsers();

	

}
