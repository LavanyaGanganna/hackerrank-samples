package com.lavanya.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lavanya on 1/2/17.
 */
public class twodimenhourglass {
    public static void main(String[] args) {
        List<Integer> sumlist=new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int m=0;m<4;m++){
            int sum=0;
            for(int k=0;k<3;k++){
                if(k !=1){
                    for(int l=m;l<m+3;l++){
                        sum=sum+arr[k][l];
                    }

                }
                else{
                    sum=sum+arr[1][m+1];
                }
            }
            sumlist.add(sum);
        }

        for(int n=0;n<4;n++){
            int sums=0;
            for(int e=3;e<6;e++){
                if(e !=4){
                    for(int p=n;p<n+3;p++){
                        sums=sums+arr[e][p];
                    }
                }
                else{
                    sums=sums+arr[4][n+1];
                }
            }
            sumlist.add(sums);
        }

        for(int u=0;u<4;u++){
            int sumsup=0;
            for(int v=1;v<4;v++){
                if(v!=2){
                    for(int w=u;w<u+3;w++){
                        sumsup=sumsup+arr[v][w];
                    }
                }
                else{
                    sumsup=sumsup+arr[2][u+1];
                }
            }
            sumlist.add(sumsup);
        }

        for(int y=0;y<4;y++){
            int sumup=0;
            for(int r=2;r<5;r++){
                if(r!=3){
                    for(int t=y;t<y+3;t++){
                        sumup=sumup+arr[r][t];
                    }
                }
                else{
                    sumup=sumup+ arr[3][y+1];
                }
            }
            sumlist.add(sumup);
        }



        int maxval= Collections.max(sumlist);
        System.out.println(maxval);

    }
}
