package com.example.demoapi.demoapi;


import lombok.Data;

import javax.persistence.*;

@Table(name="book")
@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="book_id")
    private Long bookId;

    @Column(name="book_name")
    private String bookName;

    @Column(name="author")
    private String author;



}
