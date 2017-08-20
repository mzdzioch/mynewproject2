package com.zdzioch;

/**
 * Created by mzdzioch on 2017-08-20.
 */
public class Book {
    private String bookName;
    private BorrowBook borrowBook = new BorrowBook(false);

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public BorrowBook getBorrowBook() {
        return borrowBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
