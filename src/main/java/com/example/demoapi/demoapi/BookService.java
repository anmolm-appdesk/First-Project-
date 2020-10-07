package com.example.demoapi.demoapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /*
    Constructor Injection
    private BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository){
    this.bookRepository=bookRepository
    }
     */


    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long id){
        /*
        Optional<Book> bookOptional=bookRepository.findById(id);
        if(bookOptional.isPresent()){
        return bookOptional.get();
        }else{
        return null;
        }
         */
        return bookRepository.findById(id).get();
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public String deleteBook(Long id){
        bookRepository.deleteById(id);
        return "Book deleted by id" + id;
    }





}
