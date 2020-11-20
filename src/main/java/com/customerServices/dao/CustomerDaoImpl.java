package com.customerServices.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.customerServices.model.Employee;
@Qualifier("customerDaoImpl")
@Repository
public class CustomerDaoImpl {
//	@Autowired
	//private SessionFactory sessionFactory;
 
	/*public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}*/
 
	/*public List<Customer> getAllCustomers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Customer>  customerList = session.createQuery("from Customer").list();
		return customerList;
	}*/
 
	public Employee getCustomer(int id) {
	/*	Session session = sessionFactory.openSession();
		session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, id);
		session.getTransaction().commit();*/
		return null;
	}
}
