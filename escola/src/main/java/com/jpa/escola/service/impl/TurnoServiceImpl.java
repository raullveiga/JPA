package com.jpa.escola.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.escola.entity.Turno;
import com.jpa.escola.repository.TurnoRepository;
import com.jpa.escola.service.TurnoService;

@Service
public class TurnoServiceImpl implements TurnoService {
	
	@Autowired
	private TurnoRepository repository;
	
	@Override
	public Turno insertOrUpdate(Turno entity) {
		Turno rt = this.repository.save(entity);
		return rt;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public Turno getById(int id) {
		Turno rt = this.repository.findById(id).orElse(null);
		return rt;
	}

	@Override
	public List<Turno> getAll() {
		
		return (List<Turno>) this.repository.findAll();
	}
	
	
	
	
}
