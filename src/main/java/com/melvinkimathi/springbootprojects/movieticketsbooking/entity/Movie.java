package com.melvinkimathi.springbootprojects.movieticketsbooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String imageUrl;
    private String tag;
    private String description;
    private String releaseDate;
    private int runtime;    //remember to add + "minutes"
    private int interested;
    private Double rating;


}
