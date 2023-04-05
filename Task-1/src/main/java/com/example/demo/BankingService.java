package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bs")
@Transactional
public class BankingService {

	@Autowired
	private TransactionInter tsi;

	public TransactionInter getTsi() {
		return tsi;
	}

	public void setTsi(TransactionInter tsi) {
		this.tsi = tsi;
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
		tsi.credit(creditid, amount);
		tsi.debit(debitid, amount);

	}
}
