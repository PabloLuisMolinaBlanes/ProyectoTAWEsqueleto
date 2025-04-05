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
public class PersonCrewId implements java.io.Serializable {
    private static final long serialVersionUID = -5597504271049782420L;
    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @Column(name = "crew_id", nullable = false, length = 100)
    private String crewId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonCrewId entity = (PersonCrewId) o;
        return Objects.equals(this.crewId, entity.crewId) &&
                Objects.equals(this.personId, entity.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crewId, personId);
    }

}