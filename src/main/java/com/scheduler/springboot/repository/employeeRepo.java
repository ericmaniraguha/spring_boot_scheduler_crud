package com.scheduler.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scheduler.springboot.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
