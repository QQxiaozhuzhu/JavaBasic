package Projects;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class Main {
    public static void main(String [] args){

        LibraryApp libraryApp = new LibraryApp();
        libraryApp.searchByTitle("Cracking the Code Interview");
        libraryApp.searchByGenre("Textbook");


    }
}
