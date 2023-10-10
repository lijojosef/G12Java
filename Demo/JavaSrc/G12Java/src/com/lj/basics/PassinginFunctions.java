package com.lj.basics;


import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        
        System.out.println("---------------");
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    static void change(int[] arr) {
    	System.out.println("entering change method");
        arr[0] = 99;
        System.out.println("exiting change method");
    }
}