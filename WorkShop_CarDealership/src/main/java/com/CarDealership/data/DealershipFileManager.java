package com.CarDealership.data;

import java.io.File;

public class DealershipFileManager {
   private static File file = new File("src/main/java/com/CarDealership/data/Inventory.csv");

   public static void fileCheck() {
       if (file.exists()) {
           System.out.println("its Alive");
       } else {
           System.out.println("the file does not exist");
       }
   }

}
