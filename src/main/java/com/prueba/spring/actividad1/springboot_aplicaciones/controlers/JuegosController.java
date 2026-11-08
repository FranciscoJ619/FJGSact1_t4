package com.prueba.spring.actividad1.springboot_aplicaciones.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController 
public class JuegosController {

   @GetMapping("/juegos_info")

    public Map<String, Object> juegos_info() {
        Map<String, Object> model = new HashMap<>();
        model.put("Juego1", "GOD of War");
        model.put("Juego 2", "Risk of Rain 2");
        return model;
    }
}
