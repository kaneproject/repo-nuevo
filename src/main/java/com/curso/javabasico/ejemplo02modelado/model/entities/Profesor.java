package com.curso.javabasico.ejemplo02modelado.model.entities;

import java.util.ArrayList;

public class Profesor extends Persona{
	
	@Override
	public String toString() {
		return "Profesor [cursosImpartidos=" + cursosImpartidos + "]";
	}

	private ArrayList<String> cursosImpartidos;
	private String tarjeta;
	public Profesor(String nombre) {
		super(nombre);
	}



	public ArrayList<String> getCursosImpartidos() {
		return cursosImpartidos;
	}

	public void setCursosImpartidos(ArrayList<String> cursosImpartidos) {
		this.cursosImpartidos = cursosImpartidos;
	}



	public String getTarjeta() {
		return tarjeta;
	}



	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
}
