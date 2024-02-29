/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.Service;

import com.EjercicioPractico1.Domain.Clientes;
import java.util.List;

public interface ClientesService {

    public List<Clientes> getClientes(boolean activos);
    
}
