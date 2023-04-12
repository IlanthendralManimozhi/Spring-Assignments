package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private BankingService bankingService;

	/**
	 * get the BankingService Object
	 * 
	 * @return BankingService object
	 */
	public BankingService getBankingService() {
		return bankingService;
	}

	/**
	 * set current BankingService object
	 * 
	 * @param bss
	 */
	public void setBankingService(BankingService bankingService) {
		this.bankingService = bankingService;
	}

	/**
	 * get Id of accounts where money transfer have to take place.
	 * 
	 * @param id1    credit Id
	 * @param id2    debit Id
	 * @param amount to be transferred.
	 * @throws InsufficientBalance
	 */
	@RequestMapping(value = "getAccount/{id1}/{id2}/{amount}", method = RequestMethod.GET)
	public void doTransfer(@PathVariable int id1, @PathVariable int id2, @PathVariable int amount)
			throws InsufficientBalance {
		bankingService.moneyTransfer(id1, id2, amount);
	}

}
