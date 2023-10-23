package com.scheduler.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class employeeService {
    
	@Scheduled(fixedRate = 4000)
	public void CrudScheduler() {
		System.out.println("Scheduler running.....");
	}
}
