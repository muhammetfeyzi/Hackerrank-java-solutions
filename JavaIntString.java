package com.java.hackerrank;

import java.util.Scanner;

/**
 * 
 * @author msaglam
 * 
 * */
public class JavaIntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		scn.close();
		String s = String.valueOf(n);		
		if(n == Integer.parseInt(s)) {
		    System.out.println("Good job");
		}else {
		    System.out.println("Wrong answer.");
		}
		
	}

}
