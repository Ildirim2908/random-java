package Comparator;

import java.util.Arrays;
import java.util.Comparator;
public class PlayerApp {
    public static void main(String[] args) {
        Players[] players = new Players[4];
        players[0]= new Players("Alex", 100);
        players[1] = new Players("Pippin", 85);
        players[2]= new Players("Bilbo", 92);
        players[3] = new Players("Gandalf", 100);
        Arrays.sort(players, new Checker());
        for(Players player : players){
            System.out.println(player.name+" "+player.score);
        }

    }

}








