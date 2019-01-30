package com.gestion;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gestion.entites.Role;
import com.gestion.entites.User;
import com.gestion.repository.RoleRepository;
import com.gestion.repository.UserRepository;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
	   ConfigurableApplicationContext ctx =	SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
//	   ProduitRepository pr = ctx.getBean(ProduitRepository.class);
//	   pr.save(new Produit("Livre", 50, 20.5f));
//	   pr.save(new Produit("Cahier", 270, 70.5f));
//	   pr.save(new Produit("Stylo", 290, 158.0f));
	   
//	   RoleRepository rr = ctx.getBean(RoleRepository.class);
//	   Role roleUser = new Role("ROLE_USER");
//	   Role roleAdmin = new Role("ROLE_ADMIN");
//	   rr.save(roleAdmin);
//	   rr.save(roleUser) ;
//	   
//	   UserRepository ur = ctx.getBean(UserRepository.class);
//	   User alpha = new User("alpha", "alpha", true);
//	   User djeyna = new User("djeyna", "djeyna", false);
//	   User leuz = new User("leuz", "leuz", true);
//	   
//	   alpha.setRoles(Arrays.asList(roleUser, roleAdmin));
//	   leuz.setRoles(Arrays.asList(roleUser));
//	   
//	   ur.save(alpha);
//	   ur.save(djeyna);
//	   ur.save(leuz);
  
	   
	}

}

