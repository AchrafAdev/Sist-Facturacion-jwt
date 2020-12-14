package com.udemy.springboot.app.view.json;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.udemy.springboot.app.models.entity.Cliente;

@SuppressWarnings("unchecked")
@Component("listar.json")
public class ClienteListJsonView extends MappingJackson2JsonView {

	@Override
	protected Object filterModel(Map<String, Object> model) {
		
		model.remove("titulo");
		model.remove("page");
		
		List<Cliente> clientes = (List<Cliente>) model.get("clientes");
		model.remove("clientes");
		
		model.put("clientes", clientes);
		
		//setPrettyPrint(true);
			
		return super.filterModel(model);
	}

	@Override
	public void setPrettyPrint(boolean prettyPrint) {
		super.setPrettyPrint(prettyPrint);
	}
	
	

}
