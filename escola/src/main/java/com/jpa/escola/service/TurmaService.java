package com.jpa.escola.service;

import java.util.List;

import com.jpa.escola.entity.Turma;

public interface TurmaService {

	Turma insertOrUpdate(Turma entity);

	void delete(int id);

	Turma getById(int id);

	List<Turma> getAll();

}
