package com.springbootormrest.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="emp")
public class Employee {
	
	@Id
	private long eid;
	private String ename;
	private String job;
	private long mgr;
	private double esal;
	private long deptno;
	private long mobileno;
	private String email;
	
	
	
	public Employee(long eid, String ename, String job, long mgr, double esal, long deptno, long mobileno,
			String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.esal = esal;
		this.deptno = deptno;
		this.mobileno = mobileno;
		this.email = email;
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
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", esal=" + esal
				+ ", deptno=" + deptno + ", mobileno=" + mobileno + ", email=" + email + "]";
	}
	
	

}
