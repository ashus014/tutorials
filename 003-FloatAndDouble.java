package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value :: " + myMinFloatValue);
        System.out.println("Float maximum value :: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value :: " + myMinDoubleValue);
        System.out.println("Double maximum value :: " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        //float are not used these days
        //double is the preferred data type to be used

        float myFloatValue2 = 5.25f;
        //But also not recommended to do that because this is easier

        double myDoubleValue = 5.25d;




    }
}
