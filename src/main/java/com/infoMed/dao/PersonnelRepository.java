package com.infoMed.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoMed.entities.Personnel;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {

}
