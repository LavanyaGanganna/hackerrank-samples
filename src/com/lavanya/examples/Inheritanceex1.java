package com.lavanya.examples;

/**
 * Created by lavanya on 1/8/17.
 */
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am Singing");
    }
}


public class Inheritanceex1 {
    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}
