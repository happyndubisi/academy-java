package com.bptn.playground;

 class SalesDepartment extends Department {

private double totalSalesAmount;

public SalesDepartment(String departmentName, int numberOfEmployees, double totalSalesAmount) {
	super(departmentName, numberOfEmployees);
	this.totalSalesAmount =  totalSalesAmount;
}
