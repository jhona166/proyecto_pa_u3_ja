package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionService {
	public List<Habitacion> buscarHotelOuterRightJoin();
	public List<Habitacion> buscarHotelOuterLeftJoin();
	public List<Habitacion> buscarHotelOuterFullOuterJoin();
}
