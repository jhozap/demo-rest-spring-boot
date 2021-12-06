package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.asm.Advice.Return;

// definir la clase como tipo servicio
@Service
public class UsuarioService {

    // me auto instancia la interface repository creada anteriormente
    @Autowired
    UsuarioRepository usuarioRepository;


    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

}
