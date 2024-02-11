package com.elite.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByNomOrPrenom(String nom,String prenom);
	User findByEmailAndPassword(String email,String password);
	List<User> findByAgeGreaterThanEqual(int age);

}
