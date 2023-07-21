package server.controller;

import java.util.ArrayList;
import java.util.List;

import model.Product;

/**
 * This class manage product data
 */

public class ProductDataManager
{
	private List<Product> products;
	
	/**
	 * Constructor
	 */
	
	public ProductDataManager()
	{
		// Load products
		this.products = new ArrayList<Product>();
		this.loadProducts();
	}
	
	public List<Product> getProducts()
	{
		return products;
	}
	
	/**
	 * This method finds a product from a list based on the product id
	 * and return a product
	 * @param id
	 * @return a product
	 */
	
	public Product getProduct(int id)
	{
		// Find a product
		for (Product product:products)
		{
			
			if (product.getProductId() == id)
				return product;
		}
		
		// Return product not found
		Product unFoundProduct = new Product();
		unFoundProduct.setName("Product not found");
		
		return unFoundProduct;
	}
	
	
	/**
	 * This method loads a list of product into a list
	 */
	
	private void loadProducts()
	{
		// Sample data
		int ids[] = {1001, 1002, 1003};
		String names[] = {"Nasi Ayam", "Nasi Briyani", "Nasi Kukus"};
		double prices[] = {8.00, 9.00, 8.50};
		
		// Load data into list
		for (int index=0; index < ids.length; index++)
		{
			// Create product
			Product product = new Product();
			product.setProductID(ids[index]);
			product.setPrice(prices[index]);
			product.setName(names[index]);
			
			// Add to list
			products.add(product);
		}
	}
}