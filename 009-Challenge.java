package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstDouble = 20.00d;
	    double secondDouble = 80.00d;

	    //operator precedence example
	    //double sumDouble = (firstDouble + secondDouble) * 100.00d;
        double sumDouble = firstDouble + secondDouble * 100.00d;
	    double remainder = sumDouble % 40.00d;
	    boolean ifRemainderZero = remainder == 0 ? true : false;
        System.out.println("Boolean Output :: " + ifRemainderZero);

        if(!ifRemainderZero){
            System.out.println("Got some Remainder");
        }
    }
}
