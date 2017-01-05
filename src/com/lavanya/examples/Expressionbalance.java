package com.lavanya.examples;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lavanya on 1/4/17.
 */
public class Expressionbalance {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            //System.out.println("input is:" + input);
            boolean mistake = false;
            Stack<String> mystack = new Stack<String>();
            char[] a = input.toCharArray();
            for (int h = 0; h < a.length; h++) {

                if (Character.toString(a[h]).equals("{") || Character.toString(a[h]).equals("(") || Character.toString(a[h]).equals("[")) {
                    // System.out.println("character" + a[h]);
                    mystack.push(Character.toString(a[h]));
                    //for(int n=0;n<mystack.size();n++){
                    //System.out.println(mystack.get(n));
                    // }
                } else if (Character.toString(a[h]).equals("}")) {
                    // System.out.println("character" + a[h]);
                    //System.out.println("entered }");

                    if (!mystack.isEmpty()) {
                        if (mystack.peek().equals("{")) {
                            Object e = mystack.pop();
                            //  System.out.println(e);
                            //   for(int p=0;p<mystack.size();p++){
                            //System.out.println(mystack.get(p));
                            //  }
                        }
                    } else {
                        mistake = true;
                    }
                } else if (Character.toString(a[h]).equals(")")) {
                    // System.out.println("character" + a[h]);
                    // System.out.println("entered )");
                    if (!mystack.isEmpty()) {
                        if (mystack.peek().equals("(")) {
                            Object e = mystack.pop();
                            // System.out.println("removed");

                            // for(int t=0;t<mystack.size();t++){
                            //System.out.println(mystack.get(t));
                            //  }
                        }

                    } else {
                        mistake = true;
                    }

                } else if (Character.toString(a[h]).equals("]")) {
                    // System.out.println("character" + a[h]);
                    //System.out.println("entered ]");
                    if (!mystack.isEmpty()) {
                        if (mystack.peek().equals("[")) {
                            Object e = mystack.pop();
                            //System.out.println(e);
                            //for(int k=0;k<mystack.size();k++){
                            //System.out.println(mystack.get(k));
                            //  }
                        }


                    } else {
                        mistake = true;
                    }
                }
            }

            if (mystack.size() > 0) {
                //  for(int f=0;f<mystack.size();f++){
                //     System.out.println("after pop" +mystack.get(f));
                //}
                System.out.println("false");
            } else if (mystack.size() <= 0 && mistake == false) {

                System.out.println("true");
            } else if (mistake == true) {
                System.out.println("false");
            }


        }
    }

}
