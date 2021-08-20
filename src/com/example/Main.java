package com.example;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("Saleem", "Raes");
        Student student3 = new Student("Jennifer", "Thompson");
        student3.greeting();
        student2.greeting();
        student3.getStudentId();
        student1.greeting();



    }
}
