package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 12/29/16.
 */
public class CurrentBuffer {
    static boolean flag=false;
    static int B=0;
    static int H=0;
    static{
        Scanner scanner= new Scanner(System.in);
        while(scanner.hasNextInt()){
            B= scanner.nextInt();
            H= scanner.nextInt();
        }

        if(B >0 && H >0){
            flag=true;
        }
        else{
            flag=false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}


