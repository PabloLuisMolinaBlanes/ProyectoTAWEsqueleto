package com.example.proyectotawgrupo2.repository;

import com.example.proyectotawgrupo2.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
