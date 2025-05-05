package com.plurasight;

public class Reservation {
    private final String ROOMTYPE_KING  = "king";
    private final String ROOMTYPE_DOUBLE = "double";
    private String roomType;
    private boolean isKing;
    private final double PRICE_KING = 139.00;
    private final double PRICE_DOUBLE = 124.00;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private final double WEEKEND_MULTIPLIER = 1.1;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public Reservation(boolean isKing, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.isKing = isKing;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public Reservation() {
    }

    //made isKing so that FINAL String and double can be automated for later.

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean isKing) {
        isKing = isKing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }
}
