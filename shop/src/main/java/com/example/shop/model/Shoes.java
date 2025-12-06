package com.example.shop.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Shoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shoesID;
	
	@Column
	private String name;
	
	@Column
	private double price;
	
	@Column
	private String type;
	
	public Shoes() {}
	
	public Shoes(String name, String type, double price) {
		
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public Long getUuId() { return shoesID;}
	
	public String getName() {return name;} 
	
	public double getPrice() {return price;}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setDescription(String description) {
		this.type = description;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
