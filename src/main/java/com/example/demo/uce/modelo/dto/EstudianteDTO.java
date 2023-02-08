package com.example.demo.uce.modelo.dto;

import jakarta.persistence.Column;

public class EstudianteDTO {

	private String nombre;
	private String apellido;
	private String cedula;
	
	
	public EstudianteDTO() {
		
	}
	
	public EstudianteDTO(String nombre, String apellido, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	
	
	//Set and get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

}