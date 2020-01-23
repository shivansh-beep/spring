package com.spring.lecture2;

import org.springframework.stereotype.Component;

@Component
public class Engine1 implements Engine{
String ename;
	public void start() {
			System.out.println(ename+" engine is started");
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
