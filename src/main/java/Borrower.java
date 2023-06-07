import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public void takeBookFromLibrary(Library library) {
        Book book = library.takeBookFromLibrary();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public int  bookCount() {
        return books.size();
    }

}
