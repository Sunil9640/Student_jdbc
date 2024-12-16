package com.project.app.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
	
	private int sid;
	
	private String name;
	
	private String department;


	
	
	
	
	

}
