package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
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
//		estudiante.setNombre("Jhonatan");
//		estudiante.setApellido("Altamirano");
//		estudiante.setCedula("1727501510");
//		estudiante.setCiudad("Quito");
//		this.estudianteService.crear(estudiante);
	
		System.out.println("Busqueda por TypedQuery");
		Estudiante estudiante1=this.estudianteService.buscarPorNombreTypedQuery("Jhonatan");
		System.out.println(estudiante1);
		System.out.println("Busqueda por NamedQuery");
		Estudiante estudiante2=this.estudianteService.buscarPorNombreNamedQuery("Jhonatan");
		System.out.println(estudiante2);
		System.out.println("Busqueda por NamedQueryTyped");
		Estudiante estudiante3=this.estudianteService.buscarPorNombreNamedQueryTyped("Jhonatan");
		System.out.println(estudiante3);
		System.out.println("Busqueda por NamedNativeQuery");
		Estudiante estudiante4=this.estudianteService.buscarPorNombreNativeQuery("Jhonatan");
		System.out.println(estudiante4);
		
		
		
		
		
	}

}
