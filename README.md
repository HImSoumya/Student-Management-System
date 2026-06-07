# Student Management System

A simple console-based **Student Management System** developed using **Core Java, JDBC, and MySQL**. This application allows users to manage student records through a menu-driven interface and performs all database operations using JDBC connectivity.

---

## 🚀 Features

* Add a New Student
* Display All Students
* Search Student by ID
* Update Student Details
* Delete Student Record
* Sort Students by:

  * Name
  * Age
  * Marks
* Menu-Driven Console Interface
* MySQL Database Integration using JDBC

---

## 🛠️ Technologies Used

* Java
* JDBC (Java Database Connectivity)
* MySQL Database
* MySQL Connector/J (JDBC Driver)
* VS Code / Eclipse / IntelliJ IDEA

---

## 📂 Project Structure

```text
StudentManagementSystem
│
├── Student.java
├── DBConnection.java
├── StudentDAO.java
├── Main.java
├── lib/
│   └── mysql-connector-j.jar
└── README.md
```

---

## 🗄️ Database Setup

### Step 1: Create Database

```sql
CREATE DATABASE student_db;
```

### Step 2: Use Database

```sql
USE student_db;
```

### Step 3: Create Students Table

```sql
CREATE TABLE students(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100),
    marks DOUBLE
);
```

---

## ⚙️ JDBC Configuration

Update the database credentials in `DBConnection.java`:

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/student_db";

private static final String USERNAME = "root";

private static final String PASSWORD = "your_password";
```

Replace `your_password` with your MySQL password.

---

## ▶️ How to Run the Project

### 1. Clone the Repository

```bash
git clone <repository-url>
```

### 2. Open the Project

Open the project in VS Code, Eclipse, or IntelliJ IDEA.

### 3. Add MySQL JDBC Driver

Download MySQL Connector/J and add the `.jar` file to the project libraries.

### 4. Configure Database

* Create the database and table using the SQL scripts above.
* Update database credentials in `DBConnection.java`.

### 5. Run the Application

Execute:

```bash
Main.java
```

---

## 📋 Menu Options

```text
===== STUDENT MANAGEMENT SYSTEM =====

1. Add Student
2. Display Students
3. Search Student
4. Update Student
5. Delete Student
6. Sort Students
7. Exit
```

---

## 📸 Sample Output

```text
===== STUDENT MANAGEMENT SYSTEM =====

1. Add Student
2. Display Students
3. Search Student
4. Update Student
5. Delete Student
6. Sort Students
7. Exit

Enter Choice: 1

Name: Soumya
Age: 24
Course: Java
Marks: 92.5

Student Added Successfully
```

---

## 🎯 Learning Outcomes

Through this project, I learned:

* Core Java Programming
* Object-Oriented Programming (OOP)
* JDBC Architecture
* Database Connectivity
* CRUD Operations
* SQL Queries
* Exception Handling
* Console-Based Application Development
* Git and GitHub Project Management

---

## 🔮 Future Enhancements

* Input Validation
* Search by Name
* Course Management
* Student Attendance Tracking
* Export Data to CSV/Excel
* GUI using Java Swing or JavaFX
* Maven Project Structure
* Logging Framework Integration

---

## 👨‍💻 Author

**Soumya Ranjan**

Java Developer | Learning JDBC, MySQL, and Backend Development

---

## ⭐ Project Status

Completed and functional for academic learning and resume demonstration purposes.
