package com.cristian.springboot.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cristian.springboot.backend.apirest.entity.Notificacion;
import com.cristian.springboot.backend.apirest.services.INotificacionesService;

@Controller
public class controller {
	
	@Autowired
	private INotificacionesService notificacionesService;
	
	@MessageMapping("/alerta")
	@SendTo("/topic/alerta")
	public List<Notificacion> greeting(Notificacion noti) throws Exception {
		notificacionesService.crear(noti);
		return notificacionesService.findAll();
	}
	
	@PostMapping("/create")
	public Notificacion crear(@RequestBody Notificacion noti) {
		return notificacionesService.crear(noti);
	}
}	  
