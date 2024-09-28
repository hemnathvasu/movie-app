package com.hemnath.movie;

import com.hemnath.movie.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie,ObjectId> {
}
