package com.mba.mappers;

import com.mba.dto.EtudiantRequestDTO;
import com.mba.dto.EtudiantResponseDTO;
import com.mba.entities.Etudiant;

public interface EtudiantInterfaceMapper {
	public Etudiant etudiantRequestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO);
	public EtudiantResponseDTO etudiant2EtudiantResponseDTO(Etudiant etudiant);

}
