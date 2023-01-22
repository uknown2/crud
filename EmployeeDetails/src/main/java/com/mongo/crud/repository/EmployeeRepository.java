package com.mongo.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.crud.model.EmployeeModel;

public interface EmployeeRepository extends MongoRepository<EmployeeModel, Integer>{

}
