package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

	    Map<String,String> map = new HashMap<>();
	    map.put("Name","Ashu Singh");
        map.put("Actor","Brad Pitt");
        map.put("Singer","Elton John");

//        System.out.println(map);

//        System.out.println(map.get("Name"));
//        System.out.println(map.get("Actor"));

//        System.out.println(map.keySet());
//        System.out.println(map.values());

        Set<String> keys = map.keySet();


        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        System.out.println();

        map.put("Actor","George Clooney");

        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}
