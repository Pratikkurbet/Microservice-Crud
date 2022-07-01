package com.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.main.model.Employee;
import com.crud.main.service.ServiceUpdate;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/u")
public class ControllerUpdate {
	@Autowired
	private ServiceUpdate su;

	@PutMapping("/update")
	public Employee updateEmp(@RequestBody Employee emp) {
		Employee e = su.getEmpbyId(emp.getId());

		e.setEname(emp.getEname());
		e.setEmail(emp.getEmail());
		e.setMobile(emp.getMobile());
		e.setDesignation(emp.getDesignation());
		e.setUsername(emp.getUsername());
		e.setPassword(emp.getPassword());
		return su.saveEmp(e);
	}
}
