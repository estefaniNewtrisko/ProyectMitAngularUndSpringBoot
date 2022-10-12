package com.newtrisko.springboot.backend.apirest.springbootbackendapirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newtrisko.springboot.backend.apirest.springbootbackendapirest.models.services.IClienteService;
import com.newtrisko.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;

import java.util.List;

@RestController
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }
}
