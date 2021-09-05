package com.springbootormrest.service;

import java.util.List;

import com.springbootormrest.pojo.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();

	public Employee getEmployee(Long eid);

	public Employee addEmployee(Employee emp);

	public List<Employee> addEmployees(List<Employee> ls);

	public String deleteEmployee(Long eid);

	public Employee updateEmployee(Employee emp);

	//

}
