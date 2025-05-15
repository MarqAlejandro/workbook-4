package com.CarDealership.contract;

public class SalesContract extends Contract{

    private final double SALES_TAX = 0.05;
    private final double RECORDING_FEE = 100;
    private double processingFee;
    private boolean isFinancing;
    private double monthlyIfFinancing;

    public SalesContract(String date, String name, String email, boolean isSold, double processingFee, boolean isFinancing, double monthlyIfFinancing) {
        super(date, name, email, isSold);
        this.processingFee = processingFee;
        this.isFinancing = isFinancing;
        this.monthlyIfFinancing = monthlyIfFinancing;
    }

    public double getSALES_TAX() {
        return SALES_TAX;
    }

    public double getRECORDING_FEE() {
        return RECORDING_FEE;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinancing() {
        return isFinancing;
    }

    public void setFinancing(boolean financing) {
        isFinancing = financing;
    }

    public double getMonthlyIfFinancing() {
        return monthlyIfFinancing;
    }

    public void setMonthlyIfFinancing(double monthlyIfFinancing) {
        this.monthlyIfFinancing = monthlyIfFinancing;
    }

    @Override
    public double getTotalPrice(){              //add formula for getting total price

        return totalPrice;
    }

    @Override
    public double getMonthlyPayment(){         //if not financing then calculate monthly payment, else if financing then calculate different monthly payment

        return monthlyPayment;
    }


}
