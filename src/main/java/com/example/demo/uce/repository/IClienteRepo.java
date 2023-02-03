package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Cliente;

public interface IClienteRepo {
	public void insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar (String cedula);
	public void eliminar(String cedula);
	
	
}
