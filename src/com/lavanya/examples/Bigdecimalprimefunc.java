package com.lavanya.examples;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lavanya on 1/2/17.
 */
public class Bigdecimalprimefunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();

        in.close();

        int certainity = 1;
        boolean result = n.isProbablePrime(certainity);
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println(" not prime");
        }

    }
}
