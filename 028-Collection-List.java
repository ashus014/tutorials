package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(453);
        values.add(84);
        values.add(33);
        values.add(34);
        values.add(53);

        Collections.sort(values);



//  Stream API using lambda expression

        values.forEach(System.out::println);



//  Advance for each printing method


//        for(Object i : values){
//            System.out.println(i);
//        }

    }
}
