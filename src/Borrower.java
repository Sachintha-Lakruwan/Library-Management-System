import java.util.ArrayList;

public class Borrower {
    private final String Name;
    private final String ContactInformation;
    private final String MembershipID;
    private final ArrayList<Book> borrowedBooks;

    public Borrower(String name, String contactInformation, String membershipID) {
        Name = name;
        ContactInformation = contactInformation;
        MembershipID = membershipID;
        borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public String getContactInformation() {
        return ContactInformation;
    }

    public String getMembershipID() {
        return MembershipID;
    }

    public boolean borrowBook(Book book){
        if (borrowedBooks.size() < 4){
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public void returnBook(Book book){
        int index = -1;
        for (int i=0; i<borrowedBooks.size(); i++){
            if (book.getTitle().equals(borrowedBooks.get(i).getTitle())){
                index = i;
            }
        }
        borrowedBooks.remove(index);
    }

}
