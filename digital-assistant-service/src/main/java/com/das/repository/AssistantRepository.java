package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.das.entity.Assistant;

//JpaRepository provides CRUD operations for the Assistant entity
public interface AssistantRepository extends JpaRepository<Assistant, Long> {
    // Method to find the assistant by name
	Assistant findByName(String name);
}
