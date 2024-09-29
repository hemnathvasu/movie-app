package com.hemnath.movie.controller;

import com.hemnath.movie.service.MovieService;
import com.hemnath.movie.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/movies")
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        System.out.println("Inside the controller function");
        return new ResponseEntity<List<Movie>>(movieService.allMovie(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Movie>> getById(@PathVariable String id){
        Optional<Movie> result = movieService.getById(id);

        if(result.isPresent()){
            return new ResponseEntity<Optional<Movie>>(movieService.getById(id),HttpStatus.OK);
        }
        return new ResponseEntity<Optional<Movie>>(movieService.getById(id),HttpStatus.NOT_FOUND);
    }

}
