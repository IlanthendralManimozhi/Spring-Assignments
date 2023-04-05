package com.example.demo;

import java.util.Optional;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ts")
@Transactional
public class TransactionService implements TransactionInter{
	@Autowired
	private AccountsDAO dao;
	/**
	 * Method access the account's amount and throws exception if there is insufficient Balance 
	 * @throws InsuffucientBalance
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = InsufficientBalance.class)
	public void debit(int id,int amount) throws InsufficientBalance{
		Account account=dao.findByID(id);
		int amt = account.getAmount();
		if (amt < amount) {
			
			throw new InsufficientBalance("Not enough money to transfer....");
		}
		amt = amt - amount;
		account.setAmount(amt);
		dao.updateuser(account);
		
	}
	/**
	 * Method access the account's amount and credit amount passed
	 * @throws InsuffucientBalance
	 */
	public void credit(int id,int amount) {
		
		Account account=dao.findByID(id);
		int amt = account.getAmount();
		amt = amt + amount;
		account.setAmount(amt);
		dao.updateuser(account);
	}
}
class InsufficientBalance extends Exception {
	InsufficientBalance(String str) {
		super(str);
	}
}
