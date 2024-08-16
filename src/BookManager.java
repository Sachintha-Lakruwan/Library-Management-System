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
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        Book temp = new Book(title, author, category);
        db.getBooks().add(temp);
        System.out.println("Book added successfully!");
    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Removing a Book:");
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        int removeIndex = -1;
        for (int i=0; i<db.getBooks().size(); i++){
            if (db.getBooks().get(i).getTitle().equals(title)){
                removeIndex = i;
                break;
            }
        }

        if (removeIndex != -1) {
            db.getBooks().remove(removeIndex);
            return;
        }
        System.out.println("Sorry, there's no such book in the library.. 🙄");

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
