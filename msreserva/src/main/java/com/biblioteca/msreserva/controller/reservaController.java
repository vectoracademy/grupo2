package com.biblioteca.msreserva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.msreserva.dto.pagos;
import com.biblioteca.msreserva.dto.reserva;
import com.biblioteca.msreserva.service.restTemplate;


@RestController
@RequestMapping(value="/reserva")
public class reservaController {

	@Autowired
	restTemplate resttemplate;
	
	@GetMapping("/listado/pagos")
	public String listadoPagos() {
	    
	  return "has hecho una peticion get";
	    
	}
	
	@PostMapping("/hacer_reserva")
	public ResponseEntity<List<pagos>> reservar(@RequestBody reserva reserva) {
		
		return resttemplate.obtenerPagos(reserva.getUsuarioReserva());
	    
	}
	

	
	
}
