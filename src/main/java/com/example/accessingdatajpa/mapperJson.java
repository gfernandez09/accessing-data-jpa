package com.example.accessingdatajpa;

import org.mapstruct.Mapper;

@Mapper
public interface mapperJson {
    Alumno toEntity(datosAlumno alumnoDatos);
}
