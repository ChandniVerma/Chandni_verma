package com.training.employee;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee() {
		System.out.println("Default Constructor invoked for Employees.........");
	}
	public void init() {
		System.out.println("INIT for Employee");
		
	}
	public void destroy() {
		System.out.println("Destroy for Employee");
	}
	

	public void ginit() {
		System.out.println("IGlobLNIT for Employee");
		
	}
	public void gdestroy() {
		System.out.println("GLOBALDestroy for Employee");
	}
}
