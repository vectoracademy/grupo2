package com.biblioteca.mspagos.controller;

import java.awt.List;
import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import com.biblioteca.mspagos.dto.pagos;
import com.biblioteca.mspagos.service.mspagosService;

@Controller
@RequestMapping( value = "/pagos")
public class mspagosController {
	
	@Autowired
	 mspagosService service;
	
    @GetMapping("/ver/{nombre}")
    public ResponseEntity<ArrayList<pagos>>  obtenerPagos( @PathVariable("nombre") String nombre) {
    	
    	ArrayList<pagos> pagoLista = new ArrayList<pagos>();
    	switch (nombre) {
		case "alejandro":
			pagoLista.add(new pagos(100, "alejandro", true));
			break;
		case "antonio":
			pagoLista.add(new pagos(100, "antonio", false));
			pagoLista.add(new pagos(100, "antonio", false));
			pagoLista.add(new pagos(100, "antonio", false));
			break;
		}
    	
    	return new ResponseEntity<ArrayList<pagos>>(pagoLista, HttpStatus.OK);
    }
    
    @PostMapping("/realizar")
    @ResponseBody
    public pagos postPagos(@RequestBody pagos pago) {
    	
    	return pago;
      
    }

}
