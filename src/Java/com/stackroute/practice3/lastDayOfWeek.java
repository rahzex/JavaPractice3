package com.stackroute.practice3;

public class lastDayOfWeek {
    static String findLastDate(int dd,int mm,int yyyy){
        int lastDay = dd + 6;
        int month = mm;
        int year = yyyy;

        if(lastDay > 30)
            lastDay = lastDay - 30;

        if(lastDay < 7){
            month++;
            if (month > 12)
                month = month - 12;
        }

        if(month < mm)
            year++;

        return "SUN "+lastDay+"/"+month+"/"+year;
    }
}
