package com.jpa.escola.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.escola.entity.Turma;
import com.jpa.escola.repository.TurmaRepository;
import com.jpa.escola.service.TurmaService;

@Service
public class TurmaServiceImpl implements TurmaService{
		
	@Autowired
	TurmaRepository repository;

	@Override
	public Turma insertOrUpdate(Turma entity) {
		Turma rt = this.repository.save(entity);
		return rt;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public Turma getById(int id) {
		Turma rt = repository.findById(id).orElse(null);
		return rt;
	}

	@Override
	public List<Turma> getAll() {
		return (List<Turma>) this.repository.findAll();
	}
	
}
