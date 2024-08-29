package com.example.vingadores.repository;

import com.example.vingadores.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlanetaRepository extends JpaRepository<Planeta, Long> {


    @Query(value = "select p from Planeta p where p.nomePlaneta = nomePlaneta")
    Planeta findByNomePlaneta(@Param("nomePlaneta") String planeta);
}
