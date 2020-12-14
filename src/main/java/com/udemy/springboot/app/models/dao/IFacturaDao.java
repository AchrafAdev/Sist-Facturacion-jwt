package com.udemy.springboot.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.udemy.springboot.app.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

	@Query("Select f from Factura f join fetch f.cliente c join fetch f.items l join fetch l.producto where f.id=?1")
	public Factura fetchByIdWithClienteWithItemFacturaWithProducto(Long id);
}
