package com.proyecto.grupo10.infrastructure.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "Alumnos")
@Getter
@Setter
public class AlumnoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    Long id;

    @Column(name = "numDoc",nullable = false,length = 15)
    String numDoc;

    @Column(name = "nombres",nullable = false,length = 150)
    String nombres;

    @Column(name = "ape_pat",nullable = false,length = 150)
    String apellidoPaterno;

    @Column(name = "ape_mat",nullable = false,length = 150)
    String apellidoMaterno;

    @Column(name = "direction",nullable = false)
    String direccion;

    @Column(name = "fecha_nac",nullable = false)
    String fechaNac;

    @Column(name = "pais",nullable = false)
    String pais;

    @Column(name = "estado",nullable = false)
    boolean Estado;

    @Column(name = "usua_crea", length = 45)
    private String usuaCrea;

    @Column(name = "date_create")
    private Timestamp dateCreate;

    @Column(name = "usua_modif", length = 45)
    private String usuaModif;

    @Column(name = "date_modif")
    private Timestamp dateModif;

    @Column(name = "usua_delet", length = 45)
    private String usuaDelet;

    @Column(name = "date_delet")
    private Timestamp dateDelet;


}
