package com.CarDealership.ui;

import com.CarDealership.data.Dealership;
import com.CarDealership.data.DealershipFileManager;
import com.CarDealership.model.Vehicle;
import com.CarDealership.model.vehicleCreator;

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

            //all display methods need to be fleshed out__________________________________________________
            /*
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
          */
            case 7:
                dealership.getAllVehicles();
                display();
                break;

            //___________________________________________________________________________________________
            case 8:
                Vehicle addVehicle = vehicleCreator.createVehicle();
                dealership.addVehicles(addVehicle);
                display();
                break;
            case 9:
                Vehicle rmVehicle = vehicleCreator.createVehicle();
                dealership.removeVehicles(rmVehicle);
                display();
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
