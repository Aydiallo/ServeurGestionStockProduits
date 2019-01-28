package com.gestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gestion.entites.Produit;
import com.gestion.repository.ProduitRepository;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
	   ConfigurableApplicationContext ctx =	SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
//	   ProduitRepository pr = ctx.getBean(ProduitRepository.class);
//	   pr.save(new Produit("Livre", 50, 20.5f));
//	   pr.save(new Produit("Cahier", 270, 70.5f));
//	   pr.save(new Produit("Stylo", 290, 158.0f));
	}

}

