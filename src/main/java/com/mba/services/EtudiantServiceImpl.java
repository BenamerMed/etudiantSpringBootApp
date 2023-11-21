package com.mba.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mba.dto.EtudiantRequestDTO;
import com.mba.dto.EtudiantResponseDTO;
import com.mba.entities.Etudiant;
import com.mba.mappers.EtudiantInterfaceMapper;
import com.mba.repositories.EtudiantRepository;


@Service
public class EtudiantServiceImpl implements EtudiantServiceInterface{
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EtudiantInterfaceMapper etudiantInterfaceMapper;
	@Override
	public List<EtudiantResponseDTO> getAll() {
		// TODO Auto-generated method stub
		
		List<Etudiant> etudiants= new ArrayList<Etudiant>();
		etudiants=etudiantRepository.findAll();
		
		List <EtudiantResponseDTO> etudiantsResponse =new ArrayList<EtudiantResponseDTO>();
		for(Etudiant e:etudiants) {
			etudiantsResponse.add(etudiantInterfaceMapper.etudiant2EtudiantResponseDTO(e));
		}
		
		return etudiantsResponse;
	}

	@Override
	public EtudiantResponseDTO getOne(Integer id) {
		return (etudiantInterfaceMapper.etudiant2EtudiantResponseDTO(etudiantRepository.findById(id).get()));
	}

	@Override
	public void post(EtudiantRequestDTO etudiantRequestDTO) {
		// TODO Auto-generated method stub
		Etudiant e= new Etudiant();
		e=etudiantInterfaceMapper.etudiantRequestDTO2Etudiant(etudiantRequestDTO);
		etudiantRepository.save(e);
	}

	@Override
	public void update(EtudiantRequestDTO etudiantRequestDTO, Integer id) {
		Etudiant e=etudiantRepository.findById(id).get();
		if(etudiantRequestDTO.getNom()!=null) e.setNom(etudiantRequestDTO.getNom());
		if(etudiantRequestDTO.getPrenom()!=null) e.setPrenom(etudiantRequestDTO.getPrenom());
		if(etudiantRequestDTO.getEmail()!=null) e.setEmail(etudiantRequestDTO.getEmail());
		
		etudiantRepository.save(e);
	}

	@Override
	public void delete(Integer id) {
		etudiantRepository.deleteById(id);
		
	}

}
