//package com.lj.threadExample;
////
////class A extends Thread{
////	public void run() {
////		for(int i =1; i <= 100; i++) {			
////			System.out.println("Hi");
////			try {
////				Thread.sleep(2);
////			} catch (InterruptedException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
////		}
////	}
////}
////
////class B extends Thread{
////	public void run() {
////		try {
////			Thread.sleep(2);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////	}
////}
//
//public class Demo {
//	public static void main(String[] args) {
//		A obj1 = new A();
//		B obj2 = new B();
//		
////		obj1.setPriority(Thread.MAX_PRIORITY);
////		 System.out.println(obj1.getPriority());
//		
////		obj1.start();
//		
//		try {
//			Thread.sleep(2);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		obj2.start();
//	}
//}
