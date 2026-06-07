package com.student_management.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort Students");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    dao.addStudent(
                            new Student(
                                    name,
                                    age,
                                    course,
                                    marks));

                    break;

                case 2:

                    dao.displayStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");

                    int searchId = sc.nextInt();

                    dao.searchStudent(searchId);

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");

                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("New Age: ");
                    int newAge = sc.nextInt();

                    sc.nextLine();

                    System.out.print("New Course: ");
                    String newCourse = sc.nextLine();

                    System.out.print("New Marks: ");
                    double newMarks = sc.nextDouble();

                    dao.updateStudent(
                            new Student(
                                    newName,
                                    newAge,
                                    newCourse,
                                    newMarks),
                            updateId);

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");

                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("\n1. Sort By Name");
                    System.out.println("2. Sort By Age");
                    System.out.println("3. Sort By Marks");

                    int sortChoice = sc.nextInt();

                    switch (sortChoice) {

                        case 1:
                            dao.sortByName();
                            break;

                        case 2:
                            dao.sortByAge();
                            break;

                        case 3:
                            dao.sortByMarks();
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }

                    break;

                case 7:
                    sc.close();
                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}