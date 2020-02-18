package com.rioh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rioh.model.Customer;
import com.rioh.model.Department;
import com.rioh.model.Employee;
import com.rioh.service.CustomerService;
import com.rioh.service.EmployeeService;

@RestController
public class CQTController
{
	@Autowired
	private EmployeeService empServ = new EmployeeService();

	@Autowired
	private CustomerService custServ = new CustomerService();
	
	//EMPLOYEE
		//Create
	@GetMapping("/makeEmployee")//Get HTML FORM for creating employee
	public ModelAndView getCreateEmployeeForm()
	{
		return new ModelAndView("newEmployee", "empObj", new Employee(new Department()));
	}

	@PostMapping("/makeEmployee")
	public void getNewEmployee(Employee e)
	{
		empServ.insertEmployee(e);
	}
	
	//CUSTOMER

	@GetMapping("/makeCustomer")//Get HTML FORM for creating customer
	public ModelAndView getCreateCustomerForm()
	{
		return new ModelAndView("newCustomer", "custObj", new Customer());
	}

	@PostMapping("/makeCustomer")
	public void getNewCustomer(Customer c)
	{
		custServ.insertCustomer(c);
	}
}
