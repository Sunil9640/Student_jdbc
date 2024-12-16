package com.project.DaoLayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.app.model.Student;

@Repository
public class StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
    
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Student obj) {
		
		System.out.println(obj + " inside dao layer");
		
		String sql= "insert into studentrep (sid, name , department) values (?,?,? )";
		
	int num=	jdbcTemplate.update(sql,obj.getSid(),obj.getName(),obj.getDepartment());
	
	System.out.println(num + " rows effected");

	}
	
	
	public List<Student> findAll() {

		List<Student> stude = new ArrayList<>();

		return stude;
	}

	public void demoTest(Student obj) {
		// TODO Auto-generated method stub
		
		System.out.println(obj + " inside the dao layer");
		
	}

}
