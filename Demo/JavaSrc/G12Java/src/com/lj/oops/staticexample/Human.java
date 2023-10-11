package com.lj.oops.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
//    static variable will be common to all the objects in the class-->means it does not depened on the object
    static long population;

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}