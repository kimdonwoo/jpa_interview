package com.example.jpa_interview;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaInterviewApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookStoreRepository bookstoreRepository;


    // ??
    @Test
    void contextLoads() {
        Book book = new Book();
        book.setTitle("JPA 완전 정복");
        bookRepository.save(book);

        BookStore bookStore = new BookStore();
        bookStore.setName("부산대 서점");
        bookStore.add(book);

        bookstoreRepository.save(bookStore);
    }



//    @Test
//    void contextLoads() {
//        Book book = new Book();
//        book.setTitle("JPA 완전 정복");
//        bookRepository.save(book);
//
//        BookStore bookStore = new BookStore();
//        bookStore.setName("부산대 서점");
//
//        bookStore.add(book);
//
//        bookstoreRepository.save(bookStore);
//
//    } => 왜 안됨? 순서랑 상관없음
}
