package com.spring.lecture2;

public class Engine2 implements Engine{
String ename;
	@Override
	public void start() {
			System.out.println(ename+" engine is started");
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
