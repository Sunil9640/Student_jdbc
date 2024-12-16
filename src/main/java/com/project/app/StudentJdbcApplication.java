package com.project.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.project.app.model.Student;
import com.project.service.Stud_Service;

@SpringBootApplication
public class StudentJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StudentJdbcApplication.class, args);

		Student student = context.getBean(Student.class);

		student.setSid(20);
		student.setName("sunil");
		student.setDepartment("CSE");
		System.out.println(student);

		/*
		 * Stud_Service service = context.getBean(Stud_Service.class);
		 * service.StudentSave(student);
		 */

		Stud_Service service = new Stud_Service();
		service.StudentSave(student);

		/*
		 * List<Student> str = service.getAllStudents(); System.out.println(str);
		 */

	}

}
