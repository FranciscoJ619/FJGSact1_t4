package com.prueba.spring.actividad1.springboot_aplicaciones.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class EjemploRestController {

    @GetMapping("/detalles_info")

    public Map<String, Object> detalles_info() {
        Map<String, Object> model = new HashMap<>();
        model.put("Titulo", "Servidor en linea");
        model.put("Servidor", "Ipconfig");
        model.put("IP", "192.168.1.1");
        return model;
    }

}
