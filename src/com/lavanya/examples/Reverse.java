package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 12/31/16.
 */
public class Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B= new StringBuffer(A).reverse().toString();
        if(A.equals(B))
            System.out.println("Yes");
        else{
            System.out.println("No");
        }

    }
}
