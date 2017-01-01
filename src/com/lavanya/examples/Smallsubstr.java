package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 12/31/16.
 */
public class Smallsubstr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String smallstr= S.substring(start,end);
        System.out.println(smallstr);
    }
}
