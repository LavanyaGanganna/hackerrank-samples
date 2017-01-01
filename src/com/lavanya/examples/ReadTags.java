package com.lavanya.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lavanya on 12/31/16.
 */
public class ReadTags {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String start=null;
            String end=null;


            Pattern pattern= Pattern.compile("<(.*?)>");
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()){
                start= matcher.group(1);
                // System.out.printf("start: %s\n", start);
            }
            Pattern pattern1= Pattern.compile("</(.*?)>");
            Matcher matcher1 = pattern1.matcher(line);
            if(matcher1.find()){
                end= matcher1.group(1);
                //System.out.printf("end:%s\n",end);
            }
            if(start.equals(end)){
                String between=null;
                Pattern pattern2= Pattern.compile(">(.*?)</");
                Matcher matcher2 = pattern2.matcher(line);
                if(matcher2.find()){
                    between= matcher2.group(1);
                    Pattern pattern3= Pattern.compile("<(.*?)>");
                    Matcher matcher3 = pattern3.matcher(between);
                    if(matcher3.find()){
                        String between1=between.substring(between.lastIndexOf(">") + 1);
                        //  System.out.printf("between:%s\n",between1);
                        System.out.println(between1);
                    }
                    else{
                        // System.out.printf("between:%s\n",between);
                        System.out.println(between);
                    }
                }

                //Write your code here


            }
            else{
                System.out.println("None");
            }

            testCases--;
        }
    }
}
