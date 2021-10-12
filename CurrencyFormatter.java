package com.mfs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
*
* @Author Muhammet Feyzi Sağlam
* */
public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        //variable decleration but just not initilization any adress on memory..
        String us ,india,china,france;

        NumberFormat nfUs = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        us = nfUs.format(payment);
        System.out.println("US: " + us);


        NumberFormat nfInd = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        india = nfInd.format(payment);
        System.out.println("India: " + india);


        NumberFormat nfChnia = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        china = nfChnia.format(payment);
        System.out.println("China: " + china);


        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = nfFrance.format(payment);
        System.out.println("France: " + france);

    }
}
