package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 12/30/16.
 */
public class ValidIp {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

}
class MyRegex{

    String pattern="\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";

}