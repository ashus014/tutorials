package com.company;

public class Student {
    int rollNo;
    int marks;

    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}

----------------------------------------------------------------------

package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1,55));
        studs.add(new Student(2,95));
        studs.add(new Student(3,35));
        studs.add(new Student(4,45));
        studs.add(new Student(5,85));

        for (Student s : studs){
            System.out.println(s);
        }

//Lambda Expression Used below
//If not undeerstood use : https://www.youtube.com/watch?v=c8bghFb_WrA&list=PLsyeobzWxl7oJj5BXYF088REBm-K4c_SR&index=8

        Collections.sort(studs,(s1,s2) -> {
            return s1.marks>s2.marks?1:-1;
        });

        System.out.println("\nAfter Sorting......");

        studs.forEach(System.out::println);

    }
}
