package com.zdzioch;

/**
 * Created by mzdzioch on 2017-08-20.
 */
public class MainLibrary {

    public static void main(String[] args) {

        Book book1 = new Book("Czterej pancerni");
        Book book2 = new Book("Never ending story");
        Book book3 = new Book("Wolf");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Book foundBook = null;
        foundBook = library.getBookByTitle("Wolf");
        if(foundBook != null) {
            foundBook.getBorrowBook().setBorrowed(true);
            System.out.println(foundBook.getBookName());
        }
        else
            System.out.println("Nie ma takiej ksiazki");

        for (Book bookToBorrow : library.getAllBooks()) {
            if(!bookToBorrow.getBorrowBook().isBorrowed()) {
                System.out.println("Dostępne książki: " + bookToBorrow.getBookName());
            }

        }
    }
}
