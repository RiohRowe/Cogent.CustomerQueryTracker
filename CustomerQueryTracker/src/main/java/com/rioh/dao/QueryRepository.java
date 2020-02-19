package com.rioh.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rioh.model.Query;

@Repository
public interface QueryRepository extends CrudRepository<Query, Integer>
{

}
