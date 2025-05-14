package com.CarDealership.data;

import com.CarDealership.model.Vehicle;
import com.CarDealership.ui.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private static List<Vehicle> inventory = DealershipFileManager.getInventory();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public Dealership(){
        this.name = "";
        this.address = "";
        this.phone = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void getVehiclesByPrice(double min,double max){
        boolean isFound = false;
        for (Vehicle vehicle : inventory){
            if( (vehicle.getPrice() >= min) && (vehicle.getPrice() <= max) ){
                vehicle.display();
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("No results in the Database");
        }

    }

    public void getVehiclesByMakeModel(String make, String model){
        boolean isFound = false;
        for (Vehicle vehicle : inventory){
            if((vehicle.getMake().equalsIgnoreCase(make)) && (vehicle.getModel().equalsIgnoreCase(model))){
                vehicle.display();
                isFound = true;
            }
        }
        System.out.println();
        if(!isFound){
            System.out.println("No results in the Database");
        }
    }

    public  void getVehiclesByYear(int min, int max){
        boolean isFound = false;
        for (Vehicle vehicle : inventory){
            if( (vehicle.getYear() >= min) && (vehicle.getYear() <= max) ){
                vehicle.display();
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("No results in the Database");
        }

    }

    public void getVehiclesByColor(String color){
        boolean isFound = false;
        for (Vehicle vehicle : inventory){
            if(vehicle.getColor().equalsIgnoreCase(color)) {
                vehicle.display();
                isFound = true;
            }
        }
        System.out.println();
        if(!isFound){
            System.out.println("No results in the Database");
        }
    }
    public void getVehiclesByMileage(int min, int max){
        boolean isFound = false;
        for (Vehicle vehicle : inventory){
            if( (vehicle.getOdometer() >= min) && (vehicle.getOdometer() <= max) ){
                vehicle.display();
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("No results in the Database");
        }
    }

    public void getVehiclesByType(String vehicleType){
        boolean isFound = false;
        for (Vehicle vehicle : inventory){
            if(vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                vehicle.display();
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("No results in the Database");
        }
    }

    public void getAllVehicles(){
        for (Vehicle vehicle : inventory){
           vehicle.display();
        }
    }
    public void addVehicles(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicles(Vehicle vehicle) {
        int vehiclePosition = 0;
        for (Vehicle vehicle1 : inventory) {
            if (vehicle1.getVin() == vehicle.getVin()) {
                vehiclePosition = inventory.indexOf(vehicle1);
            }
        }
        inventory.remove(vehiclePosition);
    }
    public void fileLoad(){
        DealershipFileManager.fileCheck();
    }


}
