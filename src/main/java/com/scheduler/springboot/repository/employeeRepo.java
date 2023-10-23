package com.scheduler.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.scheduler.springboot.entity.Employee;

import jakarta.transaction.Transactional;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
//	3. Update operation
//	======================================================
	@Modifying
	@Transactional
	@Query(value = "update Employee e set e.name = 'JPA' where e.id = :id", nativeQuery = true)
	
	void updateEmployee(int id);
	


}
