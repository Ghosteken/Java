public class Book {
    private String title;
    private String author;
    private int year;
    private String type;
    private String isbn;

    public Book(String title, String author, int year, String type, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.type = type;
        this.isbn = isbn;
    }
   

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public String getISBN() {
        return isbn;
    }
}
