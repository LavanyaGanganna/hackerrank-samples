package com.lavanya.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by lavanya on 1/5/17.
 */
class Checker implements Comparator<Player> {

    public int compare(Player p1, Player p2) {
        int score1 = (Integer)p1.score;
        int score2 = (Integer)p2.score;
        // ascending order (descending order would be: name2.compareTo(name1))
        if (score2==score1){
            String name1=p1.name;
            String name2=p2.name;
            return name1.compareTo(name2);
        }

        else if(score2>score1){
            return 1;
        }
        return -1;

    }



}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Comparatorimplement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
