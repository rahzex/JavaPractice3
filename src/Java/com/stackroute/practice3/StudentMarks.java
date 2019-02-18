package com.stackroute.practice3;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int numOfStudents = input.nextInt();
        System.out.println("Enter number of each student: ");
        int[] studentGrades = new int[numOfStudents];
        for(int student = 0; student < numOfStudents; student++){
            int number = input.nextInt();
            if(number<0 || number>100){
                student--;
                System.err.println( number + " number is not Valid. Enter Again:");
            }
            else
                studentGrades[student] = number;
        }
    }
}
