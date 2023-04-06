package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("bs")
@Transactional
public class BankingService implements BankingServiceInter {
	@Autowired
	private BankDAO dao;

	public BankDAO getDao() {
		return dao;
	}

	public void setDao(BankDAO dao) {
		this.dao = dao;
	}

	public void creatAccount(Bank bank) {
		dao.save(bank);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class )
	public void debit(int uid, int amount) throws Exception{
		Optional<Bank> optional = dao.findById(uid);
		Bank account = optional.get();
		int currentBalance = account.getUamount();
		if (amount > currentBalance) {

			throw new InsufficientBalance("Not enough money to transfer....");
		}
		if (amount < 0) {

			throw new InvalidValue("Enter valid Value....");
		}
		currentBalance = currentBalance - amount;
		account.setUamount(currentBalance);
		dao.save(account);
	}

	@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
	public void credit(int uid, int amount)throws Exception {
		Optional<Bank> optional = dao.findById(uid);
		Bank account = optional.get();
		int currentBalance = account.getUamount();
		if (amount < 0) {

			throw new InvalidValue("Enter valid Value....");
		}
		currentBalance = currentBalance + amount;
		account.setUamount(currentBalance);
		dao.save(account);
	}

	public Bank balanceCheck(int uid) {
		Optional<Bank> opt = dao.findById(uid);
		return opt.get();
	}

}
