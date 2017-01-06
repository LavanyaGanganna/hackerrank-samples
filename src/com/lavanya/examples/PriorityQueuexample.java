package com.lavanya.examples;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by lavanya on 1/6/17.
 */

class Students{
    private int token;
    private String fname;
    private double cgpa;
    public Students(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
class Studentcomparator implements Comparator<Students> {
    public int compare(Students s1,Students s2){
        double cgpa1=s1.getCgpa();
        double cgpa2=s2.getCgpa();
        if(cgpa1>cgpa2){
            return -1;
        }
        else if(cgpa1==cgpa2){
            String fnam1=s1.getFname();
            String fnam2=s2.getFname();
            if(fnam1.compareTo(fnam2)==0){
                int token1=s1.getToken();
                int token2=s2.getToken();
                if(token1>token2){
                    return -1;
                }
                else{
                    return 1;
                }
            }
            else{
                return fnam1.compareTo(fnam2);
            }
        }
        return 1;
    }
}
public class PriorityQueuexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        Comparator<Students> comparator=new Studentcomparator();
        PriorityQueue<Students> studqueue=new PriorityQueue<Students>(totalEvents,comparator);
        while(totalEvents>0){
            String event = in.nextLine();
            //  System.out.println(event);
            if(event.equals("SERVED") && studqueue.isEmpty()){
                if(totalEvents>0){
                    // System.out.println("entered here" + totalEvents);
                    totalEvents--;
                    continue;
                }

            }
            else if(event.equals("SERVED") && !studqueue.isEmpty()){
                studqueue.remove();
            }

            else{
                String[] splited=event.split("\\s+");
                Students student=new Students(Integer.parseInt(splited[3]),splited[1],Double.parseDouble(splited[2]));
                studqueue.add(student);
                //Complete your code
            }
            totalEvents--;
        }

        if(studqueue.peek()==null){
            System.out.println("EMPTY");
        }
        else{
            Iterator iterator=studqueue.iterator();
            while(iterator.hasNext()){

                Students newstud=studqueue.poll();

                System.out.println(newstud.getFname());

            }
        }
        //for(int x=0;x<studqueue.size();x++){
        //  System.out.println(studqueue);//studqueue.get(x).getFname());
        //}
    }
}
