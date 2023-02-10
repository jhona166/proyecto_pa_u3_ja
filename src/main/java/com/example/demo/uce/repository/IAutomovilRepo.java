package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.modelo.Automovil;

public interface IAutomovilRepo {
	public void insertar(Automovil automovil);
	//Typed Query
	public List<Automovil> buscarPorModeloTypedQuery(String modelo);
	public List<Automovil> buscarPorMotorTypedQuery(String motor);
	public List<Automovil> buscarPorColorloTypedQuery(String color);
	//NativeQuery
	public List<Automovil> buscarPorPlacaNativeQuery(String placa);
	public List<Automovil> buscarPorDuenioNativeQuery(String duenio);
	public List<Automovil> buscarPorMarcaNativeQuery(String marca);
	//Named Query
	public List<Automovil> buscarPorColorNamedQuery(String color);
	public List<Automovil> buscarPorPlacaNamedQuery(String placa);
	public List<Automovil> buscarPorMarcaNamedQuery(String marca);
	
}
