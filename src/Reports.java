public class Reports {

    Database db;

    public Reports(Database db) {
        this.db = db;
    }

    public void showAvailabilityofBooks(){
        for (Book book: db.getBooks()){
            String output = "Not Available";
            if (book.isAvailable()){
                output = "Available";
            }
            System.out.println(book.getTitle() + ": "+output);
        }
    }
    public void showBorrowedBooks(){
        for (Book book: db.getBooks()){
            if (!book.isAvailable()){
                String borrowersName = book.getBorrowedBy().getName();
                System.out.println(book.getTitle() + ": "+borrowersName);
            }
        }
    }
}
