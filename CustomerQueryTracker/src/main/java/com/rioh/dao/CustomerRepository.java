package com.rioh.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rioh.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>
{

}
