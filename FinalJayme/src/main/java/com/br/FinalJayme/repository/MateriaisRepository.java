package com.br.FinalJayme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.FinalJayme.entities.Material;

@Repository
public interface MateriaisRepository extends JpaRepository<Material, Integer> {

}
