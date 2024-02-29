/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.Domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.security.Identity;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class Clientes implements Serializable{
    private static final long serialVersionUID = 1L; // Se declara nada más 
    
    @Id //Se define el campo clave
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    private String nombre;
    private String email;

    private boolean activo;
    
    public Clientes() {
    }

    public Clientes(String clientes, boolean activo) {
        this.nombre = clientes;
        this.activo = activo;
    }
}
