package com.academy2024.task3;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public void setBooks(ArrayList<Book> books) {
       this.books = books;
    }

    public int countTheNumberOfBooks() {
        return books.size();
    }

    public Book findBookByTitle(String bookTitle) throws BookNotFoundException {
        for (Book book : books) {
            if (book.title.equals(bookTitle)) {
                return book;
            }
        }
        throw new BookNotFoundException("Sorry, but book with title " + bookTitle + " has not been found");
    }

    public Book findBookWithHighestPageCount() throws BookNotFoundException {
        if (books.isEmpty()) {
            throw new BookNotFoundException("Sorry, but there are no books in the library");
        }
        Book bookWithHighestPageCount = books.get(0);
        for (Book book : books) {
            if (book.numberOfPages > bookWithHighestPageCount.numberOfPages) {
                bookWithHighestPageCount = book;
            }
        }
        return bookWithHighestPageCount;

    }
}
