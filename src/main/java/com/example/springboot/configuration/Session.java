package com.example.springboot.configuration;

import java.util.List;

import com.example.springboot.service.Product;

public class Session {
	Session session = sessionFactory.openSession();
	Transaction tx = null;try
	{
		tx = session.beginTransaction();
		Product product = new Product();
		product.setName("Product 1");
		Customer customer = new Customer();
		customer.setName("Customer 1");
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setName("Manufacturer 1");
		product.setCustomer(customer);
		product.setManufacturer(manufacturer);
		session.save(product);
		tx.commit();
	}

	catch(
	HibernateException e)
	{
		if (tx != null)
			tx.rollback();
		e.printStackTrace();
	}finally
	{
		session.close();
	}

// update an existing record in product table

	Session session = sessionFactory.openSession();
	Transaction tx = null;try
	{
	   tx = session.beginTransaction();
	   Product product = (Product)session.get(Product.class, 1);
	   product.setName("Updated Product 1");
	   session.update(product); 
	   tx.commit();
	}catch(
	HibernateException e)
	{
	   if (tx!=null) tx.rollback();
	   e.printStackTrace(); 
	}finally
	{
	   session.close();
	}
// delete an existing record from product table

	Session session = sessionFactory.openSession();
	Transaction tx = null;try
	{
	   tx = session.beginTransaction();
	   Product product = (Product)session.get(Product.class, 1);
	   session.delete(product); 
	   tx.commit();
	}catch(
	HibernateException e)
	{
	   if (tx!=null) tx.rollback();
	   e.printStackTrace(); 
	}finally
	{
		session.close();
	}

//execute an query and return the manufacturer list for a given product name.

	Session session = sessionFactory.openSession();
	Transaction tx = null;try
	{
	tx = session.beginTransaction();
	List manufacturers = session.createQuery("FROM Manufacturer m WHERE m.name = :name").setParameter("name", "Manufacturer 1").list();
	for (Iterator iterator = manufacturers.iterator(); iterator.hasNext();){
	Manufacturer manufacturer = (Manufacturer) iterator.next();
	System.out.println(manufacturer.getName());
	}
	tx.commit();
	}catch(
	HibernateException e)
	{
	if (tx!=null) tx.rollback();
	e.printStackTrace(); 
	}finally
	{
	session.close();
	}

	void close() {
		// TODO Auto-generated method stub

	}

}
