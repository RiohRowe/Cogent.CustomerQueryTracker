package com.rioh.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rioh.dao.EmployeeRepository;
import com.rioh.model.Employee;

@Service
public class EmployeeService
{
	@Autowired
	private EmployeeRepository empR;
	
	//Create
	public void insertEmployee(Employee e)
	{
		e = empR.save(e);
	}
	
	//Read
	public ArrayList<Employee> getAllEmployees()
	{
		return (ArrayList<Employee>) empR.findAll();
	}
	
	//Update
	public void updateEmployee(Employee e)
	{
		empR.save(e);
	}
	
	//Delete
	
	
}
