package com.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.main.service.ServiceDelete;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/d")
public class ControllerDelete 
{
	@Autowired
	private ServiceDelete sd;
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmp(@PathVariable("id")int id)
	{
		sd.delete(id);
	}
}
