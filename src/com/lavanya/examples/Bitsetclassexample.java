package com.lavanya.examples;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by lavanya on 1/6/17.
 */
public class Bitsetclassexample {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        BitSet B1=new BitSet(n);
        BitSet B2=new BitSet(n);
        // System.out.println("B1:"+ B1);
        //System.out.println("B2:"+ B2);
        ArrayList<Integer> count1list=new ArrayList<Integer>();
        ArrayList<Integer> count2list=new ArrayList<Integer>();

        scanner.nextLine();
        for(int f=0;f<m;f++){
            String input=scanner.nextLine();
            //System.out.println(input);
            int count1=0;
            int count2=0;
            String[] splited = input.split("\\s+");
            if(splited[0].equals("AND")){
                if(splited[1].equals("1") && splited[2].equals("2")){
                    B1.and(B2);

                    for(int g=0;g<B1.length();g++){
                        if(B1.get(g)){
                            count1++;
                        }
                    }
                    for(int d=0;d<B2.length();d++){
                        if(B2.get(d)){
                            count2++;
                        }
                    }
                    count1list.add(count1);
                    count2list.add(count2);

                }

                else if(splited[1].equals("2")&& splited[2].equals("1")){
                    B2.and(B1);
                    for(int y=0;y<B1.length();y++){
                        if(B1.get(y)){
                            count1++;
                        }
                    }
                    for(int x=0;x<B2.length();x++){
                        if(B2.get(x)){
                            count2++;
                        }
                    }
                    count1list.add(count1);
                    count2list.add(count2);

                }
                // System.out.println("B1:" +B1);
                //System.out.println("B2:"+ B2);
            }

            else if(splited[0].equals("SET")){
                if(splited[1].equals("1")){
                    B1.set(Integer.parseInt(splited[2]));
                }
                else if(splited[1].equals("2")){
                    B2.set(Integer.parseInt(splited[2]));
                }
                for(int z=0;z<B1.length();z++){
                    if(B1.get(z)){
                        count1++;
                    }
                }
                for(int s=0;s<B2.length();s++){
                    if(B2.get(s)){
                        count2++;
                    }
                }
                count1list.add(count1);
                count2list.add(count2);
                // System.out.println("B1:" +B1);
                //System.out.println("B2:"+ B2);
            }
            else if(splited[0].equals("FLIP")){
                if(splited[1].equals("1")){
                    // System.out.println("entered flip:" + splited[1] + " " + splited[2]);
                    B1.flip(Integer.parseInt(splited[2]));
                }
                else if(splited[1].equals("2")){
                    // System.out.println("entered secondflip:" + splited[1] + " " + splited[2]);
                    B2.flip(Integer.parseInt(splited[2]));
                }
                for(int q=0;q<B1.length();q++){
                    if(B1.get(q)){
                        count1++;
                    }
                }
                for(int q1=0;q1<B2.length();q1++){
                    if(B2.get(q1)){
                        count2++;
                    }
                }
                count1list.add(count1);
                count2list.add(count2);
                // System.out.println("B1:"+ B1);
                // System.out.println("B2:"+ B2);
            }
            else if(splited[0].equals("OR")){
                if(splited[1].equals("1") && splited[2].equals("2")){
                    B1.or(B2);
                }
                else if(splited[1].equals("2")&& splited[2].equals("1")){
                    B2.or(B1);
                }
                for(int q2=0;q2<B1.length();q2++){
                    if(B1.get(q2)){
                        count1++;
                    }
                }
                for(int q3=0;q3<B2.length();q3++){
                    if(B2.get(q3)){
                        count2++;
                    }
                }
                count1list.add(count1);
                count2list.add(count2);
                //  System.out.println("B1:" +B1);
                //System.out.println("B2:" +B2);
            }
            else if(splited[0].equals("XOR")){
                if(splited[1].equals("1") && splited[2].equals("2")){
                    B1.xor(B2);
                }
                else if(splited[1].equals("2")&& splited[2].equals("1")){
                    B2.xor(B1);
                }
                for(int q4=0;q4<B1.length();q4++){
                    if(B1.get(q4)){
                        count1++;
                    }
                }
                for(int q5=0;q5<B2.length();q5++){
                    if(B2.get(q5)){
                        count2++;
                    }
                }
                count1list.add(count1);
                count2list.add(count2);
                //   System.out.println("B1:"+ B1);
                // System.out.println("B2:"+ B2);
            }

        }
        for(int e=0;e<count1list.size();e++){
            System.out.println(count1list.get(e)+" " + count2list.get(e));
        }
    }
}
