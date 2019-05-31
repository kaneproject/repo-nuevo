package com.curso.javabasico.ejemplo02modelado.model.entities;

import java.util.concurrent.atomic.AtomicInteger;

public class Persona {
	
	private static AtomicInteger contador;
	
	protected String nombre;
	private Integer id;
	
	static {
		contador = new AtomicInteger();
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
		id = Persona.contador.incrementAndGet();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	
}
