package com.lj.basics;

/**
 *  *
 *  **
 *  ***
 *  ****
 */
public class Pattern4 {
	public static void main(String[] args) {
		int n = 4;
		int i = 1;
		
		while ( i <= n)
		{
			int j = 1;
			while (j <= i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
