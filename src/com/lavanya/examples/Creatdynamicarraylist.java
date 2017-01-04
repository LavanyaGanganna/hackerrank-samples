package com.lavanya.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lavanya on 1/3/17.
 */
public class Creatdynamicarraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int numbers=scanner.nextInt();
        List<List<Integer>> arrlists=new ArrayList<List<Integer>>();
        for(int m=0;m<numbers;m++){

            int count=scanner.nextInt();
            List<Integer> newlists= new ArrayList<Integer>();
            for(int n=0;n<count;n++){
                int val=scanner.nextInt();
                newlists.add(val);
            }
            arrlists.add(newlists);
        }

        int querycount=scanner.nextInt();
        for(int o=0;o<querycount;o++){
            int finalval=0;
            int line=scanner.nextInt();
            int pos=scanner.nextInt();
            for(int d=0;d<arrlists.size();d++){
                List<Integer> readlist=arrlists.get(line-1);
                if((pos-1)<readlist.size()){
                    System.out.println(readlist.get(pos-1));
                    break;
                }
                else{
                    System.out.println("ERROR!");
                    break;
                }
            }
        }
    }
}
