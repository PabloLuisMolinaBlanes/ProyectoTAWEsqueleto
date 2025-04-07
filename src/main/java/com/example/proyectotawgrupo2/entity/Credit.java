package com.example.proyectotawgrupo2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "credit")
public class Credit {
    @Id
    @Column(name = "id", nullable = false, length = 100)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private com.example.proyectotawgrupo2.entity.Movie movie;

}