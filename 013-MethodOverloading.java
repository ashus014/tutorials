package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is :: " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String planyerName , int score){
        System.out.println("Player " + planyerName + " score " + Score + " points");
        return score * 1000;
    }

    public  static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public  static int calculateScore(){
        System.out.println("No Player name no player scored ");
        return 0;
    }
}
