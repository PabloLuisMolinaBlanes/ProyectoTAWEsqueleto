package com.example.proyectotawgrupo2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "budget")
    private Long budget;

    @Column(name = "homepage")
    private String homepage;

    @Column(name = "title")
    private String title;

    @Column(name = "tagline")
    private String tagline;

    @Column(name = "runtime")
    private Integer runtime;

    @Column(name = "original_language", length = 50)
    private String originalLanguage;

    @Column(name = "original_title")
    private String originalTitle;

    @Lob
    @Column(name = "overview")
    private String overview;

    @Column(name = "revenue")
    private Long revenue;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "popularity")
    private Float popularity;

    @Column(name = "vote_average")
    private Float voteAverage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private com.example.proyectotawgrupo2.entity.Status status;

}