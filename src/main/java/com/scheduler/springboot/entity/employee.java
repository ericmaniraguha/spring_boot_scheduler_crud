package com.scheduler.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class employee {
     
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String city;
	
	
}
