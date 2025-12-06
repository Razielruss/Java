package com.example.shop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shop.model.*;
import com.example.shop.repository.*;

@RestController
public class ShoesController {

	private IShoes shoesRepository;
	
	public ShoesController(IShoes shoesRepository) {
		this.shoesRepository = shoesRepository;
	}
	
	@GetMapping("/getShoes")
	public Iterable<Shoes> getShoes() {
	
		return shoesRepository.findAll();
	}
	
}
