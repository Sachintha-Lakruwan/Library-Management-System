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

    public void addBook(Book book){
        books.add(book);
    }

    public void addBorrower(Borrower borrower){
        borrowers.add(borrower);
    }

    public int bookIndex(String title){
        int index = -1;
        for (int i=0; i<books.size(); i++){
            if (books.get(i).getTitle().equals(title)){
                index = i;
                break;
            }
        }
        return index;
    }

    public int borrowerIndex(String membershipID){
        int index = -1;
        for (int i=0; i<borrowers.size(); i++){
            if (borrowers.get(i).getMembershipID().equals(membershipID)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void removeBook(String title){
        int removeIndex = bookIndex(title);
        if (removeIndex != -1) {
            books.remove(removeIndex);
            return;
        }
        System.out.println("Sorry, there's no such book in the library.. 🙄");
    }

    public void removeBorrower(String borrowerID){
        int removeIndex = borrowerIndex(borrowerID);
        if (removeIndex != -1) {
            borrowers.remove(removeIndex);
            return;
        }
        System.out.println("Sorry, there's no such borrower with that Member ID.. 🙄");
    }

}
