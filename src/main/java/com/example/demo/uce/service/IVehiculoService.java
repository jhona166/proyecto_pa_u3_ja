package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoService {
	public void crear(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar (String placa);
	public void eliminar(String placa);
}
