package com.proyecto.grupo10.domain.aggregates.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class ResponseReniec {
    private String nombres;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String tipoDocumento;
    private String numeroDocumento;
    private String digitoVerificador;
}
