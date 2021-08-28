package com.spring.jdbc.dao;

import com.spring.jdbc.entity.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(int sid);
	
	/*
	 * default void shows() { System.out.println("default"); }
	 */
	}
