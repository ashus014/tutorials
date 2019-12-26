package com.company;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        for (int i=1, ctr=0;  i <= 1000 && ctr < 5; i++){
            if((i%3==0) && (i%5==0)){
                sum+=i;
                ctr++;
            }
        }
        System.out.println("Sum is :: " + sum);
    }
}
