package com.gestion.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@RequestMapping("/api/user")
	public Principal user(Principal user)
	{
		System.out.println("user ****"+user.getName()+" "+user.toString());
		return user;
	}

}
 