package com.curso.javabasico.ejemplo02modelado.model.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aula {
	
	private String nombre;
	private ArrayList<Puesto> puestos;
	private Puesto puestoDeProfesor;
	private Boolean proyector;
	private Boolean pizarra;
	private Integer aforoMaximo;
	
	
	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + ", puestos=" + puestos + ", puestoDeProfesor=" + puestoDeProfesor
				+ ", proyector=" + proyector + ", pizarra=" + pizarra + ", aforoMaximo=" + aforoMaximo + "]";
	}
	public Aula(String nombre,Integer aforoMaximo) {
		//super();
		if(validaNombre(nombre)) {
			this.nombre = nombre;
		}else {
			this.nombre = "SIN NOMBRE";
		}
		this.setAforoMaximo(aforoMaximo);
	}
	private Boolean validaNombre(String nombre) {
		return true;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(validaNombre(nombre)) {
			this.nombre = nombre;
		}
	}
	public ArrayList<Puesto> getPuestos() {
		return puestos;
	}
	public void setPuestos(ArrayList<Puesto> puestos) {
		this.puestos = puestos;
	}
	public Puesto getPuestoDeProfesor() {
		return puestoDeProfesor;
	}
	public void setPuestoDeProfesor(Puesto puestoDeProfesor) {
		this.puestoDeProfesor = puestoDeProfesor;
	}
	public Boolean getProyector() {
		return proyector;
	}
	public void setProyector(Boolean proyector) {
		this.proyector = proyector;
	}
	public Boolean getPizarra() {
		return pizarra;
	}
	public void setPizarra(Boolean pizarra) {
		this.pizarra = pizarra;
	}
	public Integer getAforoMaximo() {
		return aforoMaximo;
	}
	public void setAforoMaximo(Integer aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}

}
