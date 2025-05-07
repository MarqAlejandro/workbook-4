package com.plurasight;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void formatFirstAndLast() {
        //arrange
        String expectedResult = "Chopper, Tony";
        String actualResult;
        //act
        actualResult = NameFormatter.formatFirstAndLast("Tony","Chopper");
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void formatPrefixFirstAndLast() {
        String expectedResult = "Chopper, Dr. Tony";
        String actualResult;
        //act
        actualResult = NameFormatter.formatPrefixFirstAndLast("Dr.", "Tony","Chopper");
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void formatPrefixFirstLastSuffix() {
        String expectedResult = "Chopper, Dr. Tony, PhD";
        String actualResult;
        //act
        actualResult = NameFormatter.formatPrefixFirstLastSuffix("Dr.","Tony","Chopper", "PhD");
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void formatFirstMiddleLast() {
        String expectedResult = "Chopper, Tony T";
        String actualResult;
        //act
        actualResult = NameFormatter.formatFirstMiddleLast("Tony","Toni","Chopper");
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void formatPrefixFirstMiddleLast() {
        String expectedResult = "Chopper, Dr. Tony T";
        String actualResult;
        //act
        actualResult = NameFormatter.formatPrefixFirstMiddleLast("Dr.","Tony","Toni","Chopper");
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void formatPrefixFirstMiddleLastSuffix() {
        String expectedResult = "Chopper, Dr. Tony T, PhD";
        String actualResult;
        //act
        actualResult = NameFormatter.formatPrefixFirstMiddleLastSuffix("Dr.","Tony","Toni","Chopper", "PhD");
        //assert
        assertEquals(expectedResult, actualResult);
    }
}