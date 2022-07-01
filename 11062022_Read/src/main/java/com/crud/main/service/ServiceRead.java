package com.crud.main.service;

import java.util.List;

import com.crud.main.model.Employee;

public interface ServiceRead 
{

	List<Employee> findAllEmployee();

	Employee getEmpbyId(int id);

}
