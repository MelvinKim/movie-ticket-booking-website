package com.melvinkimathi.springbootprojects.movieticketsbooking.controller;

import com.melvinkimathi.springbootprojects.movieticketsbooking.dto.MovieRepository;
import com.melvinkimathi.springbootprojects.movieticketsbooking.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MovieController {

    //inject dependencies
    @Autowired
    private MovieRepository repository;

    @GetMapping("/api/movies")
    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
