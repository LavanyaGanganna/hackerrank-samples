package com.lavanya.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by lavanya on 1/10/17.
 */
public class trycatchex1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        try{
            Integer m= scanner.nextInt();
            Integer n= scanner.nextInt();
            if(n ==0){
                throw new ArithmeticException("/ by zero");
            }
            if ((n instanceof Integer)){

            }
            else{
                throw new InputMismatchException();
            }
            int ans=m/n;
            System.out.println(ans);
        }/*catch(Exception e){
            System.out.println(e);
        }*/
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }

    }
}
