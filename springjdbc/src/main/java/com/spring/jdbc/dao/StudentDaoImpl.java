package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// insert query
		String query = "insert into student values(?,?,?)";

		int result = this.jdbcTemplate.update(query, student.getSid(), student.getSname(), student.getScity());

		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Student student) {
		String query = "update student set name=?,city=? where id=?";

		int result = this.jdbcTemplate.update(query, student.getSname(), student.getScity(), student.getSid());

		return result;
	}

	@Override
	public int delete(int sid) {
		String query = "delete from student where id=?";

		int result = this.jdbcTemplate.update(query,  sid);

		return result;
	}

	
	/*
	 * public void show() { System.out.println("class"); }
	 */

}
