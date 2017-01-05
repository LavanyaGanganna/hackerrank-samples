package com.lavanya.examples;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lavanya on 1/4/17.
 */
public class Arralistinsertdelete {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> newlist=new ArrayList<Integer>();
        int numcount=scanner.nextInt();
        for(int r=0;r<numcount;r++){
            newlist.add(scanner.nextInt());
        }
        int numqueries=scanner.nextInt();
        //System.out.println("queries"+ numqueries);
        int pos=0;
        int value=0;

        for(int u=0;u<numqueries;u++){
            String task=scanner.nextLine();
            task=scanner.nextLine();
            // System.out.println("tasks: u"+ task + " " + u);
            if(task.equals("Insert")){

                pos=scanner.nextInt();
                value=scanner.nextInt();
                //System.out.println("pos value" + pos + value);
                newlist.add(pos,value);

            }
            else if(task.equals("Delete")){
                pos=scanner.nextInt();
                // System.out.println("delete pos" + pos);
                newlist.remove(pos);
            }



        }
        scanner.close();
        for(int k=0;k<newlist.size();k++){
            System.out.print(newlist.get(k)+" ");
        }

    }
}
