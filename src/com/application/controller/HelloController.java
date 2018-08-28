package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.model.Login;
import com.application.service.LoginService;

@Controller
public class HelloController {
	
	@Autowired
	private LoginService loginService;
	
	
	//Done
	@RequestMapping(value="/")
	public String home(Model model) {
		Login login = new Login();
		model.addAttribute("login",login);
		return "Client/Login";
	}
	
	@RequestMapping(value="/login")
	public ModelAndView saveprocess(@ModelAttribute("login") Login login) {
		ModelAndView home = new ModelAndView();
		home.setViewName("Client/Home");
		boolean decision;
		decision = loginService.SaveUsers(login);
		if(!decision) {
			home.setViewName("Client/Login");
			home.addObject("login", login);
		}
		return home;
	}
	
	@RequestMapping(value="/listusers")
	public String getAllUsers(Model model) {
		List<Login> listOfUsers = loginService.getAllUsers();
		model.addAttribute("TheUsers", listOfUsers);
		return "ListUsers";
	}
	
	

}
