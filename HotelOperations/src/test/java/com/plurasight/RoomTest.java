package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_shouldExpectIsOccupiedAndIsDirty() {
        //arrange
        Room room = new Room();
        boolean expectedIsOccupied = true; // initalized as false
        boolean expectedIsDirty = true;                    //false
        boolean expectedIsAvailable = false;                //true

        //act
        room.checkIn();                             //assuming this works


        //assert
        assertEquals(expectedIsOccupied, room.isOccupied());
        assertEquals(expectedIsDirty,room.isDirty());
        assertEquals(expectedIsAvailable, room.isAvailable());
    }

    @Test
    void checkOut() {

        //arrange
        Room room = new Room();
        boolean expectedIsOccupied = false; // initalized as true
        boolean expectedIsDirty = false;                    //true
        boolean expectedIsAvailable = true;                //false
        //act
        room.checkOut();


        //assert
        assertEquals(expectedIsOccupied, room.isOccupied());
        assertEquals(expectedIsDirty,room.isDirty());
        assertEquals(expectedIsAvailable, room.isAvailable());

    }

    @Test
    void cleanRoom() {

        //arrange
        Room room = new Room();

        boolean expectedIsDirty = false;                    //true

        //act
        room.cleanRoom();

        //assert
        assertEquals(expectedIsDirty,room.isDirty());
    }
}