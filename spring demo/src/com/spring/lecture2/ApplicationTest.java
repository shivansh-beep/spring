package com.spring.lecture2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("Spring-config.xml");
		Car c = container.getBean(Car.class);
		c.move();
	}
}
