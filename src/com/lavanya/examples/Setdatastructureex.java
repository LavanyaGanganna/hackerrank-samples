package com.lavanya.examples;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lavanya on 1/5/17.
 */
public class Setdatastructureex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        //Write your code here
        Set<String> set = new HashSet<String>();
        for (int j = 0; j < pair_left.length; j++) {
            String finalstr = "(" + pair_left[j] + "," + pair_right[j] + ")";
            set.add(finalstr);
            System.out.println(set.size());
        }

//for(String setstring:set){
        //  System.out.println(setstring);
//}
    }
    }
