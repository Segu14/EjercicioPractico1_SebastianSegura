/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.Service.Impl;

import com.EjercicioPractico1.Dao.LibrosDao;
import com.EjercicioPractico1.Domain.Libros;
import com.EjercicioPractico1.Service.LibrosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibrosServiceImpl implements LibrosService {
    
    @Autowired
    private LibrosDao librosDao;

    @Override
    @Transactional(readOnly=true)
    public List<Libros> getLibros() {
        var lista=librosDao.findAll();
        return lista;
    }
}

