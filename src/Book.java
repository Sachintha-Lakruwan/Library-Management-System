public class Book {
    private final String Title;
    private final String Author;
    private final String Category;

    public Book(String title, String author, String category) {
        Title = title;
        Author = author;
        Category = category;
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
}
