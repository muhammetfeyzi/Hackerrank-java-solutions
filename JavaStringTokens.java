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
        String regexPattern= "[^a-zA-Z]+";
        List<String> splitArrayString= Arrays.asList(s.split(regexPattern));
        System.out.println(splitArrayString.size());
        splitArrayString.forEach(System.out::println);
        scan.close();
    }
}
