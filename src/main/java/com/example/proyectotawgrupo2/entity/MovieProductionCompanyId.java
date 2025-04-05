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
public class MovieProductionCompanyId implements java.io.Serializable {
    private static final long serialVersionUID = 7915514028171385080L;
    @Column(name = "movie_id", nullable = false)
    private Integer movieId;

    @Column(name = "company_id", nullable = false)
    private Integer companyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MovieProductionCompanyId entity = (MovieProductionCompanyId) o;
        return Objects.equals(this.companyId, entity.companyId) &&
                Objects.equals(this.movieId, entity.movieId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, movieId);
    }

}