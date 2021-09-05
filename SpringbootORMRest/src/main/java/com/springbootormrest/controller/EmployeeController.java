package com.springbootormrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootormrest.pojo.Employee;
import com.springbootormrest.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeetemplate;
	
	@GetMapping("/home")
	public String empHome() {
		return "homecoming";
	}
	
	@GetMapping("/employees")
	public List<Employee> getemployees(){
		return employeetemplate.getEmployees();
	}
	
	@GetMapping("/employee/{eid}")
	public Employee getemployee(@PathVariable Long eid){
		return employeetemplate.getEmployee(eid);
	}
	
	@PostMapping("/addemp")
	public Employee addemployee(@RequestBody Employee emp){
		return employeetemplate.addEmployee(emp);
	}
		
	@PostMapping("/addemps")
	public List<Employee> addemployees(@RequestBody List<Employee> ls){
		return employeetemplate.addEmployees(ls);
	}
	
	@PutMapping("/updateemp")
	public Employee updateemployee(@RequestBody Employee emp){
		return employeetemplate.updateEmployee(emp);
	}
	
	@DeleteMapping("/employee/{eid}")
	public String deleteemployee(@PathVariable Long eid){
		return employeetemplate.deleteEmployee(eid);
	}

}
