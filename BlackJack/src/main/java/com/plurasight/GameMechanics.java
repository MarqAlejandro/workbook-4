package com.plurasight;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GameMechanics {                            //static methods to clean up code
   public static Scanner scanner = new Scanner(System.in);
   private static int numberOfPlayers = 0;

   public static Deck deckSetUp(){                      //set up the deck
       Deck deck = new Deck();
       deck.shuffle();

       return deck;
   }


    public static int playerCount() {               //prompter for player count, returns an int
        try {
            System.out.print("How many players are there?" +
                             "\nPlayers: ");
            numberOfPlayers = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("input was non-numerical. Please Try Again.");
            scanner.nextLine();
            playerCount();
        }
        return numberOfPlayers;
    }

    public static Player houseAdded(){          //presetter for the house player

        return new Player("House");
    }

    public static Player playerAdded(){         //prompter for named player

       System.out.print("Enter Player's Name: ");

        return new Player(scanner.nextLine());
    }

    public static void displayDealtCards(List<Player> playerList, Deck deck) {      //display a players hand
        for (Player player : playerList) {

            System.out.println("\n---------------------------------------");
            System.out.println(player.getName() + " was dealt 2 cards");
            player.Deal(deck.deal());
            player.Deal(deck.deal());
            player.displayHand();

            System.out.println("Deck: " + deck.getSize());
            System.out.println();
            safeOrBust(player);
            System.out.println("---------------------------------------");
        }
    }

    public static void hitOrStay(Player player, Deck deck){                 //prompter for play to hit or stay

               if(!player.getName().equalsIgnoreCase("house") && player.isSafe()){

                   System.out.print("\tHit(press h)\tor\tStay(press s)" +
                           "\n\n>>");
                   String userInput = scanner.nextLine();

                   if(userInput.equalsIgnoreCase("h")){
                        player.Deal(deck.deal());
                        player.displayHand();

                       System.out.println("Deck: " + deck.getSize());
                       safeOrBust(player);

                       hitOrStay(player, deck);

                   }
                   else if(userInput.equalsIgnoreCase("s")){                }

                   else{ //this assumes that the user has inputted something other than h or s
                       System.out.println("Input invalid. please try again");
                       hitOrStay(player, deck);
                   }

               }
               else if(player.isSafe()){    //house logic here
                    if(player.getValue() <= 16){
                        player.Deal(deck.deal());
                        player.displayHand();

                        System.out.println("Deck: " + deck.getSize());
                        safeOrBust(player);

                        hitOrStay(player, deck);
                    }
               }


    }

    public static void safeOrBust(Player player){                       //logic for if the player busts
        System.out.println("\nThis hand is worth " + player.getValue());
        if(player.getValue() > 21){
            System.out.println("!!! BUST !!!");
            player.setSafe(false);
        }
    }

    public static void printWinners(List<Player> players ,int highestScore){    //print out the winning player
        for(Player player : players){
            if(player.getValue() == highestScore){
                System.out.println(player.getName() + " with a score of " + player.getValue());
            }
        }
    }





}
