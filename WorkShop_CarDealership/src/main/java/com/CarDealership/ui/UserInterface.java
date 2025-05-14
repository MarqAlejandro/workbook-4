package com.CarDealership.ui;

import com.CarDealership.data.Dealership;
import com.CarDealership.data.DealershipFileManager;
import com.CarDealership.model.Vehicle;
import com.CarDealership.model.vehicleCreator;
import java.time.LocalDateTime;

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
                System.out.println("Enter Minimum Price, followed by Maximum Price.\n");
                dealership.getVehiclesByPrice(InputPrompter.getDoubleInput(),InputPrompter.getDoubleInput());
                display();
                break;
            case 2:
                System.out.println("Enter Make, followed by Model.\n");
                dealership.getVehiclesByMakeModel(InputPrompter.getSingleString(),InputPrompter.getSingleString());
                display();
                break;
            case 3:
                System.out.println("Enter Minimum Year, followed by Maximum Year.\n");
                dealership.getVehiclesByYear(InputPrompter.getIntInput(),InputPrompter.getIntInput());
                display();
                break;
            case 4:
                System.out.println("Enter Color.\n");
                dealership.getVehiclesByColor(InputPrompter.getSingleString());
                display();
                break;
            case 5:
                System.out.println("Enter Minimum Mileage, followed by Maximum Mileage.\n");
                dealership.getVehiclesByMileage(InputPrompter.getIntInput(),InputPrompter.getIntInput());
                display();
                break;
            case 6:
                System.out.println("Enter Vehicle Type.\n");
                dealership.getVehiclesByType(InputPrompter.getSingleString());
                display();
                break;
            case 7:
                dealership.getAllVehicles();
                display();
                break;
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
                exit();
                break;
            default:
                System.out.println("Entry was not one of the following options, Please Try Again");
                display();
        }

    }

    private void exit(){
        System.out.println("Exiting the program, have a good day.");
        System.exit(0);
    }
}
