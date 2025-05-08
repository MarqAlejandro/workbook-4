package com.plurasight;

public class Player extends Hand {

    private String name;
    private int totalCardValue;

    //constructors
    public Player(){
        this.name = "";
        this.totalCardValue = 0;
    }
    public Player(String name){
        this.name = name;
        this.totalCardValue = 0;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCardValue() {
        return totalCardValue;
    }

    public void setTotalCardValue(int totalCardValue) {
        this.totalCardValue = totalCardValue;
    }
}
