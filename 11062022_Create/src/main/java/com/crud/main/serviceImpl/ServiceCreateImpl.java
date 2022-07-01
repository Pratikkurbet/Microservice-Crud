package com.crud.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.main.model.Employee;
import com.crud.main.repository.RepositoryCreate;
import com.crud.main.service.ServiceCreate;

@Service
public class ServiceCreateImpl implements ServiceCreate
{
	@Autowired
	private RepositoryCreate rc;

	@Override
	public Employee saveEmp(Employee emp) {
		return rc.save(emp);
	}
}
