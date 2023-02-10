package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")
@NamedQueries({
	@NamedQuery(name = "Automovil.buscarPorPlaca",query = "select a from Automovil a where a.placa=:datoPlaca"),//nombre de la entidad,Nombre representativo del JPQL
	@NamedQuery(name = "Automovil.buscarPorColor",query = "select a from Automovil a where a.color=:datoColor"),//nombre de la entidad,Nombre representativo del JPQL
	@NamedQuery(name = "Automovil.buscarPorMarca",query = "select a from Automovil a where a.marca=:datoMarca")//nombre de la entidad,Nombre representativo del JPQL
	
})

@NamedNativeQueries({
	@NamedNativeQuery(name="Automovil.buscarPorModeloNative",query="select * from Automovil where auto_modelo=:datoModelo",resultClass = Automovil.class),
	@NamedNativeQuery(name="Automovil.buscarPorModeloNative1",query="select * from Automovil where auto_modelo=:datoModelo",resultClass = Automovil.class),
	@NamedNativeQuery(name="Automovil.buscarPorModeloNative2",query="select * from Automovil where auto_modelo=:datoModelo",resultClass = Automovil.class)
	})                                         

public class Automovil {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "auto_sec")
	@SequenceGenerator(name = "auto_sec", sequenceName = "auto_sec", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;
	@Column(name = "auto_placa")
	private String placa;
	@Column(name = "auto_modelo")
	private String modelo;
	@Column(name = "auto_marca")
	private String marca;
	@Column(name = "auto_color")
	private String color;
	@Column(name = "auto_dueño")
	private String dueño;
	@Column(name = "auto_anio_fabricacion")
	private String anioFabricacion;
	@Column(name = "auto_motor")
	private String motor;	
	
	
	
	
	
	@Override
	public String toString() {
		return "Automovil [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", color="
				+ color + ", dueño=" + dueño + ", anioFabricacion=" + anioFabricacion + ", motor=" + motor + "]";
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDueño() {
		return dueño;
	}
	public void setDueño(String dueño) {
		this.dueño = dueño;
	}
	public String getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}	
	
	
	
	
	
}
