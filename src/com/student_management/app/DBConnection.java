package com.student_management.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url = "jdbc:mysql://localhost:3306/student_db";

    static String username = "root";

    static String password = "#1234Soumya";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(
                    url,
                    username,
                    password);

        } catch (Exception e) {

            System.out.println(e.getMessage());

            return null;
        }
    }
}
