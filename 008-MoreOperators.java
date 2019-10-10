package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 2;

        result--;
        System.out.println("Result :: " + result);

        result++;
        System.out.println("Result :: " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;
        if(topScore == 100){
            System.out.println("You got the high Score");
        }

        int secondTopScore =60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an error.");
        }

        boolean isCar = false;
        if(isCar = true){
            System.out.println("This is not suppose to happen");
        }

        /*boolean isCar2 = false;
        if(isCar2 == true){
            System.out.println("This is not suppose to happen");
        }
        */

        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        System.out.println(isEighteenOrOver);

    }
}
