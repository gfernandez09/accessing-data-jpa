package com.example.accessingdatajpa;

import org.mapstruct.Mapper;

@Mapper
public interface JsonMapper {
    Alumno toEntity(datosAlumno alumnoDatos);
}
