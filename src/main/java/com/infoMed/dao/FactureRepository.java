package com.infoMed.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoMed.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {

}
