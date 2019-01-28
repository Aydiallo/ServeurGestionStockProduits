package com.gestion.service;

import java.util.List;

import com.gestion.entites.Produit;

public interface IProduitService {

	List<Produit> getProduits() ;
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit(Long id);
	
	
}
