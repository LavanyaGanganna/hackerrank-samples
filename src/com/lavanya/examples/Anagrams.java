package com.lavanya.examples;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lavanya on 12/31/16.
 */
public class Anagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String aa, String bb) {
        HashMap hm=new HashMap();
        String a= aa.toLowerCase();
        String b=bb.toLowerCase();
        // System.out.print(a);
        //System.out.print(b);
        char[] arr=a.toCharArray();
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int count=1;
            while(j < arr.length){
                if(Character.toString(arr[i]).equals(Character.toString(arr[j]))){
                    count++;

                }
                j++;
            }
            //  String keys=hm.get(Character.toString(arr[i]));
            if(!(hm.containsKey(Character.toString(arr[i])))){
                //if(keys !=null){
                hm.put(Character.toString(arr[i]),count);
                // System.out.printf("%s %d \n",arr[i],count);
            }
        }




        HashMap hm1=new HashMap();
        char[] brr= b.toCharArray();
        for(int k=0;k<brr.length;k++){
            int l=k+1;
            int count1=1;
            while(l< brr.length){
                if(Character.toString(brr[k]).equals(Character.toString(brr[l]))){
                    count1++;

                }
                l++;
            }
            if(!hm1.containsKey(Character.toString(brr[k]))){
                hm1.put(Character.toString(brr[k]),count1);
                // System.out.printf("%s %d \n",brr[k],count1);
            }
        }
        if(hm.equals(hm1))
            return true;
        else{
            return false;
        }
        // Complete the function by writing your code here.

    }
}
