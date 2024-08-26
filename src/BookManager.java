import java.util.Scanner;

public class BookManager implements Manager{

    Database db;

    public BookManager(Database db) {
        this.db = db;
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a Book:");

        String title = "";
        while (title.isEmpty()) {
            System.out.print("Enter Title: ");
            title = scanner.nextLine();
        }

        String author = "";
        while (author.isEmpty()) {
            System.out.print("Enter Author: ");
            author = scanner.nextLine();
        }

        String category = "";
        while (category.isEmpty()) {
            System.out.print("Enter Category: ");
            category = scanner.nextLine();
        }

        Book temp = new Book(title, author, category);
        db.addBook(temp);
        System.out.println("Book added successfully!");
    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Removing a Book:");

        String title = "";
        while (title.isEmpty()) {
            System.out.print("Enter Title: ");
            title = scanner.nextLine();
        }

        db.removeBook(title);
    }

    @Override
    public void display() {
        if (db.getBooks().isEmpty()){
            System.out.println("Library doesn't contains any books.. ❍");
            return;
        }
        for (int i=0; i<db.getBooks().size(); i++){
            Book tempBook = db.getBooks().get(i);
            String str = String.format("%d. Title: %s, Author: %s, Category: %s, Availability: %b", i+1,
                     tempBook.getTitle(), tempBook.getAuthor(), tempBook.getCategory(), tempBook.isAvailable());
            System.out.println(str);
        }
    }
}
