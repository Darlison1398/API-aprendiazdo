package com.example.aprendizado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aprendizado.model.Usuario_model;

@Repository
public interface Usuario_repository extends JpaRepository<Usuario_model, Long> {
    
}
