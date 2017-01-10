package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 1/10/17.
 */

class MyCalculators{
    int power(int x,int y) throws Exception{
        int ans=1;
        if(x<0 || y<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            while(y>0){
                ans=ans*x;
                y--;
            }

            return ans;
        }
    }
}
public class trycatchex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while ( in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            MyCalculators my_calculator = new MyCalculators();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
