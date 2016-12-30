package com.lavanya.examples;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by lavanya on 12/29/16.
 */
public class Dayofweek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Calendar.YEAR,year);
        rightNow.set(Calendar.MONTH,month-1);// in calendar class January is 0 ,feb 1,aug is 7 so month-1
        rightNow.set(Calendar.DAY_OF_MONTH,day);
        int weekday=rightNow.get(Calendar.DAY_OF_WEEK);
        String weekdays=null;
        switch(weekday){
            case 1:
                weekdays="SUNDAY";
                break;
            case 2:
                weekdays="MONDAY";
                break;
            case 3:
                weekdays="TUESDAY";
                break;
            case 4:
                weekdays="WEDNESDAY";
                break;
            case 5:
                weekdays="THURSDAY";
                break;
            case 6:
                weekdays="FRIDAY";
                break;
            case 7:
                weekdays="SATURDAY";
                break;

        }
        System.out.println(weekdays);
    }
}


