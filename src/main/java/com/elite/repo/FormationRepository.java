package com.elite.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
List<Formation> findByTitre(String titre);
List<Formation> findByDescription(String description);
List<Formation> findByTitreContainingAndDescriptionContaining(String titre,String description);
}
