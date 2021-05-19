package com.example.accessingdatajpa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class ToJsonServiceImp implements ToJsonService {
    ObjectMapper om = new ObjectMapper();
    datosAlumno alumnoDatos;

    @Override
    public datosAlumno toJson(String json) {
        try {
            alumnoDatos = om.readValue((json), datosAlumno.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return alumnoDatos;
    }
}
