package com.cristian.springboot.backend.apirest.dao;

import org.springframework.data.repository.CrudRepository;

import com.cristian.springboot.backend.apirest.entity.Notificacion;

public interface INotificacionDao extends CrudRepository<Notificacion, Integer>{

}
