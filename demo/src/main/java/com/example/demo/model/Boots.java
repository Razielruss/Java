package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Boots {

	@Id 
	private Long id;
	
	@Column
	private String image;
	
	@Column
	private String titel;
	
	@Column
	private double price;
	
	public Boots(Long id, String image, String titel, double price) {
		
		this.id = id;
		this.image = image;
		this.titel = titel;
		this.price = price;
		
	}
	
	public Long getId() {return id;}
	
	public String getImage() {return image;}
	
	public String getTitel() {return titel;}
	
	public double getPrice() {return price;}
	
	
	public void setId(Long id) {this.id = id;}
	
	public void setImage(String image) {this.image= image ;}
	
	public void setTitel(String titel) {this.titel= titel ;}
	
	public void setPrice(double price) {this.price = price;}
	
	
	
	
}
