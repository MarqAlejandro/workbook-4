package com.CarDealership.ui;

import com.CarDealership.data.Dealership;
import com.CarDealership.data.DealershipFileManager;

import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;


    private void init(){
        dealership = DealershipFileManager.getDealership();
    }


    public void display(){
        init();
        DisplayMenu.displayMenu();

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        scanner.nextLine();

        switch (userInput){
            case 1:
                dealership.getVehiclesByPrice(0,0);
                System.out.println("This");
                break;
            case 2:
                dealership.getVehiclesByMakeModel("","");
                System.out.println("is");
                break;
            case 3:
                dealership.getVehiclesByYear(0,0);
                System.out.println("a");
                break;
            case 4:
                dealership.getVehiclesByColor("");
                System.out.println("work");
                break;
            case 5:
                dealership.getVehiclesByMileage(0,0);
                System.out.println("in");
                break;
            case 6:
                dealership.getVehiclesByType("");
                System.out.println("progress");
                break;
            case 7:
                dealership.getAllVehicles();
                System.out.println("!");
                break;


                //maybe even make a helper class for this
            case 8:
                //create a method that prompts the user to input info for a vehicle, return a vehicle object
                //dealership.addVehicles(// vehicle from prompt will go here);
                break;
            case 9:
                //create a method that prompts the user to input info for a vehicle, return a vehicle object
               // dealership.removeVehicles(// vehicle from prompt will go here);
                break;
            case 99:
            default:
                exit();
        }

    }

    private void exit(){
        System.out.println("Exiting the program, have a good day.");
        System.exit(0);
    }
}
