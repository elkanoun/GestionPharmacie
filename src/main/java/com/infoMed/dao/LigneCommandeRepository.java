package com.infoMed.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infoMed.entities.LigneCommande;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long> {
    @Query("select l from LigneCommande l where l.pk.commande.num like :x")
	List<LigneCommande> listLignesCommandesByNumCommande(@Param("x")Long num);
    @Query("select l from LigneCommande l where l.pk.medicament.libelle like :x order by l.pk.commande.date desc")
	Page<LigneCommande> listLignesCommandesByMedicament(@Param("x")String motCle, Pageable pageable);
    @Query("select l from LigneCommande l where l.pk.commande.num like :x and l.pk.medicament.code like :y")
	LigneCommande searchLigneCommandeByCmdAndMedic(@Param("x") Long numCmd, @Param("y") Long codeMedic);
    
    
    

}
