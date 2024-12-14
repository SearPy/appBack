package com.AppBack.appBack.Servicios;

import com.AppBack.appBack.Entidad.equipos;
import com.AppBack.appBack.Repositorio.equipoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class equiposServicios implements IequiposServicios{

    @Autowired
    private equipoRepositorio repository;

    @Override
    public List<equipos> getAll() {
        return (List<equipos>) repository.findAll();
    }

    @Override
    public equipos getById(Long id) {
        return (equipos) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(equipos equipo) {
        repository.save(equipo);
    }
}
