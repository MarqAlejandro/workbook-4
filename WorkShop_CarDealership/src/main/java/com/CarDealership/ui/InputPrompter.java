package com.CarDealership.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputPrompter {

    public static String getSingleString(){
        String singleString = "";
        try {
            System.out.print("Enter: ");
            Scanner scanner = new Scanner(System.in);
            singleString = scanner.nextLine().trim().toLowerCase();
            System.out.println();

            return singleString;
        } catch (Exception e) {
            System.out.println("somehow an error with a String Variable");
        }
        return singleString;
    }

    public static int getIntInput(){
        int convertedStringToInt = 0;
        try{
            convertedStringToInt = Integer.parseInt(getSingleString());

            return convertedStringToInt;
        }
        catch (InputMismatchException e){
            System.out.println("String Input Failed to Convert, most like due to it not being a number");
        }
        return convertedStringToInt;
    }

    public static double getDoubleInput(){
        double convertedStringToDouble = 0;
        try{
            convertedStringToDouble = Double.parseDouble(getSingleString());

            return convertedStringToDouble;
        }
        catch (InputMismatchException e){
            System.out.println("String Input Failed to Convert, most like due to it not being a number");
        }
        return convertedStringToDouble;
    }



}
