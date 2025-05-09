package com.CarDealership.data;

import com.CarDealership.model.Vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DealershipFileManager {
   private static File file = new File("src/main/resources/Inventory.csv");

   public static List<Vehicle> getDealership(){

       List<Vehicle> inventoryOfVehicles = new ArrayList<>();

       try {
           System.out.println("Loading Vehicles' Information");

           BufferedReader bufReader = new BufferedReader(new FileReader(file));     //BufferedReader variable that takes a FileReader as arguement that takes a .csv file arguement
           String FileInput;                                                                               //String Variable to hold transaction info

           bufReader.readLine();                                                                           //skip the first line, assumes that the first line is headers and garbage data

           while ((FileInput = bufReader.readLine()) != null) {                                            //in the midst of while loop read a line from .csv file and load it onto String Variable and check if it comes out null
               String[] tokens = FileInput.split(Pattern.quote("|"));                                   //load the line onto a String array so that it can be partitioned by the pattern "|"
               Vehicle vehicle = new Vehicle();                                                            //create an empty Vehicle object
               if (tokens.length == 8) {
                   vehicle.setVin(Integer.parseInt(tokens[0]));

                   vehicle.setYear(Integer.parseInt(tokens[1]));

                   vehicle.setMake(tokens[2]);

                   vehicle.setModel(tokens[3]);

                   vehicle.setVehicleType(tokens[4]);                                   //will load and set all transaction information only if there is exactly 5 elements in the String Array

                   vehicle.setColor(tokens[5]);

                   vehicle.setOdometer(Integer.parseInt(tokens[6]));

                   vehicle.setPrice(Double.parseDouble(tokens[7]));
               } else {
                   System.out.println("error: missing or too much information on a given transaction");
               }
               inventoryOfVehicles.add(vehicle);                                                         //load the object onto the ArrayList for Transaction objects
           }
           bufReader.close();

       } catch (IOException e) {                                                                       //in case of an error with I/O, however should never proc
           System.out.println("error with .csv file naming, please check if its the correct save file");

       }

       return inventoryOfVehicles;
   }

   public static void saveDealerShip(){}

   public static void fileCheck() {
       if (file.exists()) {
           System.out.println("its Alive");
       } else {
           System.out.println("the file does not exist");
       }
   }

}
