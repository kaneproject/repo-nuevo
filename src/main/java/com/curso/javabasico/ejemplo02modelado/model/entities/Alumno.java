package com.curso.javabasico.ejemplo02modelado.model.entities;

import java.util.ArrayList;

public class Alumno extends Persona{

	

	private ArrayList<String> conocimientos;
	public Alumno(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Alumno [conocimientos=" + conocimientos + ", nombre=" + nombre + "]";
	}

	public ArrayList<String> getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(ArrayList<String> conocimientos) {
		this.conocimientos = conocimientos;
	}
}
