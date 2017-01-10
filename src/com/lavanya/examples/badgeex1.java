package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 1/10/17.
 */
public class badgeex1 {
    public static void main(String[] args) {
        int apoints=0;
        int bpoints=0;
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        //   System.out.print(a0+" "+a1+" "+a2+" "+b0+" "+b1+" "+b2);
        if(a0>b0){
            //System.out.print("entered a0>"+ a0+ " "+ b0);
            apoints=apoints+1;
        }
        else if(a0<b0){
            //System.out.print("entered a0<"+ a0+ " "+ b0);
            bpoints=bpoints+1;
        }
        if(a1>b1){
            //System.out.print("entered a1>"+ a1+ " "+ b1);
            apoints=apoints+1;
        }
        else if(a1<b1){
            //System.out.print("entered a1<"+ a1+ " "+ b1);
            bpoints=bpoints+1;
        }
        if(a2>b2){
            //System.out.print("entered a2>"+ a2+ " "+ b2);
            apoints=apoints+1;
        }
        else if(a2 < b2){
            //System.out.print("entered a2<"+ a2 + "" + b2);
            bpoints=bpoints+1;
        }
        System.out.print(apoints +" "+ bpoints);

    }
}
