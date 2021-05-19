package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Asignatura {
    @Id
    @GeneratedValue
    int id;
    String Nombre;
    int nota;
}
