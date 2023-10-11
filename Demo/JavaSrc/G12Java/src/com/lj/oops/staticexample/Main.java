package com.lj.oops.staticexample;

public class Main {
//	Main obj = new Main();
    public static void main(String[] args) {
        Human lijo = new Human(22, "lijo", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);
        Human arpit = new Human(34, "arpit", 15000, true);
//
//    	without creating the object we can use static variables
        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();

        Main obj = new Main();
        obj.greeting();
//        greeting();
    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }
// if we are using static method inside a non static method it is fine.
    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}