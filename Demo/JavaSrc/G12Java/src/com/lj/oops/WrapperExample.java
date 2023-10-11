package com.lj.oops;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;
//    	Integer a = new Integer(45);
//    	Meaning we can perform many activities/operations
//    	num.____;
        Integer a = 10;
        Integer b = 20;
        
//        Integer num = 0;
//        num.toString();
        
        
//      If we take the example of 2 integers and try to swap them, it is not possible
//      why because int is pass by value;
//		to show that Integer (Wrapper class) --> which is having pass by value of the reference 
//      variable is also not swapped. --reason : Integer class if final
        swap(a, b);

//        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A lijo = new A("lijo Joseph");
        System.out.println(lijo.name);
        lijo.name = "other name";
        System.out.println("========");
        System.out.println(lijo.name);

        // when a non primitive is final, you cannot reassign it.
//        lijo = new A("new object");
//
        A obj = new A("Rnadvsjhv");
//
        System.out.println(obj);
//
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }
//
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
//        System.out.println("Inside swap function");
//        System.out.println(a + " " + b);
    }

}

class A {
//	always initialize final variables while declaring
    final int num = 10;
    String name;

    
    
    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    // override & thowable we will cover later
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}