package com.company;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main{
    public static void main(String[] args) {

        new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.println("Line 3");
            System.out.println("Line 4");
        }).start();

        Employee ashu = new Employee("Ashu Singh",30);
        Employee akash = new Employee("Akash Singh",25);
        Employee aditya = new Employee("Aditya Singh",26);
        Employee aman = new Employee("Aman Singh",21);

        List<Employee> employees = new ArrayList<>();
        employees.add(ashu);
        employees.add(akash);
        employees.add(aditya);
        employees.add(aman);


        Collections.sort(employees, ( o1, o2) ->
            o1.getName().compareTo(o2.getName()));

        for (Employee employee : employees){
            System.out.println(employee);
        }

        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        },
            employees.get(0).getName(),employees.get(1).getName());

        System.out.println(sillyString);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1, s2);
    }
}


class Employee{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}
