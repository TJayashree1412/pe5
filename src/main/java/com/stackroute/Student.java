package com.stackroute;
/*
4. Create a Student class that represents the following information of a student: id, name, and age all the member variables should be private .

a. Implement `getter and setter` */


public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
