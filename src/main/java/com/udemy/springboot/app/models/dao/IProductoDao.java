package com.udemy.springboot.app.models.dao;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.udemy.springboot.app.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
	
	
	public List<Producto> findByNombreLikeIgnoreCase(String term);
	
	
	
	

}
