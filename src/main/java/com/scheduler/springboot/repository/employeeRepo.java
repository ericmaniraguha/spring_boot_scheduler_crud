package com.scheduler.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scheduler.springboot.entity.employee;

@Repository
public interface employeeRepo extends JpaRepository<employee, Integer>{

}
