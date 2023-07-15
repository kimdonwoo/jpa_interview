package com.example.jpa_interview.repository;

import com.example.jpa_interview.domain.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreRepository extends JpaRepository<BookStore,Integer> {

}
