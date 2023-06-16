package com.example.webExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class CustomerServiceRepository {
	
	private List<CustomerDTO> list; 
	
	@PostConstruct
	public void CustomerServiceRepository() { 
		
		this.list = new ArrayList<>(); 
		
		CustomerDTO cl1 = new CustomerDTO(); 
		cl1.setName("Alex Smith");
		cl1.setEmployeeID("AS121");
		cl1.setAge("10");
		this.list.add(cl1);
		
		cl1 = new CustomerDTO(); 
		cl1.setName("Manjesh Prasad");
		cl1.setEmployeeID("DX321");
		cl1.setAge("11");
		this.list.add(cl1);
			
	}
	
	
	public String  fetchCustomer() { 
		String str = ""; 		
		for(int count = 0; count < this.list.size(); count++) { 
			System.out.println(this.list.get(count));
			str += (this.list.get(count) + "\n"); 
		}
		
		return str;
	}
	
	public String createCustomer(CustomerDTO customerDTO) { 
		try { 
		CustomerDTO cl1 = new CustomerDTO(); 
		cl1.setName(customerDTO.getName());
		cl1.setAge(customerDTO.getAge());
		cl1.setEmployeeID(customerDTO.getEmployeeID());
		this.list.add(cl1); 
			return new String("Customer Created Successfully"); 
		} catch(Exception e) { 
			
			return e.getMessage(); 
		} finally {
			System.out.println("End of the block");
		}
		
	}
	
	// The employee ID is suppose to be a unique identifier
	public String updateCustomer(CustomerDTO customerDTO) { 
		
		try { 
			for(int count = 0; count < this.list.size(); count++) {
				
				if(this.list.get(count).getEmployeeID().equalsIgnoreCase(customerDTO.getEmployeeID())) { 
					this.list.get(count).setAge(customerDTO.getAge());
					this.list.get(count).setName(customerDTO.getName());
					return new String("Cusotmer Successfully updated"); 
				}
			}
			
			return this.createCustomer(customerDTO); 
			
		} catch(Exception e) { 
			return e.getMessage(); 
		} finally { 
			
			System.out.println("End of the update Block");
		}
	}
	
	
	
	// Employee ID is the unique identifier
	public String deleteCustomer(CustomerDTO customerDTO) { 
		
		try { 
			
			for(int count = 0; count < this.list.size(); count++) { 
				if(this.list.get(count).getEmployeeID().equalsIgnoreCase(customerDTO.getEmployeeID())) { 
					
					this.list.remove(count); 
					return new String("Cusotmer Successfully removed"); 
				}
				
			}
			
			return new String("Customer Not found"); 
		} catch (Exception e){
			
			return e.getMessage(); 
			
		} finally { 
			
			System.out.println("End of the delete block");
		}
	}
	
	
	

}
