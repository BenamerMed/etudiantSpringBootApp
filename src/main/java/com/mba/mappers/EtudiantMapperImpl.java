package com.mba.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.mba.dto.EtudiantRequestDTO;
import com.mba.dto.EtudiantResponseDTO;
import com.mba.entities.Etudiant;
@Component
public class EtudiantMapperImpl implements EtudiantInterfaceMapper{

	@Override
	public Etudiant etudiantRequestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO) {
		// TODO Auto-generated method stub
		
		Etudiant e= new Etudiant();
		e.setNom(etudiantRequestDTO.getNom());
		e.setPrenom(etudiantRequestDTO.getPrenom());
		e.setEmail(etudiantRequestDTO.getEmail());
		return e;
	}

	@Override
	public EtudiantResponseDTO etudiant2EtudiantResponseDTO(Etudiant etudiant) {
		EtudiantResponseDTO er= new EtudiantResponseDTO();
		BeanUtils.copyProperties(etudiant, er);
		return er;
	}

}
