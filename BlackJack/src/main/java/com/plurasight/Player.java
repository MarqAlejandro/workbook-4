package com.plurasight;

public class Player extends Hand {

    private String name;


    //constructors
    public Player(){
        this.name = "";

    }
    public Player(String name){
        this.name = name;

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
