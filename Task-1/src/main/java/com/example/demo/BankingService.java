package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bankingService")
@Transactional
public class BankingService {

	@Autowired
	private TransactionInter transactionService;

	

	public TransactionInter getTransactionService() {
		return transactionService;
	}



	public void setTransactionService(TransactionInter transactionService) {
		this.transactionService = transactionService;
	}



	/**
	 * Method passes credit and debit id for specified method in TransactionService
	 * 
	 * @param creditid
	 * @param debitid
	 * @param amount
	 * @throws InsufficientBalance
	 */
	public void moneyTransfer(int creditid, int debitid, int amount) throws InsufficientBalance {
		transactionService.credit(creditid, amount);
		transactionService.debit(debitid, amount);

	}
}
