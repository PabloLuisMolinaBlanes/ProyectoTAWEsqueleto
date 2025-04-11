package com.example.proyectotawgrupo2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id")
    private Gender gender;

    @ManyToMany
    @JoinTable(
            name = "person_character"
            , joinColumns = {@JoinColumn(
            name = "person_id"
    )}, inverseJoinColumns = {@JoinColumn(
            name = "character_id"
    )}
    )
    private List<Character> characters;

    @ManyToMany
    @JoinTable(
            name = "person_country"
            , joinColumns = {@JoinColumn(
            name = "person_id"
    )}, inverseJoinColumns = {@JoinColumn(
            name = "country_code"
    )}
    )
    private List<Country> countries;

    @ManyToMany
    @JoinTable(
            name = "person_crew"
            , joinColumns = {@JoinColumn(
            name = "person_id"
    )}, inverseJoinColumns = {@JoinColumn(
            name = "crew_id"
    )}
    )
    private List<Crew> crewMembers;

}