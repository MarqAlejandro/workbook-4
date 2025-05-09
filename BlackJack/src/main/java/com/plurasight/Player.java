package com.plurasight;

public class Player extends Hand {                  //player class that extends the hand class

    private String name;
    private boolean isWinning;
    private boolean isSafe;


    //constructors
    public Player(){
        this.name = "";

        this.isSafe = true;                     //used when determining if player busts or not

    }
    public Player(String name){
        this.name = name;

        this.isSafe = true;

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSafe() {
        return isSafe;
    }

    public void setSafe(boolean safe) {
        isSafe = safe;
    }
}
