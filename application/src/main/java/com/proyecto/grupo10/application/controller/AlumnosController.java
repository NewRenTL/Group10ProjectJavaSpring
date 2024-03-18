package com.proyecto.grupo10.application.controller;


import com.proyecto.grupo10.domain.aggregates.dto.AlumnoDTO;
import com.proyecto.grupo10.domain.aggregates.request.RequestAlumno;
import com.proyecto.grupo10.domain.ports.in.AlumnoServiceIn;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupo10/alumnos")
public class AlumnosController {

    private final AlumnoServiceIn alumnoServiceIn;

    //GetAll (Get)
    @GetMapping
    public ResponseEntity<List<AlumnoDTO>> getAllStudents()
    {
        return ResponseEntity.
                status(HttpStatus.OK).
                    body(alumnoServiceIn.obtenerTodosActivosIn());
    }
    //Create Student (Post)
    @PostMapping
    public ResponseEntity<AlumnoDTO> registerAlumno(@RequestBody RequestAlumno requestAlumno)
    {

    }
    //Get student by id (Get)

    //Modify student by id( Put)

    //Delete student by id(

}
