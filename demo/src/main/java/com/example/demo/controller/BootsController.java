package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.*;

@RestController
public class BootsController {

	
	private BootsRepository bootsRepository;
	
	public BootsController( BootsRepository bootsRepository) {
		this.bootsRepository = bootsRepository;
	}
	
	
	@GetMapping("/")
	public String test(){
		return "works";
	}
	
}
