package com.example.accessingdatajpa;

import javax.persistence.*;

public class datosAsignatura {
    public String nombre;
    public int nota;

    public datosAsignatura() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
