package com.lj.oops.abstractDemo;

public class Son extends Parent{

	@Override
	void career(String name) {
		// TODO Auto-generated method stub
		System.out.println("I am going to be a " + name);
	}

	@Override
	void partner(String name, int age) {
		// TODO Auto-generated method stub
		System.out.println("I love " + name + " he is " + age);
	}
	
	public Son(int age) {
		this.age = age;
	}

}
