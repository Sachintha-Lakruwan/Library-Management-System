import java.util.Scanner;

public class BorrowerManager implements Manager{

    Database db;

    public BorrowerManager(Database db) {
        this.db = db;
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registering a Borrower:");

        String name = "";
        while (name.isEmpty()) {
            System.out.print("Enter Name: ");
            name = scanner.nextLine();
        }

        String contact = "";
        while (contact.isEmpty()) {
            System.out.print("Enter Contact Information: ");
            contact = scanner.nextLine();
        }

        String bookId = "";
        while (bookId.isEmpty()) {
            System.out.print("Enter Membership ID: ");
            bookId = scanner.nextLine();
        }

        Borrower temp = new Borrower(name, contact, bookId);
        db.addBorrower(temp);
        System.out.println("Borrower registered successfully!");
    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Removing a Borrower:");

        String borrowerID = "";
        while (borrowerID.isEmpty()) {
            System.out.print("Enter Member ID: ");
            borrowerID = scanner.nextLine();
        }

        db.removeBorrower(borrowerID);
    }

    @Override
    public void display() {
        if (db.getBorrowers().isEmpty()){
            System.out.println("No one has registered with the library.");
            return;
        }
        for (int i=0; i<db.getBorrowers().size(); i++){
            Borrower tempBook = db.getBorrowers().get(i);
            String str = String.format("%d. Name: %s, Contact Information: %s, Member ID: %s", i+1,
                    tempBook.getName(), tempBook.getContactInformation(), tempBook.getMembershipID());
            System.out.println(str);
        }
    }
}
