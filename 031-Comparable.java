package com.company;

public class Student implements Comparable<Student>{
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

//Main dhyaan edhar dena 

    @Override
    public int compareTo(Student a) {
        return this.marks>a.marks?-1:this.marks<a.marks?1:0;
    }

}

--------------------------------------------------------------------------------------------------

package com.company;


import java.util.ArrayList;
import java.util.Collections;
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

        Collections.sort(studs);

        System.out.println("\nAfter Sorting......");

        studs.forEach(System.out::println);

    }
}
