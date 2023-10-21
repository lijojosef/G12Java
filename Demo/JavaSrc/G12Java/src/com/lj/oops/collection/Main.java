package com.lj.oops.collection;

import java.util.*;

public class Main {
	public static void main(String[] args) {
//		Collection cl = new Collection();
		List<Integer> list = new LinkedList();
//		ArryList list2 = new ArrayList();
		
		list.add(4);
		list.add(8);
		list.add(55);
		list.add(89);
		
		System.out.println(list);
		
		
		Vector<Integer> vector = new Vector<>();
		
		vector.add(45);
		vector.add(58);
		vector.add(7);
		vector.add(4);
		vector.add(9);
		
		System.out.println(vector);
	}
}
