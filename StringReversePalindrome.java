package com.mfs;

import java.util.Scanner;

/*
*
* @Author Muhammet Feyzi Sağlam
* @Date 12.10.2021
*
* */
public class StringReversePalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* we used StringBuilder object for reverse any string*/
        StringBuilder stringBuilder= new StringBuilder(A);
        stringBuilder.reverse();
        if(A.equals(stringBuilder.toString())){
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}
