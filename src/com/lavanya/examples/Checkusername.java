package com.lavanya.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lavanya on 12/31/16.
 */
public class Checkusername {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String username = in.nextLine();
            //String pattern = Complete this line in the editable area below

            String pattern = "^[a-zA-Z][a-zA-Z0-9_?]+{8,30}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find( )) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
        }
