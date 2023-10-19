package com.lj.oops.generics;

public class Main {
	public static void main(String[] args) {
		Student lijo = new Student(12, 89.5F);
		Student max = new Student(34, 76.5F);
		
//		if(lijo < max) {
//			System.out.println("Max is having more marks");
//		}
		
		// =0 , lijo = max
		// > , lijo is having more marks
		// < , max is having more marks 
		if(lijo.compareTo(max) > 0) {
			System.out.println("lijo is having more marks");
			System.out.println(lijo.compareTo(max));
		}
		//
		
	}
}
