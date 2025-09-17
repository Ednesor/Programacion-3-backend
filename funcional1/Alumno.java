package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Alumno{
    private String nombre;
    private float nota;
    private String curso;

}

