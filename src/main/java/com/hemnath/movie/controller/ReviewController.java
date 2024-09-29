package com.hemnath.movie.controller;

import com.hemnath.movie.model.Review;
import com.hemnath.movie.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/movies")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> saveReview(@RequestBody Map<String,String> request){
        return new ResponseEntity<Review>(
                reviewService.createReview(request.get("reviewBody"),request.get("imdbId")),
                HttpStatus.CREATED);
    }

}
