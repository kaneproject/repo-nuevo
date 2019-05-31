package com.curso.javabasico.ejemplo02modelado.model.entities;

public class Puesto {
	private Boolean portatil;
	private Persona persona;
	@Override
	public String toString() {
		return "Puesto [portatil=" + portatil + ", persona=" + persona + "]";
	}
	public Boolean getPortatil() {
		return portatil;
	}
	public void setPortatil(Boolean portatil) {
		this.portatil = portatil;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	

}
