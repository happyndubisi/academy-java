package com.bptn.playground;

class Department {

	private String departmentName;
	private int  numberOfEmployees;
	
	public Department( String departmentName, int numberOfEmployees){
		this.departmentName = departmentName;
		this.numberOfEmployees = numberOfEmployees;
	}

	public void displayDepartmentInfo() {
		System.out.println("Name of Department: " + departmentName);
		System.out.println("Number of Employee: " + numberOfEmployees);
	}

}
	
