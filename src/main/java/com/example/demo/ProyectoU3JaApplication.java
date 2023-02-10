package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.service.IAutomovilService;

@SpringBootApplication
public class ProyectoU3JaApplication implements CommandLineRunner {
	@Autowired
	private IAutomovilService iAutomovilService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU3JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Automovil auto = new Automovil();
//		auto.setPlaca("PCO123");
//		auto.setMarca("Mercedez");
//		auto.setModelo("Sedan");
//		auto.setDueño("Jhonatan");
//		auto.setColor("Rojo");
//		auto.setAnioFabricacion("2019");
//		auto.setMotor("gasolina");
//		this.iAutomovilService.crear(auto);
//		
//		Automovil auto1 = new Automovil();
//		auto1.setPlaca("PCO456");
//		auto1.setMarca("Chevrolet");
//		auto1.setModelo("Aveo");
//		auto1.setDueño("Pablo");
//		auto1.setColor("Negro");
//		auto1.setAnioFabricacion("2015");
//		auto1.setMotor("gasolina");
//		this.iAutomovilService.crear(auto1);
//
//		Automovil auto2 = new Automovil();
//		auto2.setPlaca("PCO789");
//		auto2.setMarca("Toyota");
//		auto2.setModelo("Hilux");
//		auto2.setDueño("Diego");
//		auto2.setColor("Plateado");
//		auto2.setAnioFabricacion("2022");
//		auto2.setMotor("Diesel");
//		this.iAutomovilService.crear(auto2);
//
//		Automovil auto3 = new Automovil();
//		auto3.setPlaca("PCO012");
//		auto3.setMarca("Chevrolet");
//		auto3.setModelo("D-Max");
//		auto3.setDueño("Maria");
//		auto3.setColor("Rojo");
//		auto3.setAnioFabricacion("2021");
//		auto3.setMotor("gasolina");
//		this.iAutomovilService.crear(auto3);
//
//		Automovil auto4 = new Automovil();
//		auto4.setPlaca("PCO345");
//		auto4.setMarca("Great Wall");
//		auto4.setModelo("Wingle");
//		auto4.setDueño("Grace");
//		auto4.setColor("Negro");
//		auto4.setAnioFabricacion("2023");
//		auto4.setMotor("Diesel");
//		this.iAutomovilService.crear(auto4);
//	
		//TypedQuery
		//1
		System.out.println("1.Buscar por modelo TypedQuery");
		List<Automovil> automovil1=this.iAutomovilService.buscarPorModeloTypedQuery("Wingle");
		
		System.out.println(automovil1);
		//2
		System.out.println("2.Buscar por motor TypedQuery");
		List<Automovil> automovil12=this.iAutomovilService.buscarPorMotorTypedQuery("Diesel");
		
		System.out.println(automovil12);
		//3
		System.out.println("3.Buscar por color PorColorloTypedQuery");
		List<Automovil> automovil3=this.iAutomovilService.buscarPorColorloTypedQuery("Negro");
		
		System.out.println(automovil3);
	
		//4
		System.out.println("4.Buscar por placa PlacaNativeQuery");
		List<Automovil> automovil4=this.iAutomovilService.buscarPorPlacaNativeQuery("PCO123");
				
		System.out.println(automovil4);
		//5
		System.out.println("5.Buscar por placa DuenioNativeQuery");
		List<Automovil> automovil5=this.iAutomovilService.buscarPorDuenioNativeQuery("Diego");
				
		System.out.println(automovil5);
		//6
		System.out.println("6.Buscar por placa MarcaNativeQuery");
		List<Automovil> automovil6=this.iAutomovilService.buscarPorMarcaNativeQuery("Toyota");
						
		System.out.println(automovil6);
		
		//7
		System.out.println("7.Buscar por ColorNamedQuery");
		List<Automovil> automovil7= this.iAutomovilService.buscarPorColorNamedQuery("Negro");
								
		System.out.println(automovil7);
		
	
		//8
		System.out.println("8.Buscar por buscarPorPlacaNamedQuery");
		List<Automovil> automovil8=this.iAutomovilService.buscarPorPlacaNamedQuery("PCO123");
								
		System.out.println(automovil8);
	
		//9
		System.out.println("9.Buscar por placa buscarPorMarcaNamedQuery");
		List<Automovil> automovil9=this.iAutomovilService.buscarPorMarcaNamedQuery("Toyota");
								
		System.out.println(automovil9);
		
		
		//10
		System.out.println("10.Buscar por modelo TypedQuery");
		List<Automovil> automovil11=this.iAutomovilService.buscarPorModeloTypedQuery("Wingle");
				
		System.out.println(automovil11);
				//11
		System.out.println("11.Buscar por motor TypedQuery");
		List<Automovil> automovil121=this.iAutomovilService.buscarPorMotorTypedQuery("Diesel");
				
		System.out.println(automovil121);
				//12
		System.out.println("12.Buscar por color PorColorloTypedQuery");
		List<Automovil> automovil14=this.iAutomovilService.buscarPorColorloTypedQuery("Negro");
				
		System.out.println(automovil14);
	
		
		
		
		
		
		
		
		
		
	
	}

	
}
