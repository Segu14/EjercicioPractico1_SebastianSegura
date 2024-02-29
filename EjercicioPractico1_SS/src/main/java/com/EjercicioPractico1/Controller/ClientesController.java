/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.Controller;

import com.EjercicioPractico1.Service.ClientesService;
import lombok.extern.slf4j.Slf4j; // Manejo controladores con interfaz en la vista
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/clientes") // Creando EndPoint, este es el API
public class ClientesController {
    
    @Autowired 
    private ClientesService clientesService; //clientesService traer adentro la lista anteriormente creada

    @GetMapping("/listado")
    public String inicio(Model model) { 
        var clientes = clientesService.getClientes(false); // se crea variable libro que obtienen todos los clientes que vienen de getClientes
        model.addAttribute("clientes", clientes); // "clientes" es un nombre que le estamos dando a la variable
        model.addAttribute("totalClientes", clientes.size()); // totalClientes == clientes.size()
        return "/clientes/listado";
    }
}