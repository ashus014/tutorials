package com.company;

public class Main {

    public static void main(String[] args) {
        String string  = "I am a string. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I","You");
        System.out.println(yourString);

        String alphaNumeric = "abcDeeF12hhiiik";
        System.out.println(alphaNumeric.replaceAll(".","Y"));

        System.out.println(alphaNumeric.replaceAll("^abcDee","YYY"));


        String secondString = "abcDeeF12hhiiikabcDeeF12hhiiikabcDeeF12hhiiik";
        System.out.println(secondString.replaceAll("^abcDee","YYY"));

        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^abcDeeF12hhiiik"));


    }
}
