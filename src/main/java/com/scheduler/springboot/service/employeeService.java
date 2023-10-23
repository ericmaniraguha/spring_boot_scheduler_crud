package com.scheduler.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.scheduler.springboot.entity.Employee;
import com.scheduler.springboot.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
    
	@Scheduled(fixedRate = 4000)
	public void CrudScheduler() {
		
		System.out.println("Scheduler running.....");
//		insert data in the databases
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setName("Spring");
//		employee.setCity("Rubavu");
//		
//		employeeRepo.save(employee);
		
//		Read method
		List<Employee> employee = employeeRepo.findAll();
		for(Employee e: employee) {
			System.out.println(e);
		}
	}
}
