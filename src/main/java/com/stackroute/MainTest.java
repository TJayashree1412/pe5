package com.stackroute;

/*
4. Create a Student class that represents the following information of a student: id, name, and age all the member variables should be private .

a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.
 */


import java.util.*;
import java.*;

public class MainTest {
    public static void main(String args[]) {
        Student student1 = new Student(1,"Jaspal",23);

        Student student2 = new Student(2,"Jayashree",22);

        Student student3 = new Student(3,"Soumyadeep",25);

        Student student4 = new Student(4,"Nilanjan",26);

        Student student5 = new Student(5,"rachan",28);

        Student student6 = new Student(6,"kaustav",30);

        ArrayList<Student> studentList = new ArrayList<Student>(Arrays.asList(student1, student2, student3, student4, student5, student6));

        Comparator com = new StudentSorter();
        Collections.sort(studentList,com);
        for(Student o:studentList){
            System.out.println(o.getId()+" "+o.getName()+" "+o.getAge());
        }
    }
}
