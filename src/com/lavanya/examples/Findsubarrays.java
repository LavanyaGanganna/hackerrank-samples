package com.lavanya.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lavanya on 1/3/17.
 */
public class Findsubarrays {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> subarrays=new ArrayList<Integer>();
        Scanner scanner=new Scanner(System.in);
        int numbers=scanner.nextInt();
        int[] a=new int[numbers];
        for(int i=0;i<numbers;i++){
            a[i]=scanner.nextInt();
        }
        scanner.close();
        for(int j=0;j<numbers;j++){
            if(a[j]<0){
                subarrays.add(a[j]);
            }
        }
        for(int y=1;y<numbers;y++){
            for(int k=0;k<numbers-y;k++){
                int sum=0;
                for(int x=k;x<=k+y;x++){
                    sum=sum+a[x];
                }

                if(sum <0){
                    subarrays.add(sum);
                }
            }
        }


        System.out.println(subarrays.size());

    }
}
