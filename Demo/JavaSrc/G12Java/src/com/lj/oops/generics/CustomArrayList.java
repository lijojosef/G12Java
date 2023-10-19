package com.lj.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
	
	private int[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0; //also work as an index item
	
	public CustomArrayList() {
		// TODO Auto-generated constructor stub
		this.data = new int[DEFAULT_SIZE];
	}
	
	public void add (int num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}
	
	
	private void resize() {
		// TODO Auto-generated method stub
		int[] temp = new int[data.length * 2];
		
		//copy and paste
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}
	
	public int remove() {
		int removed = data[--size];
		return removed;
	}
	
	public int get(int index) {
		return data[index];
	}
	
	public int size() {
		return size;
	}
	
	public void set(int index, int value) {
		data[index] = value;
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return size == data.length;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CustomArrayList { "+ 
				" data " + Arrays.toString(data) + 
				", size " + size + "}";
	}

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		list.add(45);
//		list.remove(0);
//		list.get(0);
//		list.set(0, 6789);
//		list.size();
//		list.isEmpty();
		
		CustomArrayList list2 = new CustomArrayList();
		
		for(int i = 0; i < 13; i++)
		{
			list2.add(2*i);
		}
		
		System.out.println(list2);
		
		
	}
	
	//WildCards in Java
//	Number
	
	//try to implement wildcards in CustomArrayList in java
}
