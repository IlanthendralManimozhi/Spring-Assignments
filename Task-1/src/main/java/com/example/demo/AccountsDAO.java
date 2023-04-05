package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountsDAO {

	@Autowired
	private SessionFactory factory;

	/**
	 * find and return object of type Account with the id passed as parameter
	 * 
	 * @param acid
	 * @return
	 */
	public Account findByID(int acid) {
		Session session = factory.getCurrentSession();
		Account dto = session.get(Account.class, Integer.valueOf(acid));
		return dto;
	}

	/**
	 * Object returned by the method used by Hibernate to interact with database.
	 * 
	 * @return SessionFactory Object
	 */
	public SessionFactory getFactory() {
		return factory;
	}

	/**
	 * set object used by Hibernate to interact with database.
	 * 
	 * @param factory
	 */
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	/**
	 * updates the database with Hibernate
	 * 
	 * @param dto
	 */
	public void updateuser(Account dto) {
		Session session = factory.getCurrentSession();
		session.persist(dto);
	}

}
