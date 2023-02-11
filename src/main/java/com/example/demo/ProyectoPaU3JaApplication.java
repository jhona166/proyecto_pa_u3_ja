package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.dto.EstudianteDTO;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3JaApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Estudiante estudiante =new Estudiante();
//		estudiante.setNombre("Karol");
//		estudiante.setApellido("Analuiza");
//		estudiante.setCedula("1727501511");
//		estudiante.setCiudad("Quito");
//		this.estudianteService.crear(estudiante);
//		
//		Estudiante estudiante11 =new Estudiante();
//		estudiante11.setNombre("Grace");
//		estudiante11.setApellido("Analuiza");
//		estudiante11.setCedula("1727501511");
//		estudiante11.setCiudad("Quito");
//		this.estudianteService.crear(estudiante11);
//		
//		Estudiante estudiante12 =new Estudiante();
//		estudiante12.setNombre("Grace");
//		estudiante12.setApellido("Analuiza");
//		estudiante12.setCedula("1727501511");
//		estudiante12.setCiudad("Quito");
//		this.estudianteService.crear(estudiante12);
//		
//		
//		List<Estudiante> estudiantes = new ArrayList<>();
//		estudiantes.add(estudiante);
//		estudiantes.add(estudiante11);
//		estudiantes.add(estudiante12);
		
		
		
		
//	
//		System.out.println("Busqueda por TypedQuery");
//		Estudiante estudiante1=this.estudianteService.buscarPorNombreTypedQuery("Jhonatan");
//		System.out.println(estudiante1);
//		System.out.println("Busqueda por NamedQuery");
//		Estudiante estudiante2=this.estudianteService.buscarPorNombreNamedQuery("Jhonatan");
//		System.out.println(estudiante2);
//		System.out.println("Busqueda por NamedQueryTyped");
//		Estudiante estudiante3=this.estudianteService.buscarPorNombreNamedQueryTyped("Jhonatan");
//		System.out.println(estudiante3);
//		System.out.println("Busqueda por NamedNativeQuery");
//		Estudiante estudiante4=this.estudianteService.buscarPorNombreNativeQuery("Jhonatan");
//		System.out.println(estudiante4);
//		System.out.println("Busqueda por NombreNativeQueryTypedNamed");
//		Estudiante estudiante5=this.estudianteService.buscarPorNombreNativeQueryTypedNamed("Jhonatan");
//		System.out.println(estudiante5);
		
		
	//	public List<Estudiante> buscarPorNombreQueryList(String nombre);
		//public List<Estudiante> buscarPorNombreNamedQueryList(String nombre);
		//public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);
		
		
//		Estudiante estudiante15 =new Estudiante();
//		estudiante15.setNombre("Areu");
//		estudiante15.setApellido("Bernabeu");
//		estudiante15.setCedula("1727501511");
//		estudiante15.setCiudad("Brazil");
//		this.estudianteService.crear(estudiante15);
		
		System.out.println("Busqueda buscarPorNombreQueryList");
//		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		
		System.out.println(estudiante6);
		System.out.println("Busqueda buscarPorDTO");
//		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		EstudianteDTO estudiante7=this.estudianteService.buscarPorNombreTypedQueryDTO("Areu");
		
		System.out.println(estudiante7);
		
		System.out.println("Busqueda buscarPorNombreQueryTypedCriteria");
//		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		List<Estudiante> estudiante8=this.estudianteService.buscarPorNombreCriteriaAndOr("Jhonatan","Altamirano","F");
		
		System.out.println(estudiante8);
		
	}

}
