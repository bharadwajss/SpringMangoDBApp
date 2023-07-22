/**
 * @author:Satish Bharatiya
 * @date: 6/21/2023
 */
package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findBookByID(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public void deleteBookById(int id) {
          bookRepository.deleteById(id);
    }
}
