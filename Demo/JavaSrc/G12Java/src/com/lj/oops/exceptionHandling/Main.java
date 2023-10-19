package com.lj.oops.exceptionHandling;

public class Main {
	public static void main(String[] args) {
		int a = 5; 
		int b = 0;
		
		//int c = a/b;
		
		try {
			
//			int c = a/b;
			divide(a, b);
			
		}catch (Exception e){
			
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("this will always execute");
		}
		
		//==========================
		
		try {
			String name = "lijo";
			if(name.equals("lijo")) {
				throw new MyException("name is lijo");
			}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	static int divide (int a, int b) throws ArithmeticException{
		if(b == 0) {
			throw new ArithmeticException("Please do not divide by zero");
		}
		return a/b;
	}
}
