package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// se agrega para indicar que es un repositorio
@Repository
// interface de implementacion de metodos (DI), aqui definivos el tipo de dato, es decir un modelo de usuario y el tipo de dato de su identificador principal
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    
}
