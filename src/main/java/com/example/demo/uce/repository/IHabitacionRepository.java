package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionRepository {
	public List<Habitacion> buscarHotelOuterRightJoin();
	public List<Habitacion> buscarHotelOuterLeftJoin();
	public List<Habitacion> buscarHotelOuterFullOuterJoin();

}
