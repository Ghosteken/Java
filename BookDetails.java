public class BookDetails {
    public static void printBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Type: " + book.getType());
        System.out.println("ISBN: " + book.getISBN());
    }

    public static void main(String[] args) {
        // Create an instance of Book
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction", "9780061120084");

        // Print the book details
        printBookDetails(book);
    }
}


