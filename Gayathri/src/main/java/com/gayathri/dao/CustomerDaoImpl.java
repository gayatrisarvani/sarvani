package com.gayathri.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gayathri.model.Cart;
import com.gayathri.model.Customer;
import com.gayathri.model.UserRole;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	SessionFactory sessionFactory;
	//saving the customer
	public void addCustomer(Customer customer) {
		System.out.println("CustomerDaoImpl");
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Cart cart=new Cart();
		customer.setCart(cart);
		customer.setEnabled(true);
		session.save(customer);
		UserRole userRole= new UserRole();
		userRole.setAuthority("ROLE_USER");
		userRole.setUserId(customer.getCustomerId());
		session.save(userRole);
		
		transaction.commit();
		System.out.println("Done saving the customer");	
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Customer> viewCustomer() {
		Session session= sessionFactory.getCurrentSession();
		Transaction transaction= session.beginTransaction();
		
		List<Customer>list=session.createCriteria(Customer.class).list();
		return list;
	}
	
	public Customer getCustomerByName(String name) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Customer customer=(Customer) session.createCriteria(Customer.class).add(Restrictions.like("username", name)).uniqueResult();
		return customer;
	}
}
