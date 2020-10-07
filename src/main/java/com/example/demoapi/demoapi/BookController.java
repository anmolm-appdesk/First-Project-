package com.example.demoapi.demoapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService=bookService;
    }



    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @GetMapping("get/{id}")
    public Book findById(@PathVariable(name="id") Long id){
        return bookService.getBookById(id);
    }

    @GetMapping("get/all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable(name="id") Long id){
        return bookService.deleteBook(id);
    }

}
