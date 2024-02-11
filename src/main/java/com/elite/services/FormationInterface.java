package com.elite.services;

import java.util.List;

import com.elite.entities.Formation;

public interface FormationInterface {
public List<Formation> findAll();
public Formation findOne(long id);
public Formation AddOne(Formation formation);
public void DeleteOne(long id);
public List<Formation> search(String titre,String description);

}
