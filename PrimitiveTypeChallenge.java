package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        //long works nicely with integer

        System.out.println(longTotal);

        //If it was given to store in Short then this would have been different
        short shortTotal = (short) (500 + 10 * byteValue + shortValue + intValue);
    }
}
