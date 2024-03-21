package com.academy2024.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @InjectMocks
    private Library library;

    public ArrayList<Book> setupBooks() {
        return new ArrayList<>(Arrays.asList(
                new Book("Shuggie Bain",  "Douglas Stuart",480),
                new Book("White Noise", "Don DeLillo",384),
                new Book("American Psycho", "Bret Easton Ellis",416),
                new Book("Blood Meridian", "Cormac McCarthy",384),
                new Book("Catechismvsa", "Martjnvs Masvjdjvs",79)));
    }

    @Test
    public void countTheNumberOfBooks_returnsBookListSize_whenBookListNotEmpty() {
        library = new Library();
        library.setBooks(setupBooks());
        assertThat(5).isEqualTo(library.countTheNumberOfBooks());
    }

    @Test
    public void countTheNumberOfBooks_returnsBookListSize_whenBookListEmpty() {
        library = new Library();
        library.setBooks(new ArrayList<>());
        assertThat(0).isEqualTo(library.countTheNumberOfBooks());
    }

    @Test
    public void findBookByTitle_returnBookObject_whenBookListContainsBookWithEnteredStringTitle() throws BookNotFoundException {
        library = new Library();
        library.setBooks(setupBooks());
        assertThat("Shuggie Bain").isEqualTo(library.findBookByTitle("Shuggie Bain").title);
    }

    @Test
    public void findBookByTitle_throwsBookNotFoundException_whenBookListDoesNotContainBookWithEnteredTitle() throws BookNotFoundException {
    }

    @Test
    public void findBookWithHighestPageCount_returnBookPageInt_whenBookListNotEmpty() throws BookNotFoundException {
    }

    @Test
    public void findBookWithHighestPageCount_throwsBookNotFoundException_whenBookListEmpty() throws BookNotFoundException {
    }

}