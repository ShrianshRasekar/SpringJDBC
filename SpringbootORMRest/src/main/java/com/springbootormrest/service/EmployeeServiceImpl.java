package com.springbootormrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootormrest.dao.EmployeeDAO;
import com.springbootormrest.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeDAO employeedao;
	
	//List<Employee> l;
	public  EmployeeServiceImpl(){
		
		/*
		 * l=new ArrayList<Employee>(); l.add(new Employee(1, "John Wick", "Developer",
		 * 50, 50000.00, 200, 986436578, "johnwick@email.com"));
		 */
		
	}
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployee(Long eid) {
		// TODO Auto-generated method stub
		/*
		 * Employee e=null; for(Employee emp: l) { if(emp.getEid()==eid) { e=emp; } }
		 */
		return employeedao.getOne(eid);
	}

		
	@Override
	public Employee addEmployee(Employee emp) {
		//l.add(emp);
		employeedao.save(emp);
		return emp;
	}
	
	@Override
	public List<Employee> addEmployees(List<Employee> ls) {
		//l.addAll(ls);
		employeedao.saveAll(ls);
		return ls;
	}
	
	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeedao.save(emp);
		return emp;
	}
	
	@Override
	public String deleteEmployee(Long eid) {
		// TODO Auto-generated method stub
		//Employee e=employeedao.getById(eid);
		employeedao.deleteById(eid);
		return "Deleted employee with id "+eid;
	}
	
	
	

}
