package com.java.hackerrank;

import java.util.Scanner;

public class SubString {
	/**
	 * 
	 * @author msaglam
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		System.out.print(S.substring(start, end));

	}

}
