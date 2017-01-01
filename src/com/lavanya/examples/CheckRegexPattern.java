package com.lavanya.examples;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by lavanya on 1/1/17.
 */
public class CheckRegexPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String pattern = in.nextLine();
            boolean errorcode=false;
            try {
                Pattern.compile(pattern);
            } catch (PatternSyntaxException exception) {
                //System.err.println(exception.getDescription());
                errorcode=true;

            }
            if(errorcode){
                System.out.println("Invalid");
            }
            else{
                System.out.println("Valid");
            }
            //Write your code
            testCases--;
        }
    }
}
