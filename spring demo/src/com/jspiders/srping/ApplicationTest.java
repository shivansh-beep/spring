package com.jspiders.srping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

	public static void main(String[] args) {
			ApplicationContext container=new ClassPathXmlApplicationContext("Spring-config.xml");
//			MyBean mb= container.getBean(MyBean.class);
//			mb.m1();
			MyBean mb= container.getBean(MyBean.class);
			System.out.println(mb);
			MyBean mb1= container.getBean(MyBean.class);
			System.out.println(mb1);
	}

}
