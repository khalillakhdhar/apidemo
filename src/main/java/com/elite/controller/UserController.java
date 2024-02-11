package com.elite.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elite.entities.User;
import com.elite.repo.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
	final UserRepository userRepository;
// Dependency injection
	
	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	// CRUD BASIQUE
@GetMapping
public List<User> getAllUsers()
{
	return userRepository.findAll();
}
@GetMapping("/{id}")
public User getOneUser(@PathVariable long id)
{
	return userRepository.findById(id).orElse(null);
	
}

@PostMapping
public User addOneUser(@RequestBody User user)
{
return userRepository.save(user);	
}
@DeleteMapping("/{id}")
public void deleteOneUser(@PathVariable long id)
{
userRepository.deleteById(id);	
}
// Méthodes dérivés
@GetMapping("/search")
public List<User> getUserByNames(@RequestParam(required = false) String nom,@RequestParam(required = false) String prenom)
{
return userRepository.findByNomOrPrenom(nom, prenom);	
}
@GetMapping("/auth")
public User authentification(@RequestParam String email,@RequestParam String password)
{
return userRepository.findByEmailAndPassword(email, password);	
}
	

}
