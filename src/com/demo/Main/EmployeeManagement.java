package com.demo.Main;

import java.util.List;
import java.util.Scanner;

import com.demo.EmployeeModel.Employee;
//import com.demo.EmployeeModel.Employee;
import com.demo.service.EmployeeServiceLayer;
import com.demo.serviceImplementation.EmployeeServiceImplementation;


public class EmployeeManagement {
	
	public static void main(String[] args) {
		
		int cases = 1;
		boolean status = true;
		
		EmployeeServiceLayer employeeService = new EmployeeServiceImplementation();
		
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to insert employees");
		System.out.println("Enter 2 to show employees");
		
		do {
		
			cases = sc.nextInt();
		
		switch(cases) {
		
		case 1:
			
			//EmployeeServiceLayer employeeService = new EmployeeServiceImplementation();
			
			Employee employee = new Employee();
			
			employee.setEmpId(28);
			
			employee.setEmpFirstName1("Ishita");
			
			employee.setEmpLastName("Malviya");
			
			employee.setEmpEmailAddress11("IM@ford.com");
			
			employee.setEmpId(5000000);
			
			String insertEmployee = employeeService.insertEmployee(employee);
			System.out.println(insertEmployee);
			
			//employeeService.insertEmployee(employee);
			
			
			break;
			
		case 2:
			//EmployeeServiceLayer employeeServices = new EmployeeServiceImplementation();
			
			List<Employee> allEmployees = employeeService.getAllEmployees();
			
			System.out.println(allEmployees);
			break;
		
		}
		
		}
		while(status);
		sc.close();
	}

}
