package com.plurasight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite){
            int availableSuites = getAvailableSuites();
            if(availableSuites > 0){
                bookedSuites += numberOfRooms;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            int availableRooms = getAvailableRooms();
            if(availableRooms > 0){
                bookedRooms += numberOfRooms;
                return true;
            }
            else{
                return false;
            }
        }
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedRooms;
    }
}
