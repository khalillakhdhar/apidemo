package com.elite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elite.entities.Formation;
import com.elite.services.FormationInterface;

import jakarta.validation.constraints.Positive;

@RestController
@RequestMapping("formation")
public class FormationController {
@Autowired
FormationInterface formationInterface;
@GetMapping
public List<Formation> getAll()
{
return formationInterface.findAll();	
}
@GetMapping("/{id}")
public Formation getOne(@PathVariable long id)
{
return formationInterface.findOne(id);	
}
@PostMapping
public Formation addFormation(@RequestBody Formation formation)
{
return formationInterface.AddOne(formation);	
}
@DeleteMapping("/{id}")
public void deleteOne(@PathVariable long id)
{
formationInterface.DeleteOne(id);	
}
@GetMapping("/search")
public List<Formation> searchFormation(@RequestParam(required = false) String titre,@RequestParam(required = false) String description)
{
	return formationInterface.search(titre, description);
}
	
	
	

}
