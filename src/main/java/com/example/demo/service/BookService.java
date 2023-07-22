package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void addBook(Book book);
    List<Book> getBooks();
    Optional<Book> findBookByID(int id);
    void deleteBookById(int id);
}
