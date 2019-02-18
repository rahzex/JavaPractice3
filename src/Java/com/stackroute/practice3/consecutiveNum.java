package com.stackroute.practice3;

public class consecutiveNum {
    static boolean checkConsecutive(String numbers){
        boolean consecutive = false, increase = false ,decrease = false;
        String[] num = numbers.split(" ");

        if(Integer.valueOf(num[0]) > Integer.valueOf(num[1]))
            decrease = true;
        if(Integer.valueOf(num[0]) < Integer.valueOf(num[1]))
            increase = true;

        for (int i=0; i<num.length - 1; i++){

            if((Integer.valueOf(num[i]) != Integer.valueOf(num[i+1]) + 1) && decrease){   // for decreasing order
                consecutive = false;
                break;
            }
            if((Integer.valueOf(num[i]) != Integer.valueOf(num[i+1]) - 1) && increase){  // for increasing order
                consecutive = false;
                break;
            }
            else
                consecutive = true;
        }
        return consecutive;
    }
}
