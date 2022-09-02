package com.cristian.springboot.backend.apirest.services;

import java.util.List;

import com.cristian.springboot.backend.apirest.entity.Notificacion;

public interface INotificacionesService {
	
	public Notificacion crear(Notificacion noti);
	
	public List<Notificacion> findAll();
	
}
