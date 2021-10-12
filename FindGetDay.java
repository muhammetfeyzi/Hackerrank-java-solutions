package com.mfs;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        String year = scan.next();
        String month = scan.next();

        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
        String dayOfDate = dayOfWeek(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(dayOfDate);

    }

    protected static String dayOfWeek(int value){
        String day ="";
        switch (value){
            case 1:
                day="Sunday";
                break;
            case 2:
                day="Monday";
                break;
            case 3:
                day="Tuesday";
                break;
            case 4:
                day="Wednesday";
                break;
            case 5:
                day="Thursday";
                break;
            case 6:
                day="Friday";
                break;
            case 7:
                day="Saturday";
                break;
        }
        return day;
    }
}
