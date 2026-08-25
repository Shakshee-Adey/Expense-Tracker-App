# Expense Tracker

## 📌 Project Overview

Expense Tracker is a web-based application developed using **Spring Boot, Spring Data JPA, Thymeleaf, and MySQL**.

The application helps users manage their daily expenses by adding, viewing, updating, and deleting expense records. It provides a simple interface to keep track of spending and manage financial records efficiently.

## 🚀 Features

* Add new expenses
* View all expenses
* Update expense details
* Delete expenses
* Store expense records in MySQL database
* Display expenses using Thymeleaf
* Backend development using Spring Boot
* Database operations using Spring Data JPA
* Simple and user-friendly interface

## 🛠️ Technologies Used

### Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate

### Frontend

* HTML
* CSS
* Thymeleaf

### Database

* MySQL

### Tools

* Eclipse / Spring Tools for Eclipse
* Maven
* MySQL Workbench
* Git & GitHub

## 🏗️ Project Structure

```text
Expense-Tracker
│
├── src
│   └── main
│       ├── java
│       │   └── com.example.expensetracker
│       │       ├── controller
│       │       ├── entity
│       │       ├── repository
│       │       └── ExpenseTrackerApplication.java
│       │
│       └── resources
│           ├── templates
│           ├── static
│           └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Before running the project, make sure you have:

* Java JDK installed
* MySQL installed and running
* Eclipse or Spring Tools for Eclipse
* Maven

## 🗄️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE expense_tracker;
```

Then configure the database in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.thymeleaf.cache=false
```

Replace `YOUR_PASSWORD` with your MySQL password.

## ▶️ How to Run the Project

### Step 1: Clone the Repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### Step 2: Open the Project

Open the project in **Eclipse / Spring Tools for Eclipse**.

### Step 3: Configure MySQL

Make sure MySQL is running and the database configuration in `application.properties` is correct.

### Step 4: Run the Application

Find the main Spring Boot class:

```text
ExpenseTrackerApplication.java
```

Right-click on it and select:

```text
Run As → Spring Boot App
```

### Step 5: Open in Browser

After the application starts, open:

```text
http://localhost:8080
```

## 🔄 Application Flow

```text
User
  ↓
Thymeleaf Web Page
  ↓
Controller
  ↓
Service / Business Logic
  ↓
Repository
  ↓
Spring Data JPA
  ↓
MySQL Database
```

## 📚 Learning Outcomes

Through this project, I practiced:

* Spring Boot application development
* MVC architecture
* Spring Data JPA
* CRUD operations
* MySQL database integration
* Thymeleaf template engine
* Dependency Injection
* Repository pattern
* Connecting frontend with backend

## 👩‍💻 Author

**Shakshee Adey**

Java Developer | Spring Boot | MySQL | Html,CSS,Thymeleaf

## 📄 License

This project is created for learning and portfolio purposes.
