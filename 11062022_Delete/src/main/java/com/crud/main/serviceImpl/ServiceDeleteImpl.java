package com.crud.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.main.repository.RepositoryDelete;
import com.crud.main.service.ServiceDelete;

@Service
public class ServiceDeleteImpl implements ServiceDelete
{
	@Autowired
	private RepositoryDelete rd;
	@Override
	public void delete(int id) {
		rd.deleteById(id);
	}

}
