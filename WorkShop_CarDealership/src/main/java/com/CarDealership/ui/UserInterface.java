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
                break;
            case 2:
                dealership.getVehiclesByMakeModel("","");
                break;
            case 3:
                dealership.getVehiclesByYear(0,0);
                break;
            case 4:
                dealership.getVehiclesByColor("");
                break;
            case 5:
                dealership.getVehiclesByMileage(0,0);
                break;
            case 6:
                dealership.getVehiclesByType("");
                break;
            case 7:
                dealership.getAllVehicles();
                break;
            case 8:
                //create a method that prompts the user to input info for a vehicle, return a vehicle object
                //dealership.addVehicles(// vehicle from prompt will go here);
                break;
            case 9:
                //create a method that prompts the user to input info for a vehicle, return a vehicle object
               // dealership.removeVehicles(// vehicle from prompt will go here);
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
