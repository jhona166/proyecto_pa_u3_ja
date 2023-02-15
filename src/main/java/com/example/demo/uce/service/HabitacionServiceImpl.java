package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.repository.IEstudianteRepo;
import com.example.demo.uce.repository.IHabitacionRepository;


@Service
public class HabitacionServiceImpl implements IHabitacionService{
	@Autowired
	private IHabitacionRepository iHabitacionRepository;
	@Override
	public List<Habitacion> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepository.buscarHotelOuterRightJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepository.buscarHotelOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOuterFullOuterJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepository.buscarHotelOuterFullOuterJoin();
	}

	

}
