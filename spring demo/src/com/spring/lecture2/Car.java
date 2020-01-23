package com.spring.lecture2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
/*String cname;
Engine e;

public Car(String cname, Engine e) {
	super();
	this.cname = cname;
	this.e = e;
}

void move(){
	e.start();
	System.out.println(cname+" is moving");
}*/
//public void setCname(String cname) {
//	this.cname = cname;
//}
//public void setE(Engine e) {
//	this.e = e;
//}

//	____________________________using byName______________________
	String cname;
	@Autowired
	Engine e1;
	void move(){
		e1.start();
		System.out.println(cname+" is moving");
	}
/*	public Car(Engine e1) {
		super();
		this.e1 = e1;
	}
	
	

	public void setCname(String cname) {
		this.cname = cname;
	}*/

	/*	public void setE1(Engine e1) {
		this.e1 = e1;
//	}*/
	
//	______________________using annotation____________
	
}
