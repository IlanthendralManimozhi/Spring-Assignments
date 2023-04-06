package com.example.demo;

public interface BankingServiceInter {

	public void creatAccount(Bank bank);
	public void debit(int uid,int amount);
	public void credit(int uid,int amount);
	public Bank balanceCheck(int uid);
}
