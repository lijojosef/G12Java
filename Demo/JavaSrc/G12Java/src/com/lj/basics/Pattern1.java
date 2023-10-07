package com.lj.basics;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		/*
		 *   ****
		 *   ****
		 *   ****
		 *   ****
		 *   
		 */
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
//		int i = 1;
//		while (i <= n) {
//			
//			int j = 1;
//			
//			while (j <= n) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
