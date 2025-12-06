package com.example.shop.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.shop.model.*;

public interface IShoes extends CrudRepository<Shoes, Long>{

}
