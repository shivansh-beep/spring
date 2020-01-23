package com.mail.Spring.DAO;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mail.Spring.model.RegisterDTO;



@Component
public class MyDaoImp implements MyDAO {
@Autowired
SessionFactory sf;
	@Override
	public void register(RegisterDTO dto) {
System.out.println("inside dao");	
Session ss=sf.openSession();
ss.save(dto);
ss.beginTransaction().commit();
ss.close();
	}
	@Override
	public RegisterDTO login(RegisterDTO dto) {
		System.out.println("inside dao");
		Session ss=sf.openSession();
		Criteria cr=ss.createCriteria(RegisterDTO.class);
		cr.add(Restrictions.eq("email", dto.getEmail()));
		cr.add(Restrictions.eq("password", dto.getPassword()));
		RegisterDTO rdto=(RegisterDTO) cr.uniqueResult();
		ss.close();
		if(rdto!=null){
			return rdto;
		}else{
		return null;
		}
	}}
