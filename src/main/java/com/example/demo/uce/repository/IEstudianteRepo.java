package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public void insertar(Estudiante estudiante);
	//Typed Query
	public Estudiante buscarPorNombreTypedQuery(String nombre);
	//Named Query
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	//Name Typed Query
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	//Native Query
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	//Query Typed Named
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
	
	
	


	
	
}
