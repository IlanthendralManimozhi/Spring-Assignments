package com.example.demo;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("transactionService")
@Transactional
public class TransactionService implements TransactionInter {
	@Autowired
	private AccountsDAO dao;

	public AccountsDAO getDao() {
		return dao;
	}

	public void setDao(AccountsDAO dao) {
		this.dao = dao;
	}

	/**
	 * Method access the account's amount and throws exception if there is
	 * insufficient Balance
	 * 
	 * @throws InsuffucientBalance
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = InsufficientBalance.class)
	public void debit(int id, int amount) throws InsufficientBalance {
		Account account = dao.findByID(id);
		int currentBalance = account.getAmount();
		if (currentBalance < amount) {

			throw new InsufficientBalance("Not enough money to transfer....");
		}
		currentBalance = currentBalance - amount;
		account.setAmount(currentBalance);
		dao.updateuser(account);

	}

	/**
	 * Method access the account's amount and credit amount passed
	 * 
	 * @throws InsuffucientBalance
	 */
	public void credit(int id, int amount) {

		Account account = dao.findByID(id);
		int currentBalance = account.getAmount();
		currentBalance = currentBalance + amount;
		account.setAmount(currentBalance);
		dao.updateuser(account);
	}
}

class InsufficientBalance extends Exception {
	InsufficientBalance(String str) {
		super(str);
	}
}
