/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.Controller;

import com.EjercicioPractico1.Service.LibrosService;
import lombok.extern.slf4j.Slf4j; // Manejo controladores con interfaz en la vista
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/libros") // Creando EndPoint, este es el API
public class LibrosController {
    
    @Autowired 
    private LibrosService librosService; //librosService traer adentro la lista anteriormente creada

    @GetMapping("/listado")
    public String inicio(Model model) { 
        var libros = librosService.getLibros(); // se crea variable libro que obtienen todos los libros que vienen de getLibros
        model.addAttribute("libros", libros); // "libros" es un nombre que le estamos dando a la variable
        model.addAttribute("totalLibros", libros.size()); // totalLibros == libros.size()
        return "/libros/listado";
    }
}
