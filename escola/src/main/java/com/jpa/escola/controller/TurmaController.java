package com.jpa.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jpa.escola.entity.Turma;
import com.jpa.escola.entity.Turno;
import com.jpa.escola.service.*;

@RestController
@CrossOrigin("*")
public class TurmaController {
	
	@Autowired
	TurmaService service;
	
	@Autowired
	TurnoService TurnoService;
	
	@GetMapping("/turma")
	public ResponseEntity<List<Turma>> getAll(){
		List<Turma> rt = this.service.getAll();
		return ResponseEntity.ok(rt);
	}
	
	@GetMapping("/turma/{id}")
	public ResponseEntity<Turma> getById(@PathVariable int id){
		Turma rt = this.service.getById(id);
		return ResponseEntity.ok(rt);
	}
	
	@PostMapping("/turma")
	public ResponseEntity<Turma> post(@RequestBody Turma turma){
		
//		turma.setIdTurno(this.TurnoService.getById(turma.getIdTurno().getIdTurno()));
//		Turma rt = this.service.insertOrUpdate(turma);
//		return ResponseEntity.ok(rt);
//		
		Turno turno = this.TurnoService.getById(turma.turnoId);
		
		turma.setIdTurno(turno);
		
		Turma rt = this.service.insertOrUpdate(turma);
		
		return ResponseEntity.ok(rt);
	}
	

}
