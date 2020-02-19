package com.rioh.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rioh.model.Customer;
import com.rioh.model.Employee;
import com.rioh.service.CustomerService;
import com.rioh.service.EmployeeService;

// @Response body
// @Controller
@RestController // Handels conversion between objects and json
public class CQTController
{
	@Autowired
	private EmployeeService empServ;

	@Autowired
	private CustomerService custServ;

	// @GetMapping("/makeEmployee")//Get HTML FORM for creating employee
	// public ResponseEntity getCreateEmployeeForm()
	// {
	// return ResponseEntity<T>);
	// }

	// EMPLOYEE
	
	// Create
	@PostMapping("makeEmployee")
	public Employee createNewEmployee(@RequestBody Employee e)
	{
		return empServ.insertEmployee(e);
	}

	// Read
	@GetMapping("getAllEmployees")
	public ArrayList<Employee> ReadAllEmployees()
	{
		return empServ.getAllEmployees();
	}

	// Update
	@PutMapping("updateEmployee")
	public Employee updateEmployee(@RequestBody Employee e)
	{
		empServ.updateEmployee(e);
		return e;
	}

	// Delete
	@DeleteMapping("deleteEmployee")

	public void deleteEmployee(@RequestBody Employee e)
	{
		empServ.deleteEmployee(e);
	}

	// CUSTOMER
	// Create

	@PostMapping("makeCustomer")
	public Customer createNewCustomer(@RequestBody Customer e)
	{
		return custServ.insertCustomer(e);
	}

	// Read
	@GetMapping("getAllCustomers")
	public ArrayList<Customer> ReadAllCustomers()
	{
		return custServ.getAllCustomers();
	}

	// Update
	@PutMapping("updateCustomer")
	public Customer updateCustomer(@RequestBody Customer e)
	{
		custServ.updateCustomer(e);
		return e;
	}

	// Delete
	@DeleteMapping("deleteCustomer")

	public void deleteCustomer(@RequestBody Customer e)
	{
		custServ.deleteCustomer(e);
	}

}
