package com.rioh.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rioh.dao.DepartmentRepository;
import com.rioh.dao.EmployeeRepository;
import com.rioh.model.Employee;

@Service
public class EmployeeService
{
	@Autowired
	private EmployeeRepository empR;
	
	@Autowired
	private DepartmentRepository depR;
	
	//Create
	public Employee insertEmployee(Employee e)
	{
		e.setDep(depR.save(e.getDep()));
		return empR.save(e);
	}
	
	//Read
	public ArrayList<Employee> getAllEmployees()
	{
		return (ArrayList<Employee>) empR.findAll();
	}
	
	//Update
	public void updateEmployee(Employee e)
	{
		depR.save(e.getDep());
		empR.save(e);
	}
	
	//Delete
	public void deleteEmployee(Employee e)
	{
		empR.delete(e);
	}
	
}
