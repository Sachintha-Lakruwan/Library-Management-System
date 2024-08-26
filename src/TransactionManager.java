import java.util.Scanner;

public class TransactionManager {
    Database db;

    public TransactionManager(Database db) {
        this.db = db;
    }

    public void borrowBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Borrowing a Book:");

        String title = "";
        int bookIndex = -1;
        while (title.isEmpty()) {
            System.out.print("Enter Book Title: ");
            title = scanner.nextLine();
            if (title.isEmpty()){
                continue;
            }
            bookIndex = db.bookIndex(title);
            if (bookIndex == -1) {
                System.out.println("Sorry, there's no such book in the library.. 🙄");
                return;
            }
        }
        Book bookTemp = db.getBooks().get(bookIndex);

        if (!bookTemp.isAvailable()){
            System.out.println("This book is not currently available! ");
            return;
        }


        String borrowerID = "";
        int borrowerIndex = -1;
        while (borrowerID.isEmpty()) {
            System.out.print("Enter Borrower ID: ");
            borrowerID = scanner.nextLine();
            if (borrowerID.isEmpty()){
                continue;
            }
            borrowerIndex = db.borrowerIndex(borrowerID);
            if (borrowerIndex == -1) {
                System.out.println("Sorry, there's no such borrower with that Member ID.. 🙄");
                return;
            }
        }


        Borrower borrowerTemp = db.getBorrowers().get(borrowerIndex);

        if (!borrowerTemp.borrowBook(bookTemp)){
            System.out.println("You have already borrowed the maximum number of books allowed (4).");
            return;
        }

        bookTemp.setBorrowedBy(borrowerTemp);
        System.out.println("Book borrowed successfully!");
    };

    public void returnBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Returning a Book:");

        String title = "";
        int bookIndex = -1;
        while (title.isEmpty()) {
            System.out.print("Enter Book Title: ");
            title = scanner.nextLine();
            if (title.isEmpty()){
                continue;
            }
            bookIndex = db.bookIndex(title);
            if (bookIndex == -1) {
                System.out.println("Sorry, there's no such book in the library.. 🙄");
                return;
            }
        }
        Book bookTemp = db.getBooks().get(bookIndex);

        Borrower borrowerTemp = bookTemp.getBorrowedBy();
        bookTemp.returnBook();
        borrowerTemp.returnBook(bookTemp);

        System.out.println("Book returned successfully");
    };

}
