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

    public void getVehiclesByPrice(int min, int max){}

    public void getVehiclesByMakeModel(String make, String model){}

    public  void getVehiclesByYear(int min, int max){}

    public void getVehiclesByColor(String color){}

    public void getVehiclesByMileage(int min, int max){}

    public void getVehiclesByType(String vehicleType){}

    public void getAllVehicles(){
        for (Vehicle vehicle : inventory){

            System.out.println(vehicle.getVin());  //just for testing purposes right now
        }

    }

    public void addVehicles(Vehicle vehicle){}

    public void removeVehicles(Vehicle vehicle){}



    public void fileLoad(){

        DealershipFileManager.fileCheck();
    }


}
