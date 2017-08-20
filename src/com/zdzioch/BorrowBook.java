package com.zdzioch;

/**
 * Created by mzdzioch on 2017-08-20.
 */
public class BorrowBook {

    private boolean isBorrowed;

    public BorrowBook(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
