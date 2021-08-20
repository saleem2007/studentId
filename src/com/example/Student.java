package com.example;

public class Student {

    String firstName;
    String lastName;
    private static int counter = 500;
    private int studentId;

    public Student(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        studentId = counter;
        counter++;
    }

    public int getStudentId() {

        System.out.println(firstName + " " + lastName + " student id is " + studentId);
        return studentId;
    }


    public void greeting() {


        System.out.println("Welcome " + firstName + " " + lastName + " to the class, your student id number is " + studentId);
    }

}
