package com.example.proyectotawgrupo2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class MovieSpokenLanguageId implements java.io.Serializable {
    private static final long serialVersionUID = 7743587372296693502L;
    @Column(name = "movie_id", nullable = false)
    private Integer movieId;

    @Column(name = "language_id", nullable = false)
    private Integer languageId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MovieSpokenLanguageId entity = (MovieSpokenLanguageId) o;
        return Objects.equals(this.languageId, entity.languageId) &&
                Objects.equals(this.movieId, entity.movieId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageId, movieId);
    }

}