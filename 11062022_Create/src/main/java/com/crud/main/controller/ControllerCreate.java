package com.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.main.model.Employee;
import com.crud.main.service.ServiceCreate;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/c")
public class ControllerCreate 
{
	@Autowired
	private ServiceCreate sc;
	
	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		System.out.println("Employee added");
		return sc.saveEmp(emp);
	}
}
