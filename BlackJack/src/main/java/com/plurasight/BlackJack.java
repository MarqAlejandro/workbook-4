package com.plurasight;

import java.util.ArrayList;

import java.util.List;

public class BlackJack {

    private static List<Player> players = new ArrayList<>();

    private static Deck deck = GameMechanics.deckSetUp();

    public static void gameStart() {                    //main game control method


        playerSetUp();
        gameSetUp();
        gamePlay();
        andTheWinnerIs();


    }

    public void test(){
        System.out.println("test");
    }

    public static void playerSetUp(){                   //method to get number of players via prompt and adds players to the arrayList
        int numberOfPlayers = GameMechanics.playerCount();

        for (int i = 1; i <= numberOfPlayers; i++) {

            players.add(GameMechanics.playerAdded());
        }

        players.add(GameMechanics.houseAdded());


    }

    public static void gameSetUp(){                 //method shell

        GameMechanics.displayDealtCards(players,deck);
    }

    public static void gamePlay() {                 //method shell
        for (Player player : players) {
            System.out.println("\n\n\t\t" + player.getName() + "'s turn\n\n");
            GameMechanics.hitOrStay(player, deck);
        }
    }

    public static void andTheWinnerIs(){            //method to decide a winner
        System.out.print("And the winner(s) is: ");
        int highestScore = 0;
        for(Player player : players){
            if(player.getValue() <= 21) {
                if (player.getValue() > highestScore) {
                    highestScore = player.getValue();
                }
            }

        }
        GameMechanics.printWinners(players, highestScore);


    }


}

