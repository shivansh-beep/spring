package spring_demo3.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring_demo3.model.ModelDTO;
@Component
public class MyDaoImp implements MyDAO {
	@Autowired 
	SessionFactory sf;
	
	@Override
	public void register(ModelDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("inside dao reg");
		Session ss=sf.openSession();
		ss.save(dto);
		ss.beginTransaction().commit();
		ss.close();
	}
	

	@Override
	public boolean login(ModelDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("inside dao");
		Session ss=sf.openSession();
		Criteria cr=ss.createCriteria(ModelDTO.class);
		cr.add(Restrictions.eq("uname", dto.getUname()));
		cr.add(Restrictions.eq("pw", dto.getPw()));
		ModelDTO mdto=(ModelDTO) cr.uniqueResult();
		ss.close();
		if(mdto!=null){
			return true;
		}else{
		return false;
		}
	}

}
