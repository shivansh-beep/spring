package com.jspiders.srping;

public class MyBean {
	int id;
	String name;
	// ___________________assign value using constructor________________

	public MyBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void m1() {
		System.out.println("my bean object m1 executed");
		System.out.println(id + " " + name);
	}

	// ______________assign value using setter method____________________
	// public void setId(int id) {
	// this.id = id;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }

}
