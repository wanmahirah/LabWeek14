package server.controller;

import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.Product;

public class CustomerDataManager
{
	private List<Customer> customers;
	
	/**
	 * This constructor will call Method 1.
	 */
	
	public CustomerDataManager()
	{
		// create customers
		this.customers = new ArrayList<Customer>();
		this.createCustomer();
	}
	
	/**
	 * Lab Week 14 Part 3 Exercise 3
	 * Method 1
	 * This method creates a list of samples of customer data.   
	 * The list will contain 10 customers. 
	 * 
	 */
	
	private List<Customer> createCustomer() 
	{
		// 10 Samples data
		int customerId[] = {1001, 1002, 1003, 1004, 1005, 
							1006, 1007, 1008, 1009, 1010};
		String names[] = {"Wan Mashruhim", "Lelatul Hadzirah", 
						  "Aufa Fasihah", "Aqwal Fikri",
						  "Azad Faqih", "Aklima",
						  "Mohd Fairuz", "Wan Mahirah",
						  "Juhairah", "Sulaiman"};
		
		// Adding data into the list
		for(int index = 0; index < 10; index++)
		{
			// insert each customer information
			Customer customer = new Customer();
			customer.setCustomerID(customerId[index]);
			customer.setName(names[index]);
			
			// add to the list
			customers.add(customer);
		}
		
		return customers;
	}
	
	
	/**
	 * Lab Week 14 Part 3 Exercise 3
	 * Method 2
	 * 
	 * This method searches a customer based on the customer’s name 
	 * from a list of customers.
	 *   
	 * This method will receive a parameter that represents a customer’s name.  
	 * The customer’s name will be either full or partial name.  
	 * The method will return a Customer’s object if the name exists. 
	 * Otherwise, it will return null.  
	 * 
	 * @param name: Customer's name
	 * @return
	 */
	
	public Customer getCustomerByName(String name)
	{
		for (Customer customer:customers)
		{
			// check the customer name partially
			if(name.equals(customer.getName().substring(0, name.length())))
				return customer;
		}
		
		// Return customer as null if customer's name searched is not found
		Customer noCustomer = new Customer();
		noCustomer.setName(null);
		return noCustomer;
	}
	
	/**
	 * Lab Week 14 Part 3 Exercise 3
	 * Method 3
	 * 
	 * This method searches a customer based on the customer’s id 
	 * from a list of customers.  
	 * 
	 * This method will receive a parameter that represents a customer’s id.    
	 * This method will return a Customer’s object if the name exist. 
	 * Otherwise, it will return null.
	 * 
	 *  @param id: Customer Id
	 *  @return
	 */
	
	public Customer getCustomerById(int id)
	{
		// Find a product
		for (Customer customer:customers)
		{
			if (customer.getCustomerID() == id)
				return customer;
		}
		
		// Return product not found
		Customer noCustomer = new Customer();
		noCustomer.setName(null);
		return noCustomer;
	}
	
	/**
	 * Lab Week 14 Part 3 Exercise 3
	 * Method 4
	 * This method will return a list of customers.
	 * 
	 * @return A list of customers
	 */
	
	public List<Customer> getCustomerList()
	{
		return customers;
	}
}