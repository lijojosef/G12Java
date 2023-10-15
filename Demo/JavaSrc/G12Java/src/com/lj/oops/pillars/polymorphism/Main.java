package com.lj.oops.pillars.polymorphism;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Shapes shape = new Shapes();
		Shapes circle = new Circle();
		Shapes triangle = new Triangle();
		
		shape.area();
		circle.area();
		triangle.area();
		
		
		Scanner in = new Scanner(System.in);
	}
}
