package com.student_management.app;

public class Student {

    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;

    public Student() {
    }

    public Student(String name, int age, String course, double marks) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }
}
