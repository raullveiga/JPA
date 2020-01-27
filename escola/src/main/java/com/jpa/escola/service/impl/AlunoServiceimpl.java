package com.jpa.escola.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.escola.entity.Aluno;
import com.jpa.escola.repository.AlunoRepository;
import com.jpa.escola.service.AlunoService;

@Service
public class AlunoServiceimpl implements AlunoService{
	
	@Autowired
	AlunoRepository repository;
	
	@Override
	public Aluno insertOrUpdate(Aluno entity) {
		Aluno rt = this.repository.save(entity);
		return rt;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public Aluno getById(int id) {
		Aluno rt = this.repository.findById(id).orElse(null);
		return rt;
	}

	@Override
	public List<Aluno> getAll() {
		return (List<Aluno>) this.repository.findAll();
	}

}
