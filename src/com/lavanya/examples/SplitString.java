package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 1/1/17.
 */
public class SplitString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
     /*   Pattern p = Pattern.compile("[\\s!?,.'_@]");
        Matcher m= p.matcher(s);
        List<String> tokens = new ArrayList<String>();
        while(m.find()){
            String token = m.group( 1 ); //group 0 is always the entire match
            tokens.add(token);
        }*/
        String[] tokens=  s.split("[\\s!?,.'_@;:]+");
        // Write your code here.
        System.out.println(tokens.length);
        for(int i=0;i<tokens.length;i++){
            System.out.println(tokens[i]);
        }
        scan.close();
    }
}
