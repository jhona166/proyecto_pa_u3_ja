package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Automovil;
import com.example.demo.uce.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService{
	@Autowired
	private IAutomovilRepo iAutomovilRepo;
	@Override
	public void crear(Automovil automovil) {
		// TODO Auto-generated method stub
		this.iAutomovilRepo.insertar(automovil);
	}
	@Override
	public List<Automovil> buscarPorModeloTypedQuery(String modelo) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorModeloTypedQuery(modelo);
	}
	@Override
	public List<Automovil> buscarPorMotorTypedQuery(String motor) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorMotorTypedQuery(motor);
	}
	@Override
	public List<Automovil> buscarPorColorloTypedQuery(String color) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorColorloTypedQuery(color);
	}
	@Override
	public List<Automovil> buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo. buscarPorPlacaNativeQuery(placa);
	}
	@Override
	public List<Automovil> buscarPorDuenioNativeQuery(String duenio) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorDuenioNativeQuery(duenio);
	}
	@Override
	public List<Automovil> buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorMarcaNativeQuery(marca);
	}
	@Override
	public List<Automovil> buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorColorNamedQuery(color);
	}
	@Override
	public List<Automovil> buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorPlacaNamedQuery(placa);
	}
	@Override
	public List<Automovil> buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.iAutomovilRepo.buscarPorMarcaNamedQuery(marca);
	}
	
	
}
