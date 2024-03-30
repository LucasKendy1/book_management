package com.kendy.bookManagement.controllers;

import com.kendy.bookManagement.models.Book;
import com.kendy.bookManagement.models.BookDto;
import com.kendy.bookManagement.services.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repo;

    @GetMapping
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    @PostMapping("/create")
    public String createBook(
             @ModelAttribute BookDto bookDto,
            BindingResult result
    ){
        return "Book created";
    }



}
