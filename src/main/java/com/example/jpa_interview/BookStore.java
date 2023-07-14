package com.example.jpa_interview;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class BookStore {

    @Id
    @GeneratedValue
    private Integer id;

    @Setter
    private String name;

    @OneToMany(mappedBy = "bookStore")
    private Set<Book> books = new HashSet<>();

    void add(Book book){
        //book.setBookStore(this);
        this.books.add(book);
    }
}
