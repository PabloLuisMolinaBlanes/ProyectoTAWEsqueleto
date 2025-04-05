package com.example.proyectotawgrupo2.repository;

import com.example.proyectotawgrupo2.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {
}
