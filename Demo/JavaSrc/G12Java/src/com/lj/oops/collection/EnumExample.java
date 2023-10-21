package com.lj.oops.collection;

public class EnumExample {
	enum Week{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
		// enum constants
		// public, static and final
		// you can create a child
		
		// Type = Week
	}
	
	public static void main(String[] args) {
		Week week;
		week = Week.Tuesday;
		
		for(Week day : Week.values()) {
			System.out.println(day);
		}
		System.out.println("==============");
		System.out.println(week);
		
		System.out.println(week.ordinal());
		
		
		//enum interface
	}
}
