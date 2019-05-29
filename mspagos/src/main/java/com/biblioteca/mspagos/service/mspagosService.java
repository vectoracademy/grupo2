package com.biblioteca.mspagos.service;

import org.springframework.stereotype.Service;

import com.biblioteca.mspagos.dto.pagos;

@Service
public class mspagosService {
	
	public pagos realizarPagos(pagos pago) {
		
		pago.setRealizado(true);
		return pago;
	}

}
