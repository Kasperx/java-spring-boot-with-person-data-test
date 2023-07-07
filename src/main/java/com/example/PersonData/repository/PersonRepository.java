package com.example.PersonData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PersonData.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	// This will be AUTO IMPLEMENTED by Spring into a Bean
}
