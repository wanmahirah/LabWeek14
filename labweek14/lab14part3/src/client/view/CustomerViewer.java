package client.view;

import java.util.List;

import model.Customer;

public class CustomerViewer
{
	public void displayCustomers(List<Customer> customers)
	{
		// Some information about the record
		System.out.println("\tNumber of record: " + customers.size());
		System.out.println("\tCustomer Information");
		System.out.println("\t-------------------------------------");
		System.out.println("\t ID\t Name");
		
		// Print all customers on console
		for (Customer customer:customers)
		{
			System.out.print("\t" + customer.getCustomerID());
			System.out.println("\t" + customer.getName());
		}
	}
}