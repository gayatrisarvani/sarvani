package com.gayathri.dao;

import java.util.List;

import com.gayathri.model.Customer;

public interface CustomerDao {
	 void addCustomer(Customer customer);
	public List<Customer> viewCustomer();
	Customer getCustomerByName(String name);
	

}
