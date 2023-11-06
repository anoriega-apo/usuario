package com.servicio.usuario.service.impl;

import org.springframework.stereotype.Service;

import com.servicio.usuario.service.ICalculadoraService;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {

    @Override
    public int realizarSuma(int valor1, int valor2) {
        return valor1 + valor2;
    }

}
