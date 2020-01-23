package com.spring.stockManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.stockManagement.dao.MyDaoImp;
import com.spring.stockManagement.model.StockDTO;

@Component
public class MyServiceImp implements MyService{
@Autowired
MyDaoImp mdao;
	@Override
	public void stock(StockDTO dto) {
System.out.println("inside service");
mdao.stock(dto);
	}

}
