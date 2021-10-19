package com.mfs;

/*
*
* @Author Muhammet Feyzi Sağlam
* @Date 19.10.2021
*
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.length()>400000){
            return ;
        }else if (s.length()==0){
            System.out.println(0);
            return ;
        }else {
            String regexPattern = "[!,?.*_'@\\ ]+";
            List<String> splitArrayString = Arrays.asList(s.split(regexPattern));
            System.out.println(splitArrayString.size());
            splitArrayString.forEach(System.out::println);
            scan.close();
        }
    }
}
