package com.makotojava.intro;

import java.math.BigDecimal;

public class Employee extends Person {
	private String taxpayerIdentificationNumber;
	private String employeeNumber;
	private BigDecimal salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTaxpayerIdentificationNumber() {
		return taxpayerIdentificationNumber;
		}
		public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
		this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
		}

	public Employee(String firstName, String lastName, int age, int height, int weight, String eyeColor,
			String gender) {
		super(firstName, lastName, age, height, weight, eyeColor, gender);
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public void printAudit(StringBuilder buffer) {
		// Call the superclass version of this method first to get its attribute values
		super.printAudit(buffer);
		// Now format this instance's values
		buffer.append("TaxpayerIdentificationNumber=");
		buffer.append(getTaxpayerIdentificationNumber());
		buffer.append(","); buffer.append("EmployeeNumber=");
		buffer.append(getEmployeeNumber());
		buffer.append(","); buffer.append("Salary=");
		buffer.append(getSalary().setScale(2).toPlainString());
		

	}

}
