package com.mfs;

import java.util.*;

/**
 *
 * @Author Muhammet Feyzi Sağlam
 * @Date 22.10.2021
 *
 * */

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String result = Result.superReducedString(s);
        System.out.println(result);

    }
}

class Result{
    public static String superReducedString(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean removeAndChangedString = true;
        if(str.length()>1 && str.length()<100 ) {
            while (removeAndChangedString) {
                removeAndChangedString = false;
                for (int i = 0; i < str.length() - 1; ++i) {

                    if (str.charAt(i) == str.charAt(i + 1)) {
                        str.delete(i, i + 2);
                        removeAndChangedString = true;
                    }
                }
            }
            if (str.length() == 0) {
                return "Empty String";
            } else {
                return str.toString();
            }
        }
        return "error";

    }
}
