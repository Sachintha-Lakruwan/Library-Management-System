import java.util.ArrayList;

public class Database {
    private final ArrayList<Book> books;
    private final ArrayList<Borrower> borrowers;

    public Database() {
        this.books = new ArrayList<>();
        this.borrowers = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Borrower> getBorrowers() {
        return borrowers;
    }
}
