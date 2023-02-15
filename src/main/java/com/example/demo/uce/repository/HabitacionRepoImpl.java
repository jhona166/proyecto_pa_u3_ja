package com.example.demo.uce.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepository{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery(
				"SELECT ha FROM Hotel h RIGHT JOIN h.habitaciones ha",Habitacion.class); //Puede ir el Join o InnerJoin
List<Habitacion> lista = myQuery.getResultList();


		
		return lista;
	}

	@Override
	public List<Habitacion> buscarHotelOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery(
				"SELECT ha FROM Hotel h LEFT JOIN h.habitaciones ha",Habitacion.class); //Puede ir el Join o InnerJoin
List<Habitacion> lista = myQuery.getResultList();


		
		return lista;
	}

	@Override
	public List<Habitacion> buscarHotelOuterFullOuterJoin() {
		// TODO Auto-generated method stub
		return null;
	}

}
