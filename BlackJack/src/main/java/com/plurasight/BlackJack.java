package com.plurasight;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void gameStart() {
        Scanner scanner = new Scanner(System.in);

        List<Player> players = new ArrayList<>();
        Deck deck = new Deck();
        deck.shuffle();
        try {
            System.out.println("How many players are there?");
            int numberOfPlayers = scanner.nextInt();
            scanner.nextLine();

            //List<Player> players = new ArrayList<>();
            Player house = new Player("House");
            players.add(house);

            for (int i = 1; i <= numberOfPlayers; i++) {
                System.out.print("Enter Player's Name: ");
                Player player = new Player(scanner.nextLine());

                players.add(player);

            }

            for (Player player : players){
                System.out.println();
                System.out.println(player.getName() + " was dealt one card");
                player.Deal(deck.deal());
                player.displayHand();
                System.out.println("Hand: " + player.getSize());
                System.out.println("Deck:" + deck.getSize());
                System.out.println();

                int handValue = player.getValue();
                System.out.println("This hand is worth " + handValue);
            }



        }
        catch (InputMismatchException e){
            System.out.println("input was non-numerical. Please Try Again.");

        }

    }

}
