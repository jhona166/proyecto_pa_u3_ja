package com.example.demo.uce.modelo;

import java.math.BigDecimal;
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
@Table(name="vehiculo")
public class Vehiculo {
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_sec")
//	@SequenceGenerator(name="vehi_sec",sequenceName = "vehi_sec",allocationSize = 1 )
	@Column(name="vehi_placa")
	private String placa;
	@Column(name="vehi_valor_por_dia")
	private BigDecimal valorDia;
	
	@OneToMany(mappedBy="vehiculo")
	private List<Renta> rentas;
	
	
	//Set and Get
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public BigDecimal getValorDia() {
		return valorDia;
	}
	public void setValorDia(BigDecimal valorDia) {
		this.valorDia = valorDia;
	}
	public List<Renta> getRentas() {
		return rentas;
	}
	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}
	
}
