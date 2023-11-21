package com.mba.services;

import java.util.List;

import com.mba.dto.EtudiantRequestDTO;
import com.mba.dto.EtudiantResponseDTO;

public interface EtudiantServiceInterface {

	public List<EtudiantResponseDTO> getAll();
	public EtudiantResponseDTO getOne(Integer id);
	
	public void post(EtudiantRequestDTO etudiantRequestDTO);
	
	public void update(EtudiantRequestDTO etudiantRequestDTO,Integer id);
	
	public void delete(Integer id);
	
}
