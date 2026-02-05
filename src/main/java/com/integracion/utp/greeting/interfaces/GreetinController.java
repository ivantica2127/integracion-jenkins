package com.integracion.utp.greeting.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetinController {

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "Hola " + nombre +" tu eres el futuro programador IA de la UTP";
    }



}
