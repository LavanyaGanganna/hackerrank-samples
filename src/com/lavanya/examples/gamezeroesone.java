package com.lavanya.examples;

import java.util.Scanner;

/**
 * Created by lavanya on 1/3/17.
 */
public class gamezeroesone {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int testcases=scanner.nextInt();
        for(int x=0;x<testcases;x++){
            int nval=scanner.nextInt();
            int mval=scanner.nextInt();
            int[] a=new int[nval];
            for(int y=0;y<nval;y++){
                a[y]=scanner.nextInt();
            }
            int z=0;
            for(z=0;z<nval-1;z++){
                if(a[z]==0 && a[z+1]==0){
                    continue;
                }
                else if(a[z]==0 && a[z+1]!=0){


                    if((z+mval) > (nval-1)){
                        z=z+mval;
                        System.out.println("YES");
                        break;
                    }

                    else if((z+mval)<(nval -1)&& a[z+mval]==0){
                        z=z+mval;
                        for(int c=z;c<nval-1;c=c+mval){
                            if(a[c]==0){
                                if(c==nval-1){
                                    System.out.println("YES");
                                    break;
                                }
                            }
                            else if(a[c]!=0 && c==nval -1){
                                System.out.println("NO");
                                break;
                            }

                        }
                    }
                    else if((z+mval)<=nval-1 && a[z+mval]==1 ){
                        System.out.println("NO");
                        break;
                    }



                }
            }
            if(z==nval-1){
                System.out.println("YES");
            }

        }

    }
}
