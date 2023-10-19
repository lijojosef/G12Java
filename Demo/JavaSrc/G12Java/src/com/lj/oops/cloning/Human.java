package com.lj.oops.cloning;

public class Human implements Cloneable{
	int age;
	String name;
	
	public Human(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
	
	public Human(Human other) {
		// TODO Auto-generated constructor stub
		this.age = other.age;
		this.name = other.name;
	}
	
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
