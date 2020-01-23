package com.mail.Spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mail.Spring.DAO.MyDaoImp;
import com.mail.Spring.model.RegisterDTO;

@Component
public class MyServiceImp implements MyService {
	@Autowired
	MyDaoImp mdao;

	@Override
	public void register(RegisterDTO dto) {
		System.out.println("inside service");
		mdao.register(dto);
	}

	@Override
	public RegisterDTO login(RegisterDTO dto) {
		RegisterDTO r1dto = mdao.login(dto);
		return r1dto;
	}


}
