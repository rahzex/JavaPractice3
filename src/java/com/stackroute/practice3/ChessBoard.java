package com.stackroute.practice3;

//5. Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//        WWrepresents white color and BB represents Black color.
//        Output:
//        My Chess Board
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|

public class ChessBoard {
    //method to generate chess board pattern
    static String[][] generateChessBoard(){
        String[][] checkBorad = new String[8][8];
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(i%2 == 0){
                    if(j%2 == 0)
                        checkBorad[i][j] = "WW";
                    else
                        checkBorad[i][j] = "BB";
                }
                else{
                    if(j%2 == 0)
                        checkBorad[i][j] = "BB";
                    else
                        checkBorad[i][j] = "WW";
                }
                System.out.print(checkBorad[i][j]);
                if(j==7)
                    System.out.println();
            }

        }
        return checkBorad;
    }
}
