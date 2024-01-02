package com.example.AgathaChristieBooks;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Books> allBooks() {
        return bookRepository.findAll();
    }

    public Optional<Books> singleBook(String title) {
        return bookRepository.findBookByTitle(title);
    }

}
