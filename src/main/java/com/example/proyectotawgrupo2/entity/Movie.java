package com.example.proyectotawgrupo2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "budget")
    private Long budget;

    @Column(name = "homepage")
    private String homepage;

    @Column(name = "title")
    private String title;

    @Column(name = "tagline", length = 5000)
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

    @ManyToMany
    @JoinTable(
            name = "movie_genre"
            , joinColumns = {@JoinColumn(
        name = "movie_id"
    )}, inverseJoinColumns = {@JoinColumn(
            name = "genre_id"
    )}
    )
    private List<Genre> genres;

    @ManyToMany
    @JoinTable(
            name = "movie_keyword"
            , joinColumns = {@JoinColumn(
            name = "movie_id"
    )}, inverseJoinColumns = {@JoinColumn(
            name = "keyword_id"
    )}
    )
    private List<Keyword> keywords;

    @ManyToMany
    @JoinTable(
            name = "movie_production_company"
            , joinColumns = {@JoinColumn(
            name = "movie_id"
    )}, inverseJoinColumns = {@JoinColumn(
            name = "company_id"
    )}
    )
    private List<ProductionCompany> productionCompanies;

    @ManyToMany
    @JoinTable(
            name = "movie_production_country"
            , joinColumns = {@JoinColumn(
            name = "movie_id"
    )}, inverseJoinColumns = {@JoinColumn(
            name = "country_code"
    )}
    )
    private List<ProductionCountry> productionCountries;

    @ManyToMany
    @JoinTable(
            name = "movie_spoken_language"
            , joinColumns = {@JoinColumn(
            name = "movie_id"
    )}, inverseJoinColumns = {@JoinColumn(
            name = "language_id"
    )}
    )
    private List<SpokenLanguage> spokenLanguages;

}