package com.example.demo;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("bs")
@Transactional
public class BankingService implements BankingServiceInter{
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
	@Transactional(propagation = Propagation.REQUIRED)
	public void debit(int uid,int amount) {
		Optional<Bank> optional=dao.findById(uid);
		Bank account=optional.get();
		int currentBalance=account.getUamount();
		currentBalance=currentBalance-amount;
		account.setUamount(currentBalance);
		dao.save(account);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public void credit(int uid,int amount) {
		Optional<Bank> optional=dao.findById(uid);
		Bank account=optional.get();
		int currentBalance=account.getUamount();
		currentBalance=currentBalance+amount;
		account.setUamount(currentBalance);
		dao.save(account);
	}
	public Bank balanceCheck(int uid) {
		Optional<Bank> opt= dao.findById(uid);
		return opt.get();
	}
    
}
