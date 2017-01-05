package com.lavanya.examples;

import java.lang.reflect.Method;

/**
 * Created by lavanya on 1/5/17.
 */

class Printer
{
    public <E> void printArray(E[] inputarray){
        for(E element: inputarray){
            System.out.println(element);
        }
    }
}
public class Genericsprint {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }


}
