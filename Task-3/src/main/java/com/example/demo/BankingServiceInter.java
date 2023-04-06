package com.example.demo;

public interface BankingServiceInter {

	public void creatAccount(Bank bank);
	public void debit(int uid,int amount)throws Exception;
	public void credit(int uid,int amount)throws Exception;
	public Bank balanceCheck(int uid);
}
