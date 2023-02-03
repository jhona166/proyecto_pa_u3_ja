package com.example.demo.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Renta;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.repository.IClienteRepo;
import com.example.demo.uce.repository.IRentaRepo;
import com.example.demo.uce.repository.IVehiculoRepo;

@Service
public class RentaServiceImpl implements IRentaService{
	@Autowired
	private IRentaRepo iRentaRepo;
	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	@Autowired 
	private IClienteRepo iClienteRepo;
	

	@Override
	public void actualizar(Renta renta) {
		// TODO Auto-generated method stub
		this.iRentaRepo.actualizar(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRentaRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iRentaRepo.eliminar(id);
	}

	@Override
	public void crear(String cedula, String placa) {
		// TODO Auto-generated method stub
		Renta renta = new Renta(); 
		Cliente cliente = this.iClienteRepo.buscar(cedula);
		Vehiculo vehiculo = this.iVehiculoRepo.buscar(placa);
		renta.setCliente(cliente);
		renta.setVehiculo(vehiculo);
		BigDecimal valorDia = vehiculo.getValorDia();
		renta.setNumeroDias(new BigDecimal(4));
		renta.setFecha(LocalDateTime.now());
		renta.setValor(valorDia.multiply(renta.getNumeroDias()));
		this.iRentaRepo.insertar(renta);
	}
}
