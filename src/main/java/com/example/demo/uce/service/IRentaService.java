package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Renta;

public interface IRentaService {
	public void crear(String cedula,String placa);
	public void actualizar(Renta renta);
	public Renta buscar (Integer id);
	public void eliminar(Integer id);
}
