package com.plurasight;


import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cardsInHand;

    public Hand(){
        cardsInHand = new ArrayList<>();
    }

    // A Card is dealt to the Hand and the Hand is responsible
    // to store the card
    public void Deal(Card card){
        cardsInHand.add(card);
    }

    public int getSize(){
        return cardsInHand.size();
    }

    // The Hand uses the methods of each card to determine
    // the value of each card - and adds up all values
    public int getValue(){
        int value = 0;

        for(Card card: cardsInHand){
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }

        return value;
    }

    public void displayHand(){
        for(Card card: cardsInHand){
            card.flip();

            System.out.print(" | " + card.getValue() + " " + card.getSuit() + " |\t");
            card.flip();
        }
    }
}