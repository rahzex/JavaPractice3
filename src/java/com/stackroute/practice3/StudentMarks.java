package com.stackroute.practice3;

import java.util.Scanner;

//        Create a class called StudentMarks, which prompts user for the number of students, reads it
//        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//        grades of each of the students and saves them in an int array called stuGrades. Your program shall
//        check that the grade is between 0 and 100 else has to trow an error message.

public class StudentMarks {
    static void checkMarks() {
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
