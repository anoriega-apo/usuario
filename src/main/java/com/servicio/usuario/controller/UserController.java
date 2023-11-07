package com.servicio.usuario.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.usuario.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public ResponseEntity create(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userDto);
    }
}
