package com.lj.oops.pillars.Inheritance;

public class BoxWeight extends Box{
	// l , w, h
	double weight;
	
	public BoxWeight() {
		this.weight = -1;
	}
	
	public BoxWeight(double l, double h, double w, double weight) {
		// calling the parent class constructor
		// initialise the values present in the parent class
		super(l, h, w);
		this.weight = weight;
	}
	
//	public BoxWeight(BoxWeight other) {
//		super();
//		
//	}
}
