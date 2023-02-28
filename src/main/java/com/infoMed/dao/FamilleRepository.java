package com.infoMed.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infoMed.entities.Famille;

public interface FamilleRepository extends JpaRepository<Famille, Long> {
	@Query("select f from Famille f where f.libelle like :x")
	public Page<Famille> consulterFamillesAvecMotCle(@Param("x")String motCle, Pageable pageable);
    @Query("select f from Famille f where f.code like :x")
	public Famille findOne(@Param("x")Long code);
    @Query("select f from Famille f where f.libelle like :x")
	public Famille findOneAvecLibelle(@Param("x")String libelle);

}
