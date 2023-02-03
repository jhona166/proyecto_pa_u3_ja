package com.example.demo.uce.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clie_sec")
//	@SequenceGenerator(name="clie_sec",sequenceName = "clie_sec",allocationSize = 1 )
	@Column(name="clie_cedula")
	private String cedula;
	@Column(name="clie_nombre")
	private String nombre;
	@Column(name="clie_direccion")
	private String direccion;
	@Column(name="clie_fecha")
	private LocalDateTime fecha;
	
	
	@OneToMany(mappedBy="cliente")
	private List<Renta> rentas;
	
	
	
	public List<Renta> getRentas() {
		return rentas;
	}
	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}
	
	//Set and Get
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
