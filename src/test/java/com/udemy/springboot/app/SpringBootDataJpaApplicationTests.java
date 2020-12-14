package com.udemy.springboot.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udemy.springboot.app.models.entity.Cliente;
import com.udemy.springboot.app.models.service.IClienteService;

@SpringBootTest
class SpringBootDataJpaApplicationTests {

	
	@Autowired
	private IClienteService clienteService;


	@Test
	public void test_Equals(){
	
		Cliente cli1 = clienteService.findOne(1L);
		
		assertEquals("Achraf", cli1.getNombre());
		
	}
	
	

}
