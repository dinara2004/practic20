package com.company;

import java.util.Scanner;

import static com.company.InvalidAgeException.*;

public class Main {

    public static void main(String[] args) {
  try {

      Student student = new Student();
      student.setName("Dinara");
      student.setAge(19);
      student.setGroup("Java");
      student.setBatch(5);

      Student student1 = new Student();
      student.setName("Muhammed");
      student.setAge(24);
      student.setGroup("Java");
      student.setBatch(5);

      Student student2 = new Student();
      student.setName("Azamat");
      student.setAge(36);
      student.setGroup("Java");
      student.setBatch(5);

      Student student3 = new Student();
      student.setName("Aziza");
      student.setAge(19);
      student.setGroup("Java");
      student.setBatch(5);



      //Student student1 = new Student("Dinara", 12, "Java", 5);
//    Student student2 = new Student("Muhammed", 24, "Java", 5);
//    Student student3 = new Student("Maksat", 30, "Java", 5);
//    Student student4 = new Student("Dilbara", 20, "Java", 5);
//    Student student5 = new Student("Ulan", 26, "Java", 5);

    Student[] students = {student, student1, student2, student3};

    Course course = new Course("Peaksoft", "Grajdanskaya-119", students);
    System.out.println(course);
} catch (NameExceptions|InvalidAgeException ex) {
    System.out.println(ex.getMessage());

}
        }
    }

