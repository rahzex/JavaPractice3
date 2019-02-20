package com.stackroute.practice3;

//2. Write a program to compute the addition of two matrix, Read the number of rows and columns
//        as input, also the values of each matrix
//        Output:
//        Input number of rows of matrix: 3
//        Input number of columns of matrix: 2
//        Input elements of first matrix: 1 2 3 4 5 6
//        Input the elements of second matrix: 9 8 7 6 5 4

public class MatrixAdd {
    //method to add to Matrices
    static int[][] addMatrix (int[][] mat1,int[][] mat2,int col,int row){
        int sum[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                sum[i][k] = mat1[i][k] + mat2[i][k];   // Matrix addition
            }
        }

        return sum;
    }
}
