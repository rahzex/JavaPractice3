package com.stackroute.practice3;

//        7.Create a class with a main( ) that throws an object of class Exception inside a try block.
//        a. Give the constructor for Exception a String argument.
//        b. Catch the exception inside a catch clause and print the String argument.
//        c. Add a finally clause and print a message to prove you were there.

public class SampleException {
    public static void main(String[] args) {

        try{
            int data = 50/0;
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is in Finally Block");
        }

    }
}
