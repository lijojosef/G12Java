package com.lj.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList2 <T> {
	
	private Object[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0; //also work as an index item
	
	public CustomGenArrayList2() {
		// TODO Auto-generated constructor stub
		this.data = new Object[DEFAULT_SIZE];
	}
	
	public void add (T num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}
	
	
	private void resize() {
		// TODO Auto-generated method stub
		Object[] temp = new Object[data.length * 2];
		
		//copy and paste
		for(int i = 0; i < data.length; i++) {
			temp[i] = (int) data[i];
		}
		data = temp;
	}
	
	public int remove() {
		int removed = (int) data[--size];
		return removed;
	}
	
	public int get(int index) {
		return (int) data[index];
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
		
		CustomGenArrayList2<String> list3 = new CustomGenArrayList2<>();
		
		for(int i = 0; i < 11; i++)
		{
			list3.add("lijo");
		}
		
		System.out.println(list3);
		
		
	}
}
