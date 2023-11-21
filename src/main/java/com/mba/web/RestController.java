package com.mba.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mba.dto.EtudiantRequestDTO;
import com.mba.dto.EtudiantResponseDTO;
import com.mba.services.EtudiantServiceInterface;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
public class RestController {
	@Autowired
	EtudiantServiceInterface etudiantServiceInterface;
	
	
	@GetMapping("/etudiants")
	public List<EtudiantResponseDTO> getAll() {
		return etudiantServiceInterface.getAll();
	}
	@GetMapping("/etudiants/{id}")
	public EtudiantResponseDTO getOne(@PathVariable("id") Integer id) {
		return etudiantServiceInterface.getOne(id);
	}
	
	@PostMapping("/etudiants")
	public void save(@RequestBody EtudiantRequestDTO er) {
		etudiantServiceInterface.post(er);
	}
	
	
	@DeleteMapping("/etudiants/{id}")
	public void delete(@PathVariable Integer id) {
		etudiantServiceInterface.delete(id);
	}
	@PutMapping("/etudiants/{id}")
	public void update(@RequestBody EtudiantRequestDTO er,@PathVariable Integer id) {
		etudiantServiceInterface.update(er, id);
	}

}
