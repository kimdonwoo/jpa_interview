package com.example.jpa_interview;

import com.example.jpa_interview.domain.Book;
import com.example.jpa_interview.domain.BookStore;
import com.example.jpa_interview.repository.BookRepository;
import com.example.jpa_interview.repository.BookStoreRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaInterviewApplicationTests {

    @Test
    void contextLoads() {

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
