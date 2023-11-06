package com.servicio.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.usuario.service.ICalculadoraService;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    private ICalculadoraService calculadoraService;

    @GetMapping
    public int sumar(@PathParam("valor1") int valor1, @PathParam("valor2") int valor2) {

        return calculadoraService.realizarSuma(valor1, valor2);
    }

    @GetMapping("/resta")
    public String restar(@PathParam("valor1") int valor1, @PathParam("valor2") int valor2) {
        int result = valor1 - valor2;
        return "el resultado es: " + result;
    }
}
