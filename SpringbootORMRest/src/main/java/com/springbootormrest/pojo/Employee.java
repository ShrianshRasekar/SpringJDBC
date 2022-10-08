package com.springbootormrest.pojo;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;

@Entity(name="emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long eid;
	@NotNull
	private String ename;
	
	@NotNull
	private String job;
	
	@NotNull
	private long mgr;
	
	@NotNull
	private double esal;
	
	@NotNull
	private long deptno;
	
	@NotNull
	private long mobileno;
	
	@Autowired
	@Email(message = "Email is mandatory")
	@NotNull
	private String email;
	
	@OneToMany(mappedBy = "emp")
	private List<Address> empAddress;
	
	
	
	public Employee(long eid, @NotNull String ename, @NotNull String job, @NotNull long mgr, @NotNull double esal,
			@NotNull long deptno, @NotNull long mobileno, @Email(message = "Email is mandatory") @NotNull String email,
			List<Address> empAddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.esal = esal;
		this.deptno = deptno;
		this.mobileno = mobileno;
		this.email = email;
		this.empAddress = empAddress;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public long getMgr() {
		return mgr;
	}
	public void setMgr(long mgr) {
		this.mgr = mgr;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public long getDeptno() {
		return deptno;
	}
	public void setDeptno(long deptno) {
		this.deptno = deptno;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Address> getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(List<Address> empAddress) {
		this.empAddress = empAddress;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", esal=" + esal
				+ ", deptno=" + deptno + ", mobileno=" + mobileno + ", empAddress=" + empAddress + ", email=" + email
				+ "]";
	}
	
	

}
