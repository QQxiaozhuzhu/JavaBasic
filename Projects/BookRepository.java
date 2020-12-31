package Projects;
import java.util.ArrayList;

public class BookRepository {

    public ArrayList<Book> books = new ArrayList<>();

    public BookRepository(){
        books.add ( new Book("Cracking the Code Interview","09847825850","Textbook",null,"Gayle Laakmann McDowell",10,10) );
        books.add (new Book("MineCraft","The Dead of night","Honor",null,"Johnny White",10,10));
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public  Book findByIsbn(String isbn){
        for( Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(keyword))
                booksFound.add(book);
        }
    return booksFound;
    }

    public ArrayList<Book> findByGenre(String genre){
        ArrayList<Book> booksFound = new ArrayList<>();
        for( Book book : books){
            if(book.getGenre().equalsIgnoreCase(genre)){
                booksFound.add(book);
            }
        }
        return booksFound;
    }

}
