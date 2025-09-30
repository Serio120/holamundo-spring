package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/saludar")  //Esta es la ruta que se debe escribir en el navegador (Diretorio saludar)
    public String saludar() {
        return "¡Hola Mundo desde Spring Boot! <br> ¡Hola Mundo desde Spring Boot!";

    }

    @GetMapping("/hola")  //Esta es la ruta que se debe escribir en el navegador (Diretorio hola)
    public String hola() {
        return "¡Hola! <br> ¡Hola!";

    }
}