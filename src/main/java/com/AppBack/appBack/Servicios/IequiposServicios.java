package com.AppBack.appBack.Servicios;

import com.AppBack.appBack.Entidad.equipos;

import java.util.List;

public interface IequiposServicios {
    List<equipos> getAll();
    equipos getById(Long id);
    void remove(Long id);
    void save(equipos equipo);
}
