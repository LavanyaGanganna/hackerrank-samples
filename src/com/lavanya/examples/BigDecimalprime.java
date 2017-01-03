package com.lavanya.examples;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lavanya on 1/2/17.
 */
public class BigDecimalprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        boolean found=false;

        String r="0";
        BigDecimal bd3=new BigDecimal(r);
        // System.out.println("bd3:" + bd3);
        BigDecimal bd1= BigDecimal.valueOf(n.longValue());

        for (BigInteger bg1=new BigInteger("2"); bg1.compareTo(n) < 0; bg1 = bg1.add(new BigInteger("1"))){
            BigDecimal bd2=BigDecimal.valueOf(bg1.longValue());
            BigDecimal bg3=bd1.remainder(bd2);
            System.out.println("bd2" + bd2 + "bg3" + bg3);

            int res= bg3.compareTo(bd3);
             System.out.println("res:" + res);
            if(res==0){
                found=true;

            }
        }

        if(found){
            System.out.println(" not prime");
        }
        else{
            System.out.println("prime");
        }


        // Write your code here.
    }
}
