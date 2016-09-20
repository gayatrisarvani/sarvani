package com.gayathri.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gayathri.model.CartItem;

@Repository
public class CartItemDaoImpl implements CartItemDao {
	@Autowired
	SessionFactory sessionFactory;
	public void addCartItem(CartItem cartItem) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(cartItem);
		transaction.commit();
		
	}
	
	public List<CartItem> ViewCartItems(int cartId) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from CartItem where cartId="+cartId);
		List<CartItem>list=query.list();
		return list;
	}
	
	public void deleteCartItemById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		CartItem cartitem=session.get(CartItem.class,new Integer(id));
		
	}
	

}
