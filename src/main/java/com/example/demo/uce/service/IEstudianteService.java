package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.dto.EstudianteDTO;

public interface IEstudianteService {
	public Estudiante buscar(Integer id);
	public void borrar(Integer id);
	
	
	
	public Estudiante buscarNombre(String nombre);
	public Estudiante buscarApellido(String apellido);
	public void crear(Estudiante estudiante);

	
	public Estudiante buscarPorNombreTypedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
	
	
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);
	public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre);
	public Estudiante buscarPorNombreCriteria(String nombre);
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre,String apellido, String genero);
	
	
	public int eliminarPorApellido(String apellido);
	public int actualizarPorApellido(String apellido,String nombre);
}
