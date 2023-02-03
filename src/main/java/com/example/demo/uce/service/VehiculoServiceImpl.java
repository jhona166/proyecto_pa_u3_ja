package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo cliente) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.actualizar(cliente);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscar(placa);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.eliminar(placa);
	}
}
