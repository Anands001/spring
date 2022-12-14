package com.sam.crud.CrudService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.crud.CrudEntity.Employee;
import com.sam.crud.CrudRepo.CrudDbmanage;

@Service
public class CrudServiceLayer 
{
	@Autowired
	private CrudDbmanage crudDbmanage;
	
	public void Store(Employee emp)
	{		
		crudDbmanage.save(emp);
	}
	public List<Employee> displayEmp()
	{
		return crudDbmanage.findAll();
		
	}
	public void del(Long id)
	{
		crudDbmanage.deleteById(id);
	}
}
