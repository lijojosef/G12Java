package com.lj.basics;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int marks[] = {22,34,15,74,29};
        System.out.println(marks[0]);
        System.out.println(marks.length);

        //* Printing array using naive way; */
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //* Printing array using for loop; */
        System.out.println("Printing array using for loop.");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //* Printing  array using foreach loop; */
        System.out.println("Printing array using foreach loop.");
        for(int element: marks){
            System.out.println(element);
        }

        //* Printing reverse array using for loop; */
        System.out.println("Printing reverse array using for loop.");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
//        System.out.println("====================");
//        System.out.println(Arrays.toString(marks));
//        
    }
    
    

}