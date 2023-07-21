package client.app;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

import model.Customer;

public class TCPCustomerIDClientApp
{
	public static void main (String[] args)
	{
		try 
		{
			System.out.println("\tExecuting TCP Customer By ID Server App");
		
			// Server information
			int serverPortNo = 8088;
			InetAddress serverAddress = InetAddress.getLocalHost();
			
			// 1. Connect to remote machine
			Socket socket = new Socket(serverAddress, serverPortNo);
			
			// Create stream to send request
			OutputStream osOutput = socket.getOutputStream();
			DataOutputStream dosOutput = new DataOutputStream(osOutput);
			
			// 2. Send request to the server
			// Input the customer id 
			System.out.print("Enter customer ID: ");
			Scanner sc = new Scanner(System.in);
			int customerId = sc.nextInt();
			
			// write the input to the network socket
			dosOutput.writeInt(customerId);
			System.out.println("\tRequesting customer id " + customerId + "\n");
			
			// Create stream to receive response from the server
			InputStream isInput = socket.getInputStream();
			ObjectInputStream oisInput = new ObjectInputStream(isInput);
			
			
			// 3. Read respond from the server - cast object
			Customer customer = (Customer) oisInput.readObject();
			
			// 4. Process response - display the object
			System.out.println("\tCustomer Information (From the server)");
			System.out.println("\tCustomer Id: " + customer.getCustomerID());
			System.out.println("\tName: " + customer.getName());
		} 
		
		catch (Exception ex)
		{
		}
	}
}