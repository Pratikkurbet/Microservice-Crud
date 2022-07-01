package com.crud.main.service;

import com.crud.main.model.Employee;

public interface ServiceUpdate {

	Employee getEmpbyId(int id);

	Employee saveEmp(Employee e);

}
