package com.student_management.app;

import java.sql.*; 

public class StudentDAO {

    Connection con = DBConnection.getConnection();

    // Add Student
    public void addStudent(Student student) {

        String sql =
                "INSERT INTO students(name,age,course,marks) VALUES(?,?,?,?)";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());
            ps.setDouble(4, student.getMarks());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Display All Students
    public void displayStudents() {

        String sql = "SELECT * FROM students";

        try {

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("course") + " | " +
                        rs.getDouble("marks")
                );
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Search Student
    public void searchStudent(int id) {

        String sql =
                "SELECT * FROM students WHERE id=?";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("course") + " | " +
                        rs.getDouble("marks")
                );

            } else {

                System.out.println("Student Not Found");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Update Student
    public void updateStudent(Student student, int id) {

        String sql =
                "UPDATE students SET name=?,age=?,course=?,marks=? WHERE id=?";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());
            ps.setDouble(4, student.getMarks());
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Updated");
            } else {
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Delete Student
    public void deleteStudent(int id) {

        String sql =
                "DELETE FROM students WHERE id=?";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Deleted");
            } else {
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Sort By Name
    public void sortByName() {

        displaySortedStudents(
                "SELECT * FROM students ORDER BY name"
        );
    }

    // Sort By Marks
    public void sortByMarks() {

        displaySortedStudents(
                "SELECT * FROM students ORDER BY marks DESC"
        );
    }

    // Sort By Age
    public void sortByAge() {

        displaySortedStudents(
                "SELECT * FROM students ORDER BY age"
        );
    }

    private void displaySortedStudents(String sql) {

        try {

            Statement stmt =
                    con.createStatement();

            ResultSet rs =
                    stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("course") + " | " +
                        rs.getDouble("marks")
                );
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}