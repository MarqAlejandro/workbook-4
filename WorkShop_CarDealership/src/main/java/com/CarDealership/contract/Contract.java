package com.CarDealership.contract;

public abstract class Contract {

    protected String date;
    protected String name;
    protected String email;
    protected boolean isSold;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract(String date, String name, String email, boolean isSold) {
        this.date = date;
        this.name = name;
        this.email = email;
        this.isSold = isSold;
        this.totalPrice = 0;
        this.monthlyPayment = 0;
    }

    public Contract() {
        this.date = "";
        this.name = "";
        this.email = "";
        this.isSold = false;
        this.monthlyPayment = 0;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
    //abstract methods below
    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();

}
