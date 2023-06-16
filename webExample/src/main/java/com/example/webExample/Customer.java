package com.example.webExample;

public interface Customer {
	public String fetchCustomer(); 
	public String createCustomer(CustomerDTO customerDTO); 
	public String updateCustomer(CustomerDTO customerDTO); 
	public String deleteCustomer(CustomerDTO customerDTO); 
}
