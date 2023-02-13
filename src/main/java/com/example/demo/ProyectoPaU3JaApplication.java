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
//		estudiante.setNombre("Jhonatan");
//		estudiante.setApellido("Altamirano");
//		estudiante.setCedula("1727501510");
//		estudiante.setCiudad("Quito");
//		estudiante.setGenero("M");
//		this.estudianteService.crear(estudiante);
//		
//		Estudiante estudiante1 =new Estudiante();
//		estudiante1.setNombre("Grace");
//		estudiante1.setApellido("Analuiza");
//		estudiante1.setCedula("1727501511");
//		estudiante1.setCiudad("Quito");
//		estudiante1.setGenero("F");
//		this.estudianteService.crear(estudiante1);
//		
//		Estudiante estudiante2 =new Estudiante();
//		estudiante2.setNombre("Karol");
//		estudiante2.setApellido("Analuiza");
//		estudiante2.setCedula("1727501512");
//		estudiante2.setCiudad("Quito");
//		estudiante2.setGenero("F");
//		this.estudianteService.crear(estudiante2);
//		
//		Estudiante estudiante3 =new Estudiante();
//		estudiante3.setNombre("Lenin");
//		estudiante3.setApellido("Caroa");
//		estudiante3.setCedula("1727501513");
//		estudiante3.setCiudad("Machcahi");
//		estudiante3.setGenero("M");
//		this.estudianteService.crear(estudiante3);
//		
//		Estudiante estudiante4 =new Estudiante();
//		estudiante4.setNombre("Carlos");
//		estudiante4.setApellido("Ortiz");
//		estudiante4.setCedula("1727501514");
//		estudiante4.setCiudad("Machachi");
//		estudiante4.setGenero("M");
//		this.estudianteService.crear(estudiante4);
//		
//		Estudiante estudiante5 =new Estudiante();
//		estudiante5.setNombre("Diego");
//		estudiante5.setApellido("Zambrano");
//		estudiante5.setCedula("1727501515");
//		estudiante5.setCiudad("Machachi");
//		estudiante5.setGenero("M");
//		this.estudianteService.crear(estudiante5);
//
//		Estudiante estudiante6 =new Estudiante();
//		estudiante6.setNombre("Santiago");
//		estudiante6.setApellido("Chango");
//		estudiante6.setCedula("1727501516");
//		estudiante6.setCiudad("Quito");
//		estudiante6.setGenero("M");
//		this.estudianteService.crear(estudiante6);
//
//		Estudiante estudiante7 =new Estudiante();
//		estudiante7.setNombre("Cristina");
//		estudiante7.setApellido("Zambrano");
//		estudiante7.setCedula("1727501517");
//		estudiante7.setCiudad("Quito");
//		estudiante7.setGenero("F");
//		this.estudianteService.crear(estudiante7);
//
//		Estudiante estudiante8 =new Estudiante();
//		estudiante8.setNombre("Mishell");
//		estudiante8.setApellido("Moreno");
//		estudiante8.setCedula("1727501518");
//		estudiante8.setCiudad("Quito");
//		estudiante8.setGenero("F");
//		this.estudianteService.crear(estudiante8);
//
//		Estudiante estudiante9 =new Estudiante();
//		estudiante9.setNombre("Henry");
//		estudiante9.setApellido("Chicaiza");
//		estudiante9.setCedula("1727501519");
//		estudiante9.setCiudad("Guayaquil");
//		estudiante9.setGenero("M");
//		this.estudianteService.crear(estudiante9);

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
//		estudiante15.setNombre("Diego");
//		estudiante15.setApellido("Zambrano");
//		estudiante15.setCedula("1727501511");
//		estudiante15.setCiudad("Quito");
//		this.estudianteService.crear(estudiante15);
		/*
		System.out.println("Busqueda buscarPorNombreQueryList");
//		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		
		System.out.println(estudiante6);
		//System.out.println("Busqueda buscarPorDTO");
//		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		//EstudianteDTO estudiante7=this.estudianteService.buscarPorNombreTypedQueryDTO("Areu");
		
		//System.out.println(estudiante7);
		
		System.out.println("Busqueda buscarPorNombreQueryTypedCriteria");
//		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		List<Estudiante> estudiante8=this.estudianteService.buscarPorNombreCriteriaAndOr("Jhonatan","Altamirano","F");
		
		System.out.println(estudiante8);
		//public int eliminarPorApellido(String apellido);
		//public int actualizarPorApellido(String apellido,String nombre);
		System.out.println("Eliminar por apellido");
//		List<Estudiante> estudiante6=this.estudianteService.buscarPorNombreQueryList("Jhonatan");
		int ea = this.estudianteService.eliminarPorApellido("Caroa");
		
		
		*/
//		System.out.println("1.Actualizar por nombre");
//		
//		int estudiante50 = this.estudianteService.actualizarPorApellido("Ortiz", "David");
//		System.out.println(estudiante50);		
//		Estudiante estudiante51 = new Estudiante();
//		estudiante51 = this.estudianteService.buscarApellido("Altamirano");
//		System.out.println(estudiante51);
		
		//----------------Update1------------------------
//		Estudiante estudiantec1 = new Estudiante();
//		estudiantec1 = this.estudianteService.buscarApellido("Ortiz");
//		System.out.println(estudiantec1);
//		
//		System.out.println("Update1");
//		int estudiantem1 = this.estudianteService.actualizarPorApellido("Ortiz", "DAvid");
//		System.out.println(estudiantem1);
//		estudiantec1 = this.estudianteService.buscarApellido("Ortiz");
//		System.out.println(estudiantec1);
		//----------------Update2------------------------
//		Estudiante estudiantec2 = new Estudiante();
//		estudiantec2 = this.estudianteService.buscarApellido("Chicaiza");
//		System.out.println(estudiantec2);
//		
//		System.out.println("Update2");
//		int estudiantem2 = this.estudianteService.actualizarPorCiudad("Guayaquil","0912345678");
//		System.out.println(estudiantem2);
//		estudiantec2 = this.estudianteService.buscarApellido("Chicaiza");
//		System.out.println(estudiantec2);
		//----------------Eliminar------------------------
		System.out.println("1.Eliminar por cedula");
		int ea = this.estudianteService.eliminarPorCedula("1727501511");
		System.out.println("Eliminado: "+ea);
//		System.out.println("2.Eliminar por ciudad");
//		int ea1 = this.estudianteService.eliminarPorCiudad("Guayaquil");
//		System.out.println("Eliminado: "+ea1);
//		
		
	}

}
