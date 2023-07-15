package com.example.jpa_interview.repository;

import com.example.jpa_interview.domain.Book;
import com.example.jpa_interview.domain.BookStore;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.hamcrest.MatcherAssert.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DomainRepositoryTests {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookStoreRepository bookStoreRepository;

    @Test
    void testBookAndBookStore() {
        BookStore bookStore = new BookStore();
        bookStore.setName("PNU 도서관");
        bookStoreRepository.save(bookStore);

        Book book = new Book();
        book.setTitle("도누의 책");
        bookStore.add(book);
        bookRepository.save(book);

        assertThat(book.getBookStore(), CoreMatchers.not(CoreMatchers.nullValue()));
    }
}
