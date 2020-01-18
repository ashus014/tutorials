package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main{
    public static void main(String[] args) {

//        new Thread(new CodeToRun()).start();

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

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee employee : employees){
            System.out.println(employee);
        }

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
