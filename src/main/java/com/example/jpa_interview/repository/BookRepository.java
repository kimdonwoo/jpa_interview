package com.example.jpa_interview.repository;

import com.example.jpa_interview.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
