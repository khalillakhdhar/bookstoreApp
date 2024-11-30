package com.elitech.models.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
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
public class Adresse {
@Id
private long id;

private String pays;
private String ville;
private String cite;
private int codePostale;
@MapsId
@OneToOne(cascade = CascadeType.ALL,optional = false)
@JoinColumn(name = "id")
private Utilisateur utilisateur;
}
