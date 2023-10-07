package com.lj.basics;

/**
 *  AAA
 *  BBB
 *  CCC
 */
public class Pattern5 {
	public static void main(String[] args) {
		int n = 3;
		
		int i = 1;
		char ch = 'A';
		while( i <= n)
		{
			int j = 1;
			
			while( j <= n)
			{
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
			ch++;
		}
	}
}
