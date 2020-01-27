package com.jpa.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jpa.escola.entity.Turno;
import com.jpa.escola.service.TurnoService;

@CrossOrigin("*")
@RestController
public class TurnoController {
	
	@Autowired
	private TurnoService service;
	
	@GetMapping("/turno")
	public ResponseEntity<List<Turno>> getAll(){
		
		List<Turno> rt = this.service.getAll();
		
		return ResponseEntity.ok(rt);
	}
	
	@GetMapping("/turno/{id}")
	public ResponseEntity<Turno> getById(@PathVariable int id){
		
		Turno rt = this.service.getById(id);
		
		return ResponseEntity.ok(rt);
	}
	
	@PostMapping("/turno")
	public ResponseEntity<Turno> post(@RequestBody Turno turno){
		
		Turno rt = this.service.insertOrUpdate(turno);
		
		return ResponseEntity.ok(rt);
	}
	
	@PutMapping("/turno")
	public ResponseEntity<Turno> put(@RequestBody Turno turno){
		
		Turno rt = this.service.insertOrUpdate(turno);
	
		return ResponseEntity.ok(rt);
				
	}
	
	@DeleteMapping("/turno/{id}")
	public void delete(@PathVariable int id){
		
		this.service.delete(id);
		
	}
}


















