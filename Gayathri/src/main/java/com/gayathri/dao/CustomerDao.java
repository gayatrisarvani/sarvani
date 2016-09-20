package com.gayathri.dao;

import java.util.List;

import com.gayathri.model.Customer;

public interface CustomerDao {
	 String addCustomer(Customer customer);
	public List<Customer> viewCustomer();
	Customer getCustomerByName(String name);
	

}
