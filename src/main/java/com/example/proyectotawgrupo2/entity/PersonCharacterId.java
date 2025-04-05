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
public class PersonCharacterId implements java.io.Serializable {
    private static final long serialVersionUID = -2369760789066244207L;
    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @Column(name = "character_id", nullable = false)
    private Integer characterId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonCharacterId entity = (PersonCharacterId) o;
        return Objects.equals(this.personId, entity.personId) &&
                Objects.equals(this.characterId, entity.characterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, characterId);
    }

}