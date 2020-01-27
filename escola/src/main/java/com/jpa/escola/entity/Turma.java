package com.jpa.escola.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTurma;
	
	private String nome;
	
	private String descricao;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Turno idTurno;
	
	@Transient
	public int turnoId;
	
	

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Turno getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Turno idTurno) {
		this.idTurno = idTurno;
	} 
	
	
}
