package com.CarDealership.data;

import com.CarDealership.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void getVehiclesByPrice(int min, int max){}

    public void getVehiclesByMakeModel(String make, String model){}

    public void getVehiclesByYear(int min, int max){}

    public void getVehiclesByColor(String color){}

    public void getVehiclesByMileage(int min, int max){}

    public void getVehiclesByType(String vehicleType){}

    public void getAllVehicles(){}

    public void addVehicles(Vehicle vehicle){}

    public void removeVehicles(Vehicle vehicle){}



    public static void fileLoad(){

        DealershipFileManager.fileCheck();
    }


}
