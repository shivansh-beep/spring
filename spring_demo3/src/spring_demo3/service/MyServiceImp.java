package spring_demo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring_demo3.dao.MyDAO;
import spring_demo3.model.ModelDTO;
@Component
public class MyServiceImp implements MyService{
	@Autowired
	MyDAO md;
	@Override
	public void register(ModelDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("inside service");
		md.register(dto);
	}

	@Override
	public boolean login(ModelDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("inside service");
		boolean b= md.login(dto);
		 return b;
		
	}

}
