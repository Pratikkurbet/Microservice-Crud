package com.crud.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.main.model.Employee;
import com.crud.main.repository.RepositoryRead;
import com.crud.main.service.ServiceRead;

@Service
public class ServiceReadImpl implements ServiceRead
{
	@Autowired 
	private RepositoryRead rr;

	@Override
	public List<Employee> findAllEmployee() {
		return (List<Employee>)rr.findAll();
	}

	@Override
	public Employee getEmpbyId(int id) {
		return rr.findById(id);
	}
	
}
