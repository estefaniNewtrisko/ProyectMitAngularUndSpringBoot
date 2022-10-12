package com.newtrisko.springboot.backend.apirest.springbootbackendapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.newtrisko.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}