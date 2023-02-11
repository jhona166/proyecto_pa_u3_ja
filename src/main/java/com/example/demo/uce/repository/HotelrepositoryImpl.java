package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


public class HotelrepositoryImpl implements IHotelRepository{
	@PersistenceContext
	private EntityManager entityManager;
	

}
