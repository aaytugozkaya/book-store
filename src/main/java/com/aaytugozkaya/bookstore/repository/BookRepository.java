package com.aaytugozkaya.bookstore.repository;

import com.aaytugozkaya.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book , Integer> {
}
