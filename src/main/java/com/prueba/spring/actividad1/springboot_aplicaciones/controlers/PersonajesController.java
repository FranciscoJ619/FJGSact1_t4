package com.prueba.spring.actividad1.springboot_aplicaciones.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController 
public class PersonajesController {

    @GetMapping("/personajes_info")

    public Map<String, Object> personajes_info() {
        Map<String, Object> model = new HashMap<>();
        model.put("Personaje1", "Kratos");
        model.put("Personaje 2", "Commando");
        return model;
    }

}
