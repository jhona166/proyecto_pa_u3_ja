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
//		Estudiante estudiante =new Estudiante();
//		estudiante.setNombre("Grace");
//		estudiante.setApellido("Analuiza");
//		estudiante.setCedula("1727501511");
//		estudiante.setGenero("Femenino");
//		estudiante.setCiudad("Guayaquil");
//		this.estudianteService.crear(estudiante);
	
//		Estudiante estudiante2 =new Estudiante();
//		estudiante2.setNombre("Carlos");
//		estudiante2.setApellido("Ortiz");
//		estudiante2.setCedula("1727501516");
//		estudiante2.setGenero("Masculino");
//		estudiante2.setCiudad("Quito");
//		this.estudianteService.crear(estudiante2);
//		
		Estudiante estudiante1=this.estudianteService.buscarApellido("Ortiz");
		System.out.println("1. Consultar un Estudiante por apellido");
		System.out.println(estudiante1);
		
		Estudiante estudiante2=this.estudianteService.buscarPorGenero("Femenino");
		System.out.println("2. Consultar un Estudiante por genero");
		System.out.println(estudiante2);

		Estudiante estudiante3=this.estudianteService.buscarPorCedula("1727501510");
		System.out.println("3. Consultar un Estudiante por cedula");
		System.out.println(estudiante3);
		
		Estudiante estudiante4=this.estudianteService.buscarPorCiudad("Manta");
		System.out.println("4. Consultar un Estudiante por ciudad");
		System.out.println(estudiante4);
		
		
		
		
		
     
	
	}

}
