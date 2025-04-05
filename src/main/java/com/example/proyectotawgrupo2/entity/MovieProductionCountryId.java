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
public class MovieProductionCountryId implements java.io.Serializable {
    private static final long serialVersionUID = 6008683092885755023L;
    @Column(name = "movie_id", nullable = false)
    private Integer movieId;

    @Column(name = "country_code", nullable = false, length = 2)
    private String countryCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MovieProductionCountryId entity = (MovieProductionCountryId) o;
        return Objects.equals(this.countryCode, entity.countryCode) &&
                Objects.equals(this.movieId, entity.movieId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, movieId);
    }

}