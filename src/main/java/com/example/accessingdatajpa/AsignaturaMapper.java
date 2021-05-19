package com.example.accessingdatajpa;

import org.mapstruct.Mapper;

@Mapper
public interface AsignaturaMapper {
    Asignatura toEntity(datosAsignatura asignaturaDatos);
}
