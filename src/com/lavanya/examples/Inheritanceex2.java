package com.lavanya.examples;

/**
 * Created by lavanya on 1/8/17.
 */
class Arithmetic{
    int add(int x1,int x2){
        return x1+x2;
    }
}
class Adder extends Arithmetic{

}
public class Inheritanceex2 {

    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
