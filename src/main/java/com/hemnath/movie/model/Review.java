package com.hemnath.movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collation = "reviews")
public class Review {

    @Id
    private ObjectId id;
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
