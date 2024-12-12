package com.app.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column (name = "ejemplo")
    private String banda;
    private String nombre;
    private String fecha;
    private String genero;
}
