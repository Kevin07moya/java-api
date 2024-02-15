package com.prueba.crud.repository;

import com.prueba.crud.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
