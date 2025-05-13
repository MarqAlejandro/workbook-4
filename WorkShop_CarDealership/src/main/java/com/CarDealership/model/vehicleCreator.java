package com.CarDealership.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class vehicleCreator {

    public static Vehicle createVehicle(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter VIN: ");
            int vin = scanner.nextInt();

            System.out.print("\nEnter Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.print("\nEnter make: ");
            String make = scanner.nextLine();

            System.out.print("\nEnter model: ");
            String model = scanner.nextLine();

            System.out.print("\nEnter Vehicle Type: ");
            String vehicleType = scanner.nextLine();

            System.out.print("\nEnter Color: ");
            String color = scanner.nextLine();

            System.out.print("\nEnter Odometer reading: ");
            int odometer = scanner.nextInt();

            System.out.print("\nEnter Price: ");
            double price = scanner.nextDouble();

            scanner.nextLine();

            return new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);


        }
        catch (InputMismatchException e){
            System.out.println("1 or more inputs were incorrect. Please Try Again.");
            createVehicle();
        }


        return null;
    }
}
