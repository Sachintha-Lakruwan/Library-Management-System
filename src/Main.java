import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database db = new Database();
        BookManager bookManager = new BookManager(db);
        BorrowerManager borrowerManager = new BorrowerManager(db);
        TransactionManager transactionManager = new TransactionManager(db);
        Reports reports = new Reports(db);

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("""
                                    
                    Welcome to the Library Management System
                                    
                     Book Management
                       1. Add a book
                       2. Remove a book
                       3. Display available books
                       
                     Borrower Management
                        4. Register a borrower
                        5. Remove a borrower
                        6. Display registered borrowers
                     
                     Transaction Management
                        7. Borrow a book
                        8. Return a book
                     
                     Reports
                        9. Generate book availability report
                        10. Generate borrowed books report
                     
                     0. Exit
                     
                    """);

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    bookManager.add();
                    break;
                case "2":
                    bookManager.remove();
                    break;
                case "3":
                    bookManager.display();
                    break;
                case "4":
                    borrowerManager.add();
                    break;
                case "5":
                    borrowerManager.remove();
                    break;
                case "6":
                    borrowerManager.display();
                    break;
                case "7":
                    transactionManager.borrowBook();
                    break;
                case "8":
                    transactionManager.returnBook();
                    break;
                case "9":
                    reports.showAvailabilityofBooks();
                    break;
                case "10":
                    reports.showBorrowedBooks();
                    break;
                case "0":
                    System.out.println("Thank you for using the Library Management System!");
                    exit = true;
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }
        }

        scanner.close();
    }
}
