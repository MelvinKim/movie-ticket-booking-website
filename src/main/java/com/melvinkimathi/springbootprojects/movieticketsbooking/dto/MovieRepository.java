package com.melvinkimathi.springbootprojects.movieticketsbooking.dto;

import com.melvinkimathi.springbootprojects.movieticketsbooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
