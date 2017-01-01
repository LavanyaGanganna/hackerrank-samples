package com.lavanya.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lavanya on 12/31/16.
 */
public class Duplicatewords {
    public static void main(String[] args) {

        String regex ="[a-zA-Z]+" /* Write a RegEx matching repeated words here. */;
        Pattern p = Pattern.compile(regex /* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
