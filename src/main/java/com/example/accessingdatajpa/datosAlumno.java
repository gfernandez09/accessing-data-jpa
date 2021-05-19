package com.example.accessingdatajpa;

import java.util.List;

public class datosAlumno {
    private String nombre;
    private int edad;
    private List<datosAsignatura> asignaturaDatos;

    public datosAlumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nota) {
        this.edad = nota;
    }

    public List<datosAsignatura> getAsignaturas() {
        return asignaturaDatos;
    }

    public void setAsignaturas(List<datosAsignatura> asignaturaDatos) {
        this.asignaturaDatos = asignaturaDatos;
    }
}
