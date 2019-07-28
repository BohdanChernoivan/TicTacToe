package game.controller;

import game.gamer.Player;

import java.util.Scanner;

public class GameControl {

    private Scanner scanner;

    public GameControl() {
        scanner= new Scanner(System.in);
    }

    public int enterRow(Player player) {

        System.out.println(player.getName() + " enter row");
        return scanner.nextInt();
    }

    public int enterColumn(Player player) {

        System.out.println(player.getName() + " enter column");
        return scanner.nextInt();
    }
}
