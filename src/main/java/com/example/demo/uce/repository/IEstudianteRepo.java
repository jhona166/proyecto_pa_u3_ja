package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorGenero(String genero);
	public Estudiante buscarPorCedula(String cedula);
	public Estudiante buscarPorCiudad(String ciudad);
	public void insertar(Estudiante estudiante);
	
}
