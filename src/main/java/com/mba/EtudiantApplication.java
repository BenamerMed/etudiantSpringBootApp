package com.mba;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mba.entities.Etudiant;
import com.mba.repositories.EtudiantRepository;

@SpringBootApplication

public class EtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}

	
	@Bean
	CommandLineRunner start (EtudiantRepository etudiantRepository) {
		return args->{
			for(int i=0;i<10;i++) {
				Etudiant e=Etudiant.builder()
						.nom("Nom"+(i+1))
						.prenom("Prenom"+(i+1))
						.email("Nom"+(i+1)+".Prenom"+(i+1)+"@um5.ac.ma")
						.build();
				etudiantRepository.save(e);
			}
			List<Etudiant> etudiants=etudiantRepository.findAll();
			System.out.println("-------------------------------------------------");
			System.out.println("id---------Nom---------Prenom---------Email");
			for(Etudiant e:etudiants) {
				System.out.println(e.getIdEtudiant()+"----------"+e.getNom()+"--------"+e.getPrenom()+"--------"+e.getEmail());	
			}
			System.out.println("-------------------------------------------------");
			
		};
	}
	
	
}
