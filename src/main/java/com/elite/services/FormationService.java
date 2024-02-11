package com.elite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elite.entities.Formation;
import com.elite.repo.FormationRepository;

@Service
public class FormationService implements FormationInterface {

	@Autowired
	FormationRepository formationRepository;
	
	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return formationRepository.findAll();
	}

	@Override
	public Formation findOne(long id) {
		// TODO Auto-generated method stub
		return formationRepository.findById(id).orElse(null);
	}

	@Override
	public Formation AddOne(Formation formation) {
		// TODO Auto-generated method stub
		return formationRepository.save(formation);
	}

	@Override
	public void DeleteOne(long id) {
		// TODO Auto-generated method stub
		formationRepository.deleteById(id);

	}

	@Override
	public List<Formation> search(String titre, String description) {
		// TODO Auto-generated method stub
		if(titre==null)
			return formationRepository.findByDescription(description);
		else if(description==null)
			return formationRepository.findByTitre(titre);
		else
		return formationRepository.findByTitreContainingAndDescriptionContaining(titre, description);
	}

}
