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
public class MovieKeywordId implements java.io.Serializable {
    private static final long serialVersionUID = -911117587437887577L;
    @Column(name = "movie_id", nullable = false)
    private Integer movieId;

    @Column(name = "keyword_id", nullable = false)
    private Integer keywordId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MovieKeywordId entity = (MovieKeywordId) o;
        return Objects.equals(this.keywordId, entity.keywordId) &&
                Objects.equals(this.movieId, entity.movieId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordId, movieId);
    }

}