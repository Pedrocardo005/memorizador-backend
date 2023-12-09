package com.memorizador.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.memorizador.app.model.Termo;

@Repository
public interface TermoRepository extends JpaRepository<Termo, Integer> {
    
    @Query(value = "SELECT * FROM termo WHERE unidade = :unidade ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Optional<Termo> findRandomTermoWithUnityValue(Integer unidade);
}
