package com.academy2024.task3;


import lombok.Data;

@Data
public class Book {

    String title;
    String author;
    int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
}
