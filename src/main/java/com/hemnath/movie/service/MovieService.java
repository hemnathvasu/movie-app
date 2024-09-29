package com.hemnath.movie.service;

import com.hemnath.movie.model.Movie;
import com.hemnath.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovie(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getById(String id){
        return Optional.ofNullable(movieRepository.findByImdbId(id).orElse(null));
    }
}
