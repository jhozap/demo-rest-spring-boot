package com.example.demo.models;

import javax.persistence.*;

// especifica que es una entidad de JPA
@Entity
// Especificar nombre de la tabla en la DB
@Table(name = "usuario")
public class UsuarioModel {

    // especificar a la DB que es un id
    @Id
    // se genera automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // el valor es unico y no se permite un valor nulo
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String email;
    private Integer prioridad;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    
    
}
