# Library Management System

A simple command-line Library Management System written in Java. This application allows you to manage books, borrowers, transactions, and generate reports for a library.

## Features

- **Book Management**: Add, remove, and display available books.
- **Borrower Management**: Register, remove, and display borrowers.
- **Transaction Management**: Borrow and return books (with a limit of 4 books per borrower).
- **Reports**: Generate reports on book availability and borrowed books.

## Project Structure

- `src/Book.java` - Book entity
- `src/Borrower.java` - Borrower entity
- `src/Database.java` - In-memory storage for books and borrowers
- `src/BookManager.java` - Handles book-related operations
- `src/BorrowerManager.java` - Handles borrower-related operations
- `src/TransactionManager.java` - Handles borrowing and returning books
- `src/Reports.java` - Generates reports
- `src/LibraryManagementSystem.java` - Main application logic and menu
- `src/Main.java` - Entry point

## How to Run

1. **Compile the source files:**
   ```
   javac src/*.java
   ```
2. **Run the application:**
   ```
   java -cp src Main
   ```

## Usage

Follow the on-screen menu to manage books, borrowers, transactions, and generate reports. Enter the corresponding number for each action.

## Requirements

- Java 8 or higher

---

_This project is for educational purposes and uses in-memory storage (no database persistence)._
