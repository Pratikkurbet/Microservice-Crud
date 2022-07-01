package com.crud.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.main.model.Employee;
import com.crud.main.service.ServiceRead;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/r")
public class ControllerRead
{
	@Autowired
	private ServiceRead sr;
	
	@GetMapping("/list")
	public List<Employee> getAllList()
	{
		return sr.findAllEmployee();
	}
	
	@GetMapping("/singleEmp/{id}")
	public Employee getEmployee(@PathVariable("id") int id)
	{
		return sr.getEmpbyId(id);
	}
	
}
