package com.gestion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.entites.Produit;

@Service
public class ProduitMockServiceImpl  implements IProduitService{

	private List<Produit> produits;
	
	public ProduitMockServiceImpl() {
		// TODO Auto-generated constructor stub
		this.produits = new ArrayList<Produit>() ;
		this.produits.add(new Produit("Livre", 50, 20.5f));
		this.produits.add(new Produit("Cahier", 270, 70.5f));
		this.produits.add(new Produit("Stylo", 290, 158.0f));
	}
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return this.produits;
	}

	@Override
	public void addProduit(Produit produit) {
		// TODO Auto-generated method stub
		System.out.print(" ajout du produit de ref : "+produit.getRef());
		this.produits.add(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		// TODO Auto-generated method stub
		System.out.print(" mise a jour du produit de ref : "+produit.getRef());
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		System.out.print(" suppression du produit de ref : "+id);
		Produit produit = new Produit();
		produit.setId(id);;
		this.produits.remove(produit);
	}

}
