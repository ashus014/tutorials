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

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println("MyIntValue : " + myIntValue);
        System.out.println("MyFloatValue : " + myFloatValue);
        System.out.println("MyDoubleValue : " + myDoubleValue);

        //double has more precision as compared to float
        /*use of double is also recommended
        1.It is faster in most of modern computer.
        2.In java libs most of the functions are written to process double not float.
        3.Java treats double as default floating point number.
        */

        double anotherNumber = 3_000_000.134;
        System.out.println(anotherNumber);





    }
}
