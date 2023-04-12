package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	private int id;
	private int amount;
	private int accountId;

	/**
	 * retrieve the id of object account
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * set id value for specified account object
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * retrieve the acid of object account
	 * 
	 * @return acid
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * set acid value for specified account object
	 * 
	 * @param acid
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * retrieve the amount of object account
	 * 
	 * @return amount
	 */
	public int getAccountId() {
		return accountId;
	}

	/**
	 * set amount value for specified account object
	 * 
	 * @param amount
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

}
