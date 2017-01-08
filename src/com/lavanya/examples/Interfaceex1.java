package com.lavanya.examples;

/**
 * Created by lavanya on 1/8/17.
 */
import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int divisorcnt=0;
        for(int x=1;x<=n;x++){
            if(n%x==0){
                //  System.out.println("inside if");
                divisorcnt=divisorcnt+x;
            }
        }
        return divisorcnt;
    }
}

public class Interfaceex1 {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
