package com.mail.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mail.Spring.model.RegisterDTO;
import com.mail.Spring.service.MyServiceImp;

@Component
@RequestMapping("/")
public class MyController {
	
	@Autowired
	MyServiceImp ms;

	@RequestMapping("/registration")
	public String register() {
		System.out.println("inside controller");
		return "registration";
	}
	@RequestMapping("/login")
	public String login() {
		System.out.println("inside controller");
		return "login";
	}

	@RequestMapping(value = "/registratioData", method = RequestMethod.POST)
	public ModelAndView registerData(@ModelAttribute RegisterDTO dto) {
		ms.register(dto);
		return new ModelAndView("registration", "msg", "signup successful...");

	}
	@Autowired
	@RequestMapping(value = "/loginData", method = RequestMethod.POST)
	public ModelAndView loginData(@ModelAttribute RegisterDTO dto) {
		RegisterDTO r1dto = ms.login(dto);
		
			if (r1dto!=null) {
				return new ModelAndView("home", "msg", r1dto.getUserName());
			} else {
				return new ModelAndView("login", "msg", "login failed please try again ");
			}
		
	}

}
