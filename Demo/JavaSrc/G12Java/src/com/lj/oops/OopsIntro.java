package com.lj.oops;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class OopsIntro {
    public static void main(String[] args) {
        // store 5 roll nos
//        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

//        // data of 5 students: {roll no, name, marks}
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];
//
//        Student[] students = new Student[5];
//
//        // just declaring
//        System.out.println("before calling constructor");
        Student lijo = new Student();
//        System.out.println("after calling constructor");
////        lijo = new Student();
//
        Student student1 = new Student(15, "Lijo Joseph", 85.4f);
        Student rahul = new Student(18, "Rahul ", 90.3f);
//
        lijo.rno = 13;
        lijo.name = "lijo joseph";
        lijo.marks = 88.5f;
        
        
        Student sai = new Student();
        
        sai.rno = 25;
        sai.name = "Poorna Sai";
        sai.marks = 90.3F;
//
//
//        lijo.changeName("Shoe lover");
//        lijo.greeting();
//
////
        System.out.println(lijo.rno
        		+ " " + lijo.name + lijo.marks);
        System.out.println(lijo.rno);
        System.out.println(lijo.name);
        System.out.println(lijo.marks);

//        Student random = new Student(lijo);
//        System.out.println(random.name);
//
//        Student random2 = new Student();
//        System.out.println(random2.name);
//
//        Student one = new Student();
//        Student two = one;
//
//        one.name = "Something something";
//
//        System.out.println(two.name);
//
    }
}
//
// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;
//
//    // we need a way to add the values of the above
//    // properties object by object
//
//    // we need one word to access every object
//
    void greeting() {
    	//System.out.println("Hello! My name is " + lijo.name);
        System.out.println("Hello! My name is " + this.name);
    }
//
    void changeName(String name) {
        this.name = name;
    }
//
//    Student  (Student other) {
//        this.name = other.name;
//        this.rno = other.rno;
//        this.marks = other.marks;
//    }
//
    Student () {
//    	System.out.println("student constructor called");
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }
//
    
    Student (int rno, String name)
    {
    	this.rno = rno;
        this.name = name;
    }
//
//    // Student arpit = new Student(17, "Arpit", 89.7f);
    
//    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        
        
    }

}
