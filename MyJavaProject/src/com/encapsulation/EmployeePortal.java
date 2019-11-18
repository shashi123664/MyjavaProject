package com.encapsulation;

class EmployeePortal {

	public static void main(String[] args) {
		Employee emp=new Employee(1,"shashi",20000);
		System.out.println("employee id "+ emp.getId());
		System.out.println("employee name:  "+emp.getName());
		emp.setSalary(30000);
		System.out.println("employee salary: "+ emp.getSalary());

	}

}
