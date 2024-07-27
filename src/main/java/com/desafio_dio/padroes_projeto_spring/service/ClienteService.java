package com.desafio_dio.padroes_projeto_spring.service;

import com.desafio_dio.padroes_projeto_spring.model.Cliente;

public interface ClienteService {

    public Iterable <Cliente> buscarTodos();

    Cliente buscarId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
    
}
