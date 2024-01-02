package com.example.AgathaChristieBooks;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {

    @Autowired
    private ReviewsRepository reviewsRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public Reviews createReview(String reviewBody, String title) {
        Reviews review = reviewsRepository.insert(new Reviews(reviewBody));
        mongoTemplate.update(Books.class)
                .matching(Criteria.where("title").is(title))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;

    }
}
