public class Book {
    private final String Title;
    private final String Author;
    private final String Category;
    boolean availability;
    private Borrower borrowedBy;

    public Book(String title, String author, String category) {
        Title = title;
        Author = author;
        Category = category;
        availability = true;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getCategory() {
        return Category;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setBorrowedBy(Borrower borrowedBy) {
        this.borrowedBy = borrowedBy;
        availability = false;
    }

    public void returnBook(){
        this.borrowedBy = null;
        availability = true;
    }

    public Borrower getBorrowedBy() {
        return borrowedBy;
    }
}
