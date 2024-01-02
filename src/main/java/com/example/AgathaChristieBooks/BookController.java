package com.example.AgathaChristieBooks;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/books")

public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping
    public ResponseEntity<List<Books>> getAllBooks() {
        return new ResponseEntity<List<Books>> (bookService.allBooks(), HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public ResponseEntity<Optional<Books>> getSingleBook(@PathVariable String title) {
        return new ResponseEntity<Optional<Books>>(bookService.singleBook(title), HttpStatus.OK);
    }
}
