package com.plurasight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String line1 = "12 drummers drumming";

        String substring1 = line1.substring(0, line1.indexOf(" "));

        String line2 = "11 drummers drumming";

        String substring2 = line2.substring(0, line1.indexOf(" "));

        List<String> array = new ArrayList<>();

        array.add(substring1);
        array.add(substring2);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return 0;
            }
        }






        System.out.println(substring1.compareTo(substring2));
    }
}