package com.lavanya.examples;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by lavanya on 12/30/16.
 */
public class Currencyformat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us= nf.format(payment);
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=nf1.format(payment);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=nf2.format(payment);
        DecimalFormat df = new DecimalFormat("#,###.##");
        // String india= String.format("Rs.",df.format(payment));
        String india="Rs."+df.format(payment);
        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
