package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.repository.IEstudianteRepo;
@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	private IEstudianteRepo iEstudianteRepo;
	@Override
	public Estudiante buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQuery(nombre);
	}

	@Override
	public Estudiante buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorApellidoQuery(apellido);
	}

	@Override
	public void crear(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepo.insertar(estudiante);
	}

	@Override
	public Estudiante buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorGenero(genero);
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorCedula(cedula);
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorCiudad(ciudad);
	}

}
