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
	private int acountId;

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
	public int getAcid() {
		return acountId;
	}

	/**
	 * set acid value for specified account object
	 * 
	 * @param acid
	 */
	public void setAcid(int acid) {
		this.acountId = acid;
	}

	/**
	 * retrieve the amount of object account
	 * 
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * set amount value for specified account object
	 * 
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
