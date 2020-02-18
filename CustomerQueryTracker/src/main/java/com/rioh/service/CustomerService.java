package com.rioh.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rioh.dao.CustomerRepository;
import com.rioh.model.Customer;

@Service
public class CustomerService
{
	@Autowired
	private CustomerRepository custRep;
	
	//Create
	public void insertCustomer(Customer c)
	{
		c = custRep.save(c);
	}
	//Read
	public ArrayList<Customer> getAllCustomers()
	{
		return (ArrayList<Customer>) custRep.findAll();
	}
	
	//Update
	public void updateCustomer(Customer c)
	{
		custRep.save(c);
	}
	
	//Delete
	public void deleteCustomer(Customer c)
	{
		custRep.delete(c);
	}
}
