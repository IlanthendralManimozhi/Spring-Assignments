package com.example.demo;

public interface TransactionInter {
	public void debit(int id, int amount) throws InsufficientBalance;

	public void credit(int id, int amount);

}
