package com.proyecto.grupo10.infrastructure.repository;

import com.proyecto.grupo10.infrastructure.entity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnosRepository extends JpaRepository<AlumnoEntity,Long> {
    //
}
