package com.kendy.bookManagement.services;

import com.kendy.bookManagement.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
