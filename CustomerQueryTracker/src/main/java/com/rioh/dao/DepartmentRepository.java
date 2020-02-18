package com.rioh.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rioh.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>
{

}
