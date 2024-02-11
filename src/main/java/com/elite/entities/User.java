package com.elite.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User extends AuditModel {
	@Column(nullable = false)
	private String nom,prenom;
	@Column(unique = true,nullable = false)
	
	private String email;
	private String password;
	private int age;

}
