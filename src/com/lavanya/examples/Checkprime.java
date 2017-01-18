package com.lavanya.examples;

/**
 * Created by lavanya on 1/17/17.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static java.lang.System.in;
class Prime{
    public void checkPrime(int... numbers){
        //  HashMap<Integer,Boolean> hmap=new HashMap<Integer,Boolean>();

        ArrayList<Integer> primelist=new ArrayList<Integer>();
        for(int y=0;y<numbers.length;y++){
            boolean found=false;
            if(numbers[y]==1){
                found=true;
            }
            else{
                for(int x=2;x<numbers[y];x++){

                    if((numbers[y] %x ==0)){
                        found=true;
                    }


                }
                // hmap.put(numbers[y],found);
                if(!found){
                    primelist.add(numbers[y]);
                }
            }

        }
       /* Iterator iterator=hmap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Boolean> entry= (Map.Entry)iterator.next();
            boolean value=entry.getValue();
            if(!value){
                System.out.print(entry.getKey()+ " ");
            }

        }
        System.out.println();*/
        Iterator iterator=primelist.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}
public class Checkprime {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
