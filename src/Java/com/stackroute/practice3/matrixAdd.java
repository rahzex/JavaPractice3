package com.stackroute.practice3;

import java.util.Scanner;

public class matrixAdd {

    static int[][] addMatrix (int[][] mat1,int[][] mat2,int col,int row){
        int sum[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                sum[i][k] = mat1[i][k] + mat2[i][k];
            }
        }

        return sum;
    }
}
