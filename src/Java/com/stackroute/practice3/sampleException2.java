package com.stackroute.practice3;

public class sampleException2 {
    public static void main(String[] args) {
        int[] arr2 = new int[5];


        try{
            int[] arr = new int[-1];            // Generating NegativeArraySizeException
            arr2[6] = 10;
        }catch (NegativeArraySizeException e){
            System.out.println(e);
        }

        try{
            arr2[6] = 10;                       // Generating IndexOutOfBoundException
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        sampleException2 s2 = null;
        
        try{
            s2.foo("hello");                 // Generating NullPointerException
        }catch (NullPointerException e){
            System.out.println(e);
        }

    }

    public void foo(String s) {
        System.out.println(s.toLowerCase());
    }
}
