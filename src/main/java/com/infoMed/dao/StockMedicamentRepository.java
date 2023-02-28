package com.infoMed.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infoMed.entities.StockMedicament;

public interface StockMedicamentRepository extends JpaRepository<StockMedicament, Long> {
	
	@Query("select sm from StockMedicament sm where sm.pk.medicament.libelle like :x")
	public Page<StockMedicament> consulterMedicament(@Param("x")String motCle, Pageable pageable);
	
	//    @Query("select sm from stockMedicament sm where sm.pk.stock.libelle like :x")
	//	public List<StockMedicament> searchStocksMedicByNomStock(@Param("x")String nom);
	
	@Query("select sm from StockMedicament sm where sm.pk.medicament.libelle like :x")
	public StockMedicament consulterStocksMedicLibMedic(@Param("x")String libMedic);
	
	@Query("select sm from StockMedicament sm where sm.pk.medicament.code like :x and sm.pk.stock.id like :y") 
	public StockMedicament searchStockMedic(@Param("x")Long codeMedic, @Param("y")Long codeStock);
	 
	 

	
	

}
