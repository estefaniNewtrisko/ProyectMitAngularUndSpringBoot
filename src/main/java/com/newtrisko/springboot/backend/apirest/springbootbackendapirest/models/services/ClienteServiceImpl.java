package com.newtrisko.springboot.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtrisko.springboot.backend.apirest.springbootbackendapirest.models.dao.IClienteDao;
import com.newtrisko.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>)clienteDao.findAll();
    }
    
}