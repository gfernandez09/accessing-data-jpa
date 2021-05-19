package com.example.accessingdatajpa;

import javax.persistence.*;

@Entity
public class Alumno {
    @Id
    @GeneratedValue
    int id;
    String nombre;
    int edad;
}
