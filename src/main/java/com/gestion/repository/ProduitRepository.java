package com.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.entites.Produit;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Long>{

}
