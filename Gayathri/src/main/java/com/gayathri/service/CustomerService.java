package com.gayathri.service;

import java.util.List;

import com.gayathri.model.Customer;
public interface CustomerService {
	 void addCustomer(Customer customer);
	public List<Customer> viewCustomer();
	Customer getCustomerByName(String name);


}
