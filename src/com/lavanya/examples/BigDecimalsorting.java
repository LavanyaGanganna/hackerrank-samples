package com.lavanya.examples;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by lavanya on 1/2/17.
 */
public class BigDecimalsorting {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        BigDecimal[] bigdecimalarr= new BigDecimal[n];
        String[] arr=new String[n];
        for(int k=0;k<bigdecimalarr.length;k++){
            if(s[k] !=null){
                bigdecimalarr[k]=(new BigDecimal(s[k]));
                arr[k]=s[k];
                // System.out.println("value=" + arr[k]);
            }
        }


        for(int j=0;j<bigdecimalarr.length;j++){
            for(int l=j+1;l<bigdecimalarr.length;l++){
                BigDecimal bg1=bigdecimalarr[j];
                BigDecimal bg2= bigdecimalarr[l];
                int res= bg1.compareTo(bg2);
                if(res == -1){
                    BigDecimal temp= bigdecimalarr[l];
                    bigdecimalarr[l]=bigdecimalarr[j];
                    bigdecimalarr[j]=temp;
                    String temps=s[l];
                    s[l]=s[j];
                    s[j]=temps;

                }
                if(res ==0){
                    continue;
                }

            }

        }

        for(int c=0;c<s.length-3;c++){

            if((new BigDecimal(s[c]).compareTo(new BigDecimal(s[c+1]) ))==0){
                // System.out.println("the final values" + s[c] + " " + s[c+1]);
                for(int t=0;t<arr.length-1;t++){

                    if(((new BigDecimal(arr[t]).compareTo(new BigDecimal(s[c]))) ==0) && (new BigDecimal(arr[t+1]).compareTo(new BigDecimal(s[c+1]))==0)){
                        //System.out.println("worried:"+ "c:" + c +"c+1:" + c+1 + arr[t]);
                        s[c]=arr[t];
                        s[c+1]=arr[t+1];
                        break;
                    }
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }


    }
