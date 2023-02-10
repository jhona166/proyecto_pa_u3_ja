package com.example.demo.uce.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class AutomovilRepoImpl implements IAutomovilRepo{
	@PersistenceContext
	private EntityManager entityManager;
	//TypedQuery
	//NamedQuery
	//Native Query
	//Named Native Query

	
	
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

	
	//TypedQuery  modelo
	@Override
	public List<Automovil> buscarPorModeloTypedQuery(String modelo) {
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select e from Automovil e where e.modelo=:datoModelo",Automovil.class);
		myTypedQuery.setParameter("datoModelo", modelo);
		return myTypedQuery.getResultList();
		
	}


	@Override
	public List<Automovil> buscarPorMotorTypedQuery(String motor) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select e from Automovil e where e.motor=:datoMotor",Automovil.class);
		myTypedQuery.setParameter("datoMotor", motor);
		return myTypedQuery.getResultList();
	}


	@Override
	public List<Automovil> buscarPorColorloTypedQuery(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select e from Automovil e where e.color=:datoColor",Automovil.class);
		myTypedQuery.setParameter("datoColor", color);
		return myTypedQuery.getResultList();
	}


	@Override
	public List<Automovil> buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from Automovil where auto_placa = :datoPlaca",Automovil.class);//Sentencia SQL
		myQuery.setParameter("datoPlaca", placa);
		return myQuery.getResultList();
		
	}


	@Override
	public List<Automovil> buscarPorDuenioNativeQuery(String duenio) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from Automovil where auto_dueño = :datoDueño",Automovil.class);//Sentencia SQL
		myQuery.setParameter("datoDueño", duenio);
		return myQuery.getResultList();
	}


	@Override
	public List<Automovil> buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from Automovil where auto_marca = :datoMarca",Automovil.class);//Sentencia SQL
		myQuery.setParameter("datoMarca", marca);
		return myQuery.getResultList();
	}


	@Override
	public List<Automovil> buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorColor");
		myQuery.setParameter("datoColor", color);
		return myQuery.getResultList();
	}


	@Override
	public List<Automovil> buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlaca");
		myQuery.setParameter("datoPlaca", placa);
		return myQuery.getResultList();
	}


	@Override
	public List<Automovil> buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarca");
		myQuery.setParameter("datoMarca", marca);
		return myQuery.getResultList();
	}



	
	
	
	

}
