package com.elite.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formation extends AuditModel {
@Column(nullable = false,unique = true)
private String titre;
@Lob
@Column(length = 500)
private String description;

private double prix;
@Column(nullable = false)
private int duree;
@Column(nullable = false)
private String formateur;
}
