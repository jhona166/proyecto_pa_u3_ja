package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_sec")
	@SequenceGenerator(name="rent_sec",sequenceName = "rent_sec",allocationSize = 1 )
	@Column(name="rent_id")
	private Integer id;
	@Column(name="rent_fecha")
	private LocalDateTime fecha;
	@Column(name="rent_numero_dias")
	private BigDecimal numeroDias;
	@Column(name="rent_valor")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name="rent_id_cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name="rent_id_vehiculo")
	private Vehiculo vehiculo;
	
	
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getNumeroDias() {
		return numeroDias;
	}
	public void setNumeroDias(BigDecimal numeroDias) {
		this.numeroDias = numeroDias;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
}
