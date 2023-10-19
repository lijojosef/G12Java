package com.lj.oops.cloning;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Human lijo = new Human(13, "lijo");
		//Human max = new Human(45, "max");
//		Human twin = new Human(lijo);

		Human twin = (Human) (lijo.clone());
		
		
		System.out.println(twin.age + " " + twin.name);
	}
}
