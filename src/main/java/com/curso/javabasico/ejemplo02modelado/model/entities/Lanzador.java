package com.curso.javabasico.ejemplo02modelado.model.entities;

import java.util.ArrayList;

public class Lanzador {
	public static void main(String[] args) {
		Aula aulaMiami = new Aula("Miami", 16);
		aulaMiami.setPizarra(true);
		aulaMiami.setProyector(true);
		Puesto puestoDeProfesor = new Puesto();
		puestoDeProfesor.setPortatil(true);
		puestoDeProfesor.setPersona(new Profesor("Ruben"));
		aulaMiami.setPuestoDeProfesor(puestoDeProfesor);
		ArrayList<Puesto> lista = new ArrayList<Puesto>();
		
		
		lista.add(new Puesto());
		lista.add(new Puesto());
		lista.add(new Puesto());
		Puesto puestoDeOlga = new Puesto();
		puestoDeOlga.setPortatil(true);
		puestoDeOlga.setPersona(new Alumno("Olga"));
		lista.add(puestoDeOlga);
		aulaMiami.setPuestos(lista);
		System.out.println(aulaMiami);
		
	}
}
