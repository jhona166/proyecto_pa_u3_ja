package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteRepo iClienteRepo;
	@Override
	public void crear(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepo.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscar(cedula);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iClienteRepo.eliminar(cedula);
	}
	
}
