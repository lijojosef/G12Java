package com.lj.oops.generics;

public class Student implements Comparable<Student>{
	int rollno;
	float marks;
	
	public Student(int rollno, float marks) {
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Student o) {
		//diff == 0 ; both the values are equal
		//diff < 0; o is bigger
		//else o is smaller
		int diff = (int)(this.marks - o.marks);
		return diff;
	}
}
