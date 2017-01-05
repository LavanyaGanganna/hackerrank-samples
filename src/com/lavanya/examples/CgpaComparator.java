package com.lavanya.examples;

import java.util.*;

/**
 * Created by lavanya on 1/5/17.
 */

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
class Cgpacomparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        double cgpa1=s1.getCgpa();
        double cgpa2=s2.getCgpa();
        if(cgpa1>cgpa2){
            return -1;
        }
        else if(cgpa1==cgpa2){
            if(s1.getFname().compareTo(s2.getFname())==0){
                if(s1.getId()>s2.getId()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            return s1.getFname().compareTo(s2.getFname());
        }


        return 1;
    }
}


public class CgpaComparator {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList,new Cgpacomparator());

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
