package com.example.demo.uce.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class HotelrepositoryImpl implements IHotelRepository{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		//SELECT h.hote_nombre, ha.habi_numero FROM hotel h INNER JOIN habitacion ha on h.hote_id=ha.habi_id_hotel
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo",Hotel.class); //Puede ir el Join o InnerJoin
		myQuery.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> listaHoteles = myQuery.getResultList();
		
		//BAjo demanda
		for (Hotel h : listaHoteles) {
		List<Habitacion> listaTemp = new ArrayList<>();
		for(Habitacion ha:h.getHabitaciones())
		if(ha.getTipo().equals(tipoHabitacion)) {
			listaTemp.add(ha);
		}
		h.setHabitaciones(listaTemp);
		}
		
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOuterJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo",Hotel.class); //Puede ir el Join o InnerJoin
		myQuery.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> listaHoteles = myQuery.getResultList();
		
		//BAjo demanda
//		for (Hotel h : listaHoteles) {
//			h.getHabitaciones().size();
//		}
	return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha WHERE ha.tipo=:datoTipo",Hotel.class); //Puede ir el Join o InnerJoin
		myQuery.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> listaHoteles = myQuery.getResultList();
		
		//BAjo demanda
		for (Hotel h : listaHoteles) {
			h.getHabitaciones().size();
		}
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterFullOuterJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}
	

}
