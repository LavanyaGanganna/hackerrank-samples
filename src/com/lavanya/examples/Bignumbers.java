package com.lavanya.examples;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lavanya on 1/1/17.
 */
public class Bignumbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        BigInteger num1=scanner.nextBigInteger();
        BigInteger num2=scanner.nextBigInteger();
        BigInteger sum= BigInteger.valueOf(0);

        sum=sum.add(num1);
        sum=sum.add(num2);
        System.out.println(sum);
        BigInteger prod=BigInteger.valueOf(1);
        prod=prod.multiply(num1);
        prod=prod.multiply(num2);
        System.out.println(prod);
    }
}
