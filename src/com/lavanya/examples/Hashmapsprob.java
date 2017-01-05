package com.lavanya.examples;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lavanya on 1/4/17.
 */
public class Hashmapsprob {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        HashMap hm=new HashMap();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            hm.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(hm.containsKey(s)){
                System.out.println(s +"=" + hm.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
