package com.lj.oops.pillars.Inheritance;

public class Box {
	private double l;
	private double w;
	private double h;
	
	

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	Box(){
		this.h = -1;
		this.w = -1;
		this.l = -1;
	}
	
	// cube
	Box(double side){
		this.w = side;
		this.h = side;
		this.l = side;
	}
	
	public Box(double l, double w, double h) {
		this.l = l;
		this.h = h;
		this.w = w;
	}
	
	
	//copy constructor
	Box(Box old){
		this.h = old.h;
		this.w = old.w;
		this.l = old.l;
	}
}
