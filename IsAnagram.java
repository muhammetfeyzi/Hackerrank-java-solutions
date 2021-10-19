package com.mfs;

/*
*
* @Author Muhammet Feyzi Sağlam
* @Date 18.10.2021
*
*
* */

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {

        Boolean result=false;
        a = new String(a.toLowerCase());
        b = new String (b.toLowerCase());
        char[] newArrayA = a.toCharArray();
        Arrays.sort(newArrayA);
        char[] newArrayB = b.toCharArray();
        Arrays.sort(newArrayB);
        result = new String(newArrayA).equals(new String(newArrayB))? true : false;

        return result;
    }

}
