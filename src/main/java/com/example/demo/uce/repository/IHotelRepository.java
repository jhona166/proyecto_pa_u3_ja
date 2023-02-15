package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelRepository {
	public void insertar(Hotel hotel);
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterFullOuterJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelOuterRightJoin();
	public List<Hotel> buscarHotelOuterLeftJoin();
	public List<Hotel> buscarHotelOuterFullOuterJoin();

	
	
}
