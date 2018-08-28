package com.application.service;

import java.util.List;

import com.application.model.Login;

public interface LoginService {

	public boolean SaveUsers(Login login);

	public List<Login> getAllUsers();

}
