package com.plurasight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMechanics {
   public static Scanner scanner = new Scanner(System.in);

    public static int playerCount() {
        int numberOfPlayers = 0;
        try {
            System.out.println("How many players are there?");
            numberOfPlayers = scanner.nextInt();
            scanner.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("input was non-numerical. Please Try Again.");
            playerCount();
        }
        return numberOfPlayers;
    }

    public static void playerAdded(){

    }
}
