package com.jpa.escola.service;

import java.util.List;

import com.jpa.escola.entity.Turno;

public interface TurnoService {
	
	Turno insertOrUpdate(Turno entity);
	
	void delete(int id);
	
	Turno getById(int id);
	
	List<Turno> getAll();
	
}
