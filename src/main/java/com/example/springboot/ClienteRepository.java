package com.example.springboot;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.models.ClienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, UUID> {
	
}