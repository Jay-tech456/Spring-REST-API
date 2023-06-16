package com.example.webExample;

public class CustomerDTO {

	private String name; 
	private String employeeID; 
	private String Age;
	
	public CustomerDTO(String name, String employeeID, String age) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.Age = age;
	}

	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String Age) {
		this.Age = Age;
	}

	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", employeeID=" + employeeID + ", Age=" + Age + "]";
	} 
	
	
	
	
	
	
}
