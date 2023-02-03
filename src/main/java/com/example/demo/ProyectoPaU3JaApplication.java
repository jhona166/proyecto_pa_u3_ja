package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.service.IClienteService;
import com.example.demo.uce.service.IRentaService;
import com.example.demo.uce.service.IVehiculoService;
	

@SpringBootApplication
public class ProyectoPaU3JaApplication implements CommandLineRunner{
	@Autowired
	private IClienteService iClienteService;
	@Autowired 
	private IVehiculoService iVehiculoService;
	@Autowired 
	private IRentaService iRentaService; 
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//1
		Cliente cliente = new Cliente();
		cliente.setCedula("1727501510");
		cliente.setNombre("Jhonatan");
		cliente.setDireccion("Quito");
		cliente.setFecha(LocalDateTime.now());
		
		this.iClienteService.crear(cliente);
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca("PCO123");
		vehiculo.setValorDia(new BigDecimal(2));
		this.iVehiculoService.crear(vehiculo);
	
		
		this.iRentaService.crear(cliente.getCedula(), vehiculo.getPlaca());
		
	}

}
