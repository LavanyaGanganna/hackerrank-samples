package com.lavanya.examples;

import java.util.*;

/**
 * Created by lavanya on 1/5/17.
 */
public class Dequetosubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
        }
        ArrayList<Integer> uniqelems=new ArrayList<Integer>();
        for(int f=0;f<n-m;f++){
            Iterator iterator=deque.iterator();
            ArrayList<Integer> arraylists= new ArrayList<>();
            while(iterator.hasNext() && arraylists.size()<m){
                int element=(Integer)iterator.next();
                //System.out.println(element);
                arraylists.add(element);
            }
            deque.removeFirst();
            Set set=new HashSet(arraylists);
            uniqelems.add(set.size());

        }
        System.out.println(Collections.max(uniqelems));
    }
}
