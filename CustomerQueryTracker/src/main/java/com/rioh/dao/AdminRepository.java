package com.rioh.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rioh.model.Admin;
@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer>
{

}
