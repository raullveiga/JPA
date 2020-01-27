package com.jpa.escola.service;

import java.util.List;

import com.jpa.escola.entity.Aluno;


public interface AlunoService {

	Aluno insertOrUpdate(Aluno entity);

	void delete(int id);

	Aluno getById(int id);

	List<Aluno> getAll();
}
