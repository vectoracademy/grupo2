package com.biblioteca.msreserva.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.biblioteca.msreserva.dto.pagos;

@Service
public class restTemplate {

	public ResponseEntity<List<pagos>> obtenerPagos (String nombreUsuario) {
		
		RestTemplate restTemplate = new RestTemplate();
		String direccionUrl = "http://localhost:8090/pagos/ver/" + nombreUsuario;
		ResponseEntity<List<pagos>> response = restTemplate.exchange(direccionUrl, HttpMethod.GET,null, new ParameterizedTypeReference<List<pagos>>(){});
		
		return response;
				
	}
		
}
