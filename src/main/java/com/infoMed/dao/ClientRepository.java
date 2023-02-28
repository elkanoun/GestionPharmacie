package com.infoMed.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<com.infoMed.entities.Client, Long> {

}
