package com.plurasight;

public class NameFormatter {

    public static String formatFirstAndLast(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String formatPrefixFirstAndLast(String prefix, String firstName, String lastName) {
        return lastName + ", " + prefix + " " + firstName;
    }

    public static String formatPrefixFirstLastSuffix(String prefix, String firstName, String lastName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + ", " + suffix;
    }

    public static String formatFirstMiddleLast(String firstName,
                                               String middleName,
                                               String lastName) {
        return lastName + ", " + firstName + " " + middleName.charAt(0);
    }

    public static String formatPrefixFirstMiddleLast(String prefix,
                                                     String firstName,
                                                     String middleName,
                                                     String lastName) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName.charAt(0);
    }

    public static String formatPrefixFirstMiddleLastSuffix(String prefix,
                                                           String firstName,
                                                           String middleName,
                                                           String lastName,
                                                           String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName.charAt(0) + ", " + suffix;
    }

    public static String formatFull(String fullName){
        return fullName;
    }





}


