package com.proyecto.grupo10.domain.ports.in;

import com.proyecto.grupo10.domain.aggregates.dto.AlumnoDTO;

import java.util.List;
import java.util.Optional;

public interface AlumnoServiceIn {
    List<AlumnoDTO> getAlumnosOut();

    Optional<AlumnoDTO> createAlumnoIn();

    Optional<AlumnoDTO> getAlumnoByIdIn(Long id);

    Optional<AlumnoDTO> modifyAlumnoByIdIn(Long id);

    Optional<AlumnoDTO> deleteAlumnoByIdIn(Long id);

    List<AlumnoDTO> findByNameAlumnosIn(String pattern);
}
