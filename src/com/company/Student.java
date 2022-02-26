package com.company;

public class Student {
    private String name;
    private int age;
    private String group;
    private int batch;

    public Student() {
    }

    public Student(String name, int age, String group, int batch) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z]*")){
            this.name = name;
    } else { throw new NameExceptions("Сан аралашпасын.");

        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<16){
            throw new InvalidAgeException("Сиздин жашыныз жете элек, доступ жабык.");
        } else {
            System.out.println("Доступ ачык.");
        }
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student:" +
                "name-'" + name + '\'' +
                ", age- " + age +
                ", group- '" + group + '\'' +
                ", batch- '" + batch + '\'' ;
    }
}
