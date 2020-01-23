package com.spring.stockManagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.stockManagement.model.StockDTO;

@Component
public class MyDaoImp implements MyDAO {
@Autowired
SessionFactory sf;
	@Override
	public void stock(StockDTO dto) {
System.out.println("inside dao");	
Session ss=sf.openSession();
ss.save(dto);
ss.beginTransaction().commit();
ss.close();
	}

}
