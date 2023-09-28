package com.lj.basics;

public class ConditionalAndLoops {
	public static void main(String[] args)
	{
		//code here
		// if salary is greater than 10k then will increase salary with 2000 else with 1000
		
//		int salary = 25_400;
//		
//		if(salary > 10000)
//		{
//			salary = salary + 2000;
//		}else {
//			salary = salary + 1000;
//		}

		
		int salary = 25_400;
		
		if(salary > 10000)
		{
			salary = salary + 2000;
			
		}else if (salary > 20000){
			
			salary = salary + 4000;
		}
		else {
			salary = salary + 1000;
		}

		/*
		 * Loops
		 */
		
			/* for (int num = 1;num <= 5;num = num+1){
				System.out.println(num);
			} */
			
			//while loop
			int num = 1;
//			while(num <= 5) {
//				System.out.println(num);
//				num++;
//			}
//			
			/*do{
			// code to be executed
			// update statement -> increment/decrement
			}while (condition); */
			
			do {
				System.out.println(num);
				// num++;
			}while(num <= 5);
			
		
			
//			if(true) {
//				if(true) {
//					if(true) {
//						
//					}else if(false) {
//						
//					}else {
//						
//					}
//				}
//			}else {
//				
//			}
//		System.out.println(salary);
//		String name = "lijo";
		
			// 

	}
}


