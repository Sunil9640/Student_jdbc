package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.DaoLayer.StudentDao;
import com.project.app.model.Student;

import lombok.Data;

@Service
@Scope("prototype")
public class Stud_Service {
    
	@Autowired
	private StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(StudentDao dao) {
		System.out.println(dao);
		this.dao = dao;
	}

	public void StudentSave(Student obj) {
		System.out.println(" inside Service class" + obj);
		dao.demoTest(obj);

	}
	
	

	public List<Student> getAllStudents() {

		return dao.findAll();
	}

}
