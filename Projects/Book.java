package Projects;

public class Book {
    private String title;
    private String isbn;
    private String genre;
    private String description;
    private String author;
    private int quantity;
    private int numberCheckedOut;

    public Book(String title, String isbn, String genre, String description, String author, int quantity, int numberCheckedOut) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
        this.quantity = quantity;
        this.numberCheckedOut = numberCheckedOut;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNumberCheckedOut() {
        return numberCheckedOut;
    }

    public void setNumberCheckedOut(int numberCheckedOut) {
        this.numberCheckedOut = numberCheckedOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean checkOut(){
        if(numberCheckedOut >= quantity)
        {
            return false;
        }
        numberCheckedOut++;
        return true;
    }
    public boolean checkIn(){
        if(numberCheckedOut <= 0){
            return false;
        }
        numberCheckedOut--;
        return true;
    }

}
