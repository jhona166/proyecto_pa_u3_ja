package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	public Estudiante buscarNombre(String nombre);
	public Estudiante buscarApellido(String apellido);
	public Estudiante buscarPorGenero(String genero);
	public Estudiante buscarPorCedula(String cedula);
	public Estudiante buscarPorCiudad(String ciudad);
	public void crear(Estudiante estudiante);
}
