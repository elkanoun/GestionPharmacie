package com.infoMed.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infoMed.entities.SousFamille;

public interface SousFamilleRepository extends JpaRepository<SousFamille, Long> {
    @Query("select sf from SousFamille sf where sf.libelle like :x")
	public Page<SousFamille> consulterSousFamillesAvecMotCle(@Param("x")String motCle, Pageable pageable);
    @Query("select sf from SousFamille sf where sf.famille.libelle like :x")
	public Page<SousFamille> sousFamillesDeFamille(@Param("x")String motCle, Pageable pageable);
    @Query("select sf from SousFamille sf where sf.famille.code like :x")
	public List<SousFamille> sousFamillesDeFamille(@Param("x")Long code);
    @Query("select sf from SousFamille sf where sf.code like :x")
	public SousFamille findOneSousFamilleAvecId(@Param("x")Long code);
    @Query("select sf from SousFamille sf where sf.libelle like :x")
	public SousFamille findOneSousFamilleAvecLib(@Param("x")String libelle);

}
