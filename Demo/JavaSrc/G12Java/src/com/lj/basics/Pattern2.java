package com.lj.basics;

import java.util.Scanner;

/**
 *  1111
 *  2222
 *  3333
 *  4444
 */
public class Pattern2 {
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
				System.out.print(num);
				j++;
			}
			System.out.println();
			num++;
			i++; // i = i+1;
		}
	}
}
