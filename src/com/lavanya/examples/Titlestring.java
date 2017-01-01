package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 12/31/16.
 */
public class Titlestring {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length= A.length()+ B.length();
        String reply=null;
        int returnval=A.compareTo(B);
        if(returnval <0){
            reply="No";
        }
        else if(returnval >0){
            reply="Yes";
        }
        char[] a=A.toCharArray();
        char c= a[0];
        a[0]=Character.toUpperCase(c);
        A= String.valueOf(a);



        char[] b=B.toCharArray();
        char c1= b[0];
        b[0]=Character.toUpperCase(c1);
        B= String.valueOf(b);



        System.out.println(length);
        System.out.println(reply);
        System.out.println(A +" " + B);

    }
}
