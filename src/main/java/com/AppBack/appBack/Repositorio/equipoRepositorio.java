package com.AppBack.appBack.Repositorio;


import com.AppBack.appBack.Entidad.equipos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface equipoRepositorio extends CrudRepository<equipos, Long> {
}
