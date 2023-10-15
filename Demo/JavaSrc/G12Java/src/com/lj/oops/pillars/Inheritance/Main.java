package com.lj.oops.pillars.Inheritance;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		
		
		
		
		box.setH(20);
		box.setW(24);
		box.setL(15);
		
		
		System.out.println(box.getL() + " " + box.getH() + " " + box.getW())	;
		
		BoxWeight box2 = new BoxWeight();
		
		System.out.println(box2.getL() + " " + box2.weight);
		
		Box boxweight = new BoxWeight();
		System.out.println(boxweight.getL() );
	}
}
