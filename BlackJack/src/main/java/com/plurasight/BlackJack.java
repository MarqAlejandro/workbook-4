package com.plurasight;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class BlackJack {
    public static void gameStart() {

        List<Player> players = new ArrayList<>();
        Deck deck = new Deck();
        deck.shuffle();

        int numberOfPlayers = GameMechanics.playerCount();

        Player house = new Player("House");
        players.add(house);

        for (int i = 1; i <= numberOfPlayers; i++) {                    //convert this to a method 
            System.out.print("Enter Player's Name: ");
            Player player = new Player(scanner.nextLine());

            players.add(player);

        }


        for (Player player : players){
            System.out.println("---------------------------------------");
            System.out.println(player.getName() + " was dealt 2 cards");
            player.Deal(deck.deal());
            player.Deal(deck.deal());
            player.displayHand();
            System.out.println();

            System.out.println("This hand is worth " + player.getValue());
            if(player.getValue() > 21){
                System.out.println("BUST");
            }
            System.out.println("---------------------------------------\n");

        }

        System.out.print("And the winner(s) is: ");
        int highestScore = 0;
        for(Player player : players){
            if(player.getValue() <= 21) {
                if (player.getValue() > highestScore) {
                    highestScore = player.getValue();
                }
            }

        }
        for(Player player : players){
            if(player.getValue() == highestScore){
                System.out.println(player.getName() + " with a score of " + player.getValue());
            }
        }



    }


}

