package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Year of Birth :: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your Name :: ");
        String name = scanner.nextLine();

        int age = 2019 - yearOfBirth;

        System.out.println("Your name is  " + name + " and you are " + age + " years old.");

        scanner.close();
    }
}
