package com.lj.basics;

import java.util.Scanner;

/**
 *  1 2 3 4
 *  5 6 7 8
 *  9 10 11 12
 *  13 14 15 16
 *  
 */
public class Pattern3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int i = 1;
		int num = 1;
		while(i <= n)
		{
			int j = 1;
			
			while(j <= n)
			{
				System.out.print(num + " ");
				j++;
				num++;
			}
			System.out.println();
			
			i++; // i = i+1;
		}
	}
}
