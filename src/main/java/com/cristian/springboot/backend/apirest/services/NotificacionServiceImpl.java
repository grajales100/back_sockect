package com.cristian.springboot.backend.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.springboot.backend.apirest.dao.INotificacionDao;
import com.cristian.springboot.backend.apirest.entity.Notificacion;

@Service
public class NotificacionServiceImpl implements INotificacionesService{
	
	@Autowired
	private INotificacionDao notificacionesDao;
	
	@Override
	public Notificacion crear(Notificacion noti) {
		return notificacionesDao.save(noti);
	}

	@Override
	public List<Notificacion> findAll() {
		return (List<Notificacion>) notificacionesDao.findAll();
	}

}
