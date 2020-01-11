-------------------Unsafe code without generics-------------------

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList newArray = new ArrayList();

        newArray.add("Ashu");
        newArray.add("Akash");
        newArray.add(3);
        printList(newArray);
    }

    public static void printList(ArrayList a){
//        for(Object i : a){
//            System.out.println((String) i);
//        }

        for(Object i : a){
           System.out.println(i);
        }
    }
}
