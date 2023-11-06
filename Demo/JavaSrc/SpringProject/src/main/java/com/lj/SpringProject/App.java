package com.lj.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
    	// Car car = new Car();
    	// car.drive();
    	
    	//Bike obj = new Bike();
    	//obj.drive();
    	
//    	BeanFactory --> small app
//    	ApplicationContext -->enterprise level app
//    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    	
//    	Vehicle obj = (Vehicle)context.getBean("bike");
//    	
//    	obj.drive();
//    	
    	
//    	 Tyre t = (Tyre)context.getBean("tyre");
//    	
//    	 System.out.println(t);
    	
    	Car obj = (Car)context.getBean("car");
    	obj.drive();
    	
    }
}
