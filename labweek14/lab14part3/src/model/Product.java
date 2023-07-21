package model;

import java.io.Serializable;

public class Product implements Serializable
{
	private int productID;
	private String name;
	private double price;
	
	public int getProductId() {
		return productID;
	}
	
	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}