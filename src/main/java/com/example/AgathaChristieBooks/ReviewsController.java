package com.example.AgathaChristieBooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
//adding comment
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;

    @PostMapping
    public ResponseEntity<Reviews> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<Reviews>(reviewsService.createReview(payload.get("reviewBody"), payload.get("title")),
                HttpStatus.CREATED);
    }
}
