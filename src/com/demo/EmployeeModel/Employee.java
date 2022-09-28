package com.demo.EmployeeModel;

public class Employee {
	
	private int empId;
    private String empFirstName;
    private String empLastName;
    private String empEmailAddress;
    private int empSalary;
    
    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmailAddress=" + empEmailAddress + ", empSalary=" + empSalary + "]";
	}
    //constructor 
    public Employee() {
    	
    	super();
    }
    
	public Employee(int empId, String empFirstName, String empLastName, String empEmailAddress, int empSalary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmailAddress = empEmailAddress;
		this.empSalary = empSalary;
	}

	
	//getter setter
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName1(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpEmailAddress() {
		return empEmailAddress;
	}

	public void setEmpEmailAddress11(String empEmailAddress) {
		this.empEmailAddress = empEmailAddress;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary1(int empSalary) {
		this.empSalary = empSalary;
	}

	//@Override
	//public String toString() {
		///return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				//+ ", empEmailAddress=" + empEmailAddress + ", empSalary=" + empSalary + "]";
	}

	
	
    

//}
