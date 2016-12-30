package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 12/29/16.
 */
public class stdouts {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        int i=1;
        while(scanner.hasNextLine()){

            String sentence= scanner.nextLine();
            System.out.println(i +" "+ sentence);
            i++;
        }
    }
}
