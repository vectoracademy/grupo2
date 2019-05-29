package com.biblioteca.msreserva.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class reserva {

	String usuarioReserva;
	String nombreLibro;
	String fechaReserva;
	Boolean estadoReserva;
	
}
