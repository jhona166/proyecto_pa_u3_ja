package com.example.demo.uce.repository;

import java.util.List;


import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.dto.EstudianteDTO;

public interface IEstudianteRepo {
	public Estudiante buscar(Integer id);
	public void borrar(Integer id);
	
	
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
	
	//public named natice quuery 
	
	//public Estudiante buscarPorNombreQueryPrim(String nombre);
	
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);
	
	
	public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre);
	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre);
	
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre,String apellido, String genero);
	
	
	public int eliminarPorApellido(String apellido);
	public int actualizarPorApellido(String apellido,String nombre);
	
	//----------------------------Tarea15-----------------
	//Update
	public int actualizarPorCedula(String cedula,String apellido);
	public int actualizarPorCiudad(String ciudad,String cedula);
	//Delete     
	public int eliminarPorCedula(String cedula);
	public int eliminarPorCiudad(String ciudad);
}
