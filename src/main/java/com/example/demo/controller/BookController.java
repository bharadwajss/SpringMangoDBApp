/**
 * @author:Satish Bharatiya
 * @date: 6/21/2023
 */
package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book) {
       bookService.addBook(book);
        return "book added";
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/findBookById/{id}")
    public Optional<Book> getBook(@PathVariable int id) {
        return bookService.findBookByID(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBookById(id);
        return "book deleted";
    }
}
