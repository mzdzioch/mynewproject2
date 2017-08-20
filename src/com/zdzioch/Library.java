package com.zdzioch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzdzioch on 2017-08-20.
 */
public class Library {

    private List<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);

    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookByTitle(String title) {

        for (Book book : books) {
            if(book.getBookName().equals(title) == true)
                return book;
        }
        return null;
    }

}
