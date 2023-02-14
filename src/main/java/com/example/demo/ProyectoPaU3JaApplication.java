package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.HotelrepositoryImpl;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3JaApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IHotelService iHotelService;
	@Autowired
	private HotelrepositoryImpl HotelRepository;
	
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
//		Hotel hotel = new Hotel();
//		hotel.setNombre("Panamericano");
//		hotel.setDireccion("La florida");
//		hotel.setHabitaciones(null);
//		hotel.setNombrePrimero("Panam");
//		this.iHotelService.crear(hotel);
		
		
		System.out.println(this.iHotelService.buscarHotelInnerJoin("VIP"));
		List<Hotel> lista=this.iHotelService.buscarHotelInnerJoin("VIP");
		for (Hotel h : lista) {
			System.out.println(h.getNombre());
			for (Habitacion ha : h.getHabitaciones()) {

				System.out.println("LAs habi son: " +ha.getNumero());
			}
			System.out.println();
		}

		

//		System.out.println(this.iHotelService.buscarHotelOuterLeftJoin("VIP"));
//		List<Hotel> lista=this.iHotelService.buscarHotelOuterLeftJoin("VIP");
//		for (Hotel h : lista) {
//			System.out.println(h.getNombre());
//			for (Habitacion ha : h.getHabitaciones()) {
//
//				System.out.println("Las habi son" +h.getNombre());
//			}
//			System.out.println();
//		}
		
//		System.out.println(this.iHotelService.buscarHotelOuterRightJoin("VIP"));
//		List<Hotel> lista1=this.iHotelService.buscarHotelOuterRightJoin("VIP");
//		for (Hotel h : lista1) {
//			System.out.println(h.getNombre());
//			for (Habitacion ha : h.getHabitaciones()) {
//
//				System.out.println("Las habi son" +h.getNombre());
//			}
//			System.out.println();
//		}
		
		
	}

}
