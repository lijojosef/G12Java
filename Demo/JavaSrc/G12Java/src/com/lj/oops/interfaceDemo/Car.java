package com.lj.oops.interfaceDemo;

public class Car implements Engine, Brake{

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("I brake like a normal car");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I start like a normal car");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I stop like a normal car");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("I accelerate like a normal car");
	}
	
}
