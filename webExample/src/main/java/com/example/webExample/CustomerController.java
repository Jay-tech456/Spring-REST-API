package com.example.webExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController implements Customer {
	
	@Autowired
	CustomerServiceRepository repo; 
		@GetMapping(produces="application/json") 
		public String fetchCustomer()
		{
		
			return repo.fetchCustomer();
		}
		
		
		@PostMapping(consumes = "application/json") 
		public String createCustomer(@RequestBody CustomerDTO customerDTO) { 
			// This method persists the details of a customer 
			return repo.createCustomer(customerDTO); 
		}
		
		
		@PutMapping(consumes = "application/json")
		public String updateCustomer(@RequestBody CustomerDTO customerDTO)
		{ 
			// This method will update the details of an existing customer 
			return repo.updateCustomer(customerDTO); 
		}
		
		
		@DeleteMapping(consumes = "application/json")
		public String deleteCustomer(@RequestBody CustomerDTO customerDTO) { 
			// This method will delete a customer
			return repo.deleteCustomer(customerDTO);
		}


}
