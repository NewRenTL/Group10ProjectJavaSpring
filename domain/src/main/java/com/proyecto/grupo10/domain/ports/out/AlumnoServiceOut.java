package com.proyecto.grupo10.domain.ports.out;

import com.proyecto.grupo10.domain.aggregates.dto.AlumnoDTO;
import com.proyecto.grupo10.infrastructure.entity.AlumnoEntity;

import java.util.List;
import java.util.Optional;

public interface AlumnoServiceOut {

    List<AlumnoDTO> getAlumnosOut();

    Optional<AlumnoDTO> createAlumnoOut();

    Optional<AlumnoDTO> getAlumnoByIdOut(Long id);

    Optional<AlumnoDTO> modifyAlumnoByIdOut(Long id);

    Optional<AlumnoDTO> deleteAlumnoByIdOut(Long id);

    List<AlumnoDTO> findByNameAlumnosOut(String pattern);


}
