package Projects;

import java.util.ArrayList;

public class LibraryApp {

    private BookRepository bookRepository = new BookRepository();

    public void searchByIsnb(String isbn){
        System.out.println("Search for books with ISBN ");
        Book book =  bookRepository.findByIsbn(isbn);

     if(book != null){
        System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s",
                book.getTitle(),book.getGenre(),book.getAuthor());
    } else {
         System.out.println("0 books found!");
     }
        System.out.println("\n\n");
    }

    public void searchByTitle(String keyword){
        System.out.println("Search for books");
        ArrayList<Book> books = bookRepository.findByTitle(keyword);
        for(Book book : books){
            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n",
                    book.getTitle(),book.getGenre(),book.getAuthor());
        }
        System.out.println();
    }
    public void searchByGenre(String genre){
        System.out.println("Search for Genre Books");
        ArrayList<Book> books = bookRepository.findByGenre(genre);
        for(Book book : books){
            System.out.printf("Books found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n",
                    book.getTitle(),book.getGenre(),book.getAuthor());
        }
        System.out.println();
    }


    public void checkOutBooks(String isbn){
        Book book = bookRepository.findByIsbn(isbn);
                if(book !=null){
                    if(book.checkOut()) {
                        System.out.println("Book Checked out Successfully");
                        System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n",
                                book.getIsbn(), book.getTitle(), book.getAuthor());
                    } else{
                        System.out.println("Check out failed");
                        System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n",
                                book.getIsbn(), book.getTitle(), book.getAuthor());
                    }
                } else {
                    System.out.println("Failed to check out the book.\n");
                    System.out.println("Reason: no isbn on record");
                }
    }
    public void checkInBooks(String isbn){
        Book book = bookRepository.findByIsbn(isbn);
        if(book !=null){
            book.checkOut();
            System.out.println("Book Checked in Successfully");
            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n",
                    book.getIsbn(),book.getTitle(),book.getAuthor());
        } else {
            System.out.println("Failed to check in the book.\n");
            System.out.println("Reason: no isbn on record");
        }
    }
}
