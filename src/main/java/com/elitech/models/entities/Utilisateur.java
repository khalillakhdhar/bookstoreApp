package com.elitech.models.entities;

import java.util.List;

import com.elitech.models.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Utilisateur extends BaseEntity {
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private String grade;
	private String telephone;
	@OneToOne(mappedBy = "utilisateur")
	private Adresse adresse;
	@ManyToMany(cascade = {
			CascadeType.PERSIST,CascadeType.MERGE
	})
	private List<Livre> livres;
}
