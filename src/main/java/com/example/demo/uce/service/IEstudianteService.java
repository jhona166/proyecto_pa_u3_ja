package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	public Estudiante buscarNombre(String nombre);
	public Estudiante buscarApellido(String apellido);
	public void crear(Estudiante estudiante);

	
	public Estudiante buscarPorNombreTypedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
}
