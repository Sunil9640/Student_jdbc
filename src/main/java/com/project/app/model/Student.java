package com.project.app.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//pojo class

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Component
public class Student {
	
	private int sid;
	
	private String name;
	
	private String department;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String name, String department) {
		super();
		this.sid = sid;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, name, sid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name) && sid == other.sid;
	}
	
	


	
	
	
	
	

}
