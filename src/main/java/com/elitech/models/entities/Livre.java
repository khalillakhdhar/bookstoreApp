package com.elitech.models.entities;

import java.util.List;

import com.elitech.models.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Livre extends BaseEntity {
private String titre;
private String description;
private double prix;
private String photo;
@ManyToMany(mappedBy = "livres")
private List<Utilisateur> utilisateur;
}
