package com.AppBack.appBack.Controlador;

import com.AppBack.appBack.Entidad.equipos;
import com.AppBack.appBack.Servicios.IequiposServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class equiposControlador {

    @Autowired
    private IequiposServicios service;

    @GetMapping("/api/equipos")
    public List<equipos> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/equipos/{id}")
    public equipos getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/equipos/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/equipos")
    public void save(@RequestBody equipos equipo) {
        service.save(equipo);
    }

}
