package com.mba.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class EtudiantRequestDTO {
	private String nom;
	private String prenom;
	private String email;
}
