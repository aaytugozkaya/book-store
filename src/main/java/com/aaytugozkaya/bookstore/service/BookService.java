package com.aaytugozkaya.bookstore.service;

import com.aaytugozkaya.bookstore.model.Book;
import org.springframework.stereotype.Service;
import com.aaytugozkaya.bookstore.repository.BookRepository;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }
}
