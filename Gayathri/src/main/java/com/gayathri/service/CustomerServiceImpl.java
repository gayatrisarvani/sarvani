package com.gayathri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gayathri.dao.CustomerDao;
import com.gayathri.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	public void addCustomer(Customer customer) {
		System.out.println("CustomerService");
	customerDao.addCustomer(customer);
	}
	@Override
	public List<Customer> viewCustomer() {
		
		List<Customer>list=customerDao.viewCustomer();
		return list;
	}
	
	
		public Customer getCustomerByName(String name) {
			return customerDao.getCustomerByName(name);
		
	
	}
	
}
