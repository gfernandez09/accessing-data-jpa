package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controlador {
    @Autowired
    ToJsonService toJsonService;


    @GetMapping("/register")
    public String showForm(String json, Model model) {
        model.addAttribute("json", json);
        return "registro";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("json") StringJson json) {

        System.out.println(toJsonService.toJson(json.getJson()));
        return "finalRegistro";
    }

}