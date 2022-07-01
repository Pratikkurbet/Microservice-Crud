package com.crud.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.main.model.Employee;
import com.crud.main.repository.RepositoryUpdate;
import com.crud.main.service.ServiceUpdate;

@Service
public class ServiceUpdateImpl implements ServiceUpdate
{
	@Autowired
	private RepositoryUpdate ru;
	@Override
	public Employee getEmpbyId(int id) {
		return ru.findById(id);
	}

	@Override
	public Employee saveEmp(Employee e) {
		return ru.save(e);
	}

}
