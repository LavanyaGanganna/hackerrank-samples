package com.lavanya.examples;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lavanya on 12/31/16.
 */
public class LexoSubstring {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        String line= scanner.nextLine();
        int lnth=scanner.nextInt();
        ArrayList<String> storage=new ArrayList<String>();
        for(int i=0;i<=line.length()-lnth;i++){
            String smallstr=line.substring(i,i+lnth);
            // System.out.println(smallstr);
            storage.add(smallstr);

        }
        for(int j=0;j<storage.size();j++){
            String comparing=storage.get(j);
            // System.out.println(comparing);
            for(int k=j+1;k< storage.size();k++){
                int val=comparing.compareTo(storage.get(k));
                if (val>0){
                    String temp=storage.get(k);
                    storage.remove(k);
                    storage.add(k,comparing);
                    storage.remove(j);
                    storage.add(j,temp);
                }

            }
        }

        System.out.println(storage.get(0));
        System.out.println(storage.get(storage.size()-1));

    }
}
