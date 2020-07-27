package com.java.hackerrank;

import java.util.Scanner;

import javax.print.CancelablePrintJob;

public class StringDecleration {

	   public static void main(String[] args) {
	     
	        Scanner scan = new Scanner(System.in);
	        String A = scan.next();
	        String B = scan.next();
	        
	        //*-*-*- Length of string pattern
	        System.out.println(A.length() + B.length());
	        
	        System.out.println(lexiCographically(A, B));
	        
	        //*-*-*-*- first Character Capitiliaze
	        System.out.println(Capitiliaze(A) +" " + Capitiliaze(B));
	        
	    }
	    public static String lexiCographically(String s1 , String s2) {

	        String lexi="No";
	        
	        if(s1.compareTo(s2)>0) {
	          lexi ="Yes";
	         }
	        
	        return lexi;
	    }
	    public static String Capitiliaze(String str) {
	        if(str == null || str.isEmpty()) {
	            return str;
	        }
	        
	        return str.substring(0,1).toUpperCase()+str.substring(1);
	    }
}
