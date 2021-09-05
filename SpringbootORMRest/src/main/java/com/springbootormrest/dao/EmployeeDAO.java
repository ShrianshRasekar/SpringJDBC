package com.springbootormrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootormrest.pojo.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{

}
