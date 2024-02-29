/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.Service.Impl;

import com.EjercicioPractico1.Dao.ClientesDao;
import com.EjercicioPractico1.Domain.Clientes;
import com.EjercicioPractico1.Service.ClientesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientesServiceImpl implements ClientesService {
    
    @Autowired
    private ClientesDao clientesDao;

    @Override
    @Transactional(readOnly=true)
    public List<Clientes> getClientes(boolean activos) {
        var lista=clientesDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
