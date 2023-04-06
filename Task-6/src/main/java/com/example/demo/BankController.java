package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	private BankingServiceInter bsi;

	public BankingServiceInter getBsi() {
		return bsi;
	}

	public void setBsi(BankingServiceInter bsi) {
		this.bsi = bsi;
	}
	@RequestMapping(value = "menu",method = RequestMethod.GET)
	public ModelAndView menuDispaly(ModelAndView mandv) {
		mandv.setViewName("menu");
		return mandv;
	}
	@RequestMapping(value = "createAccount",method = RequestMethod.GET)
	public ModelAndView setAccount(ModelAndView mandv) {
		Bank bank = new Bank();
		mandv.addObject("bank", bank);
		mandv.setViewName("form");
		return mandv;
	}
	@RequestMapping(value = "createAccount",method = RequestMethod.POST)
	public ModelAndView setAccount(Bank bank,ModelAndView mandv) {
		mandv.setViewName("sucess");
		bsi.creatAccount(bank);
		return mandv;
	}
	@RequestMapping(value = "accountBalance",method = RequestMethod.GET)
	public ModelAndView getBalace(ModelAndView mandv) {
		Bank bank = new Bank();
		mandv.addObject("bank", bank);
		mandv.setViewName("balance");
		return mandv;
	}
	@RequestMapping(value = "accountBalance",method = RequestMethod.POST)
	public ModelAndView gBalance(Bank banks,ModelAndView mandv) {
		int id=banks.getUid();
		Bank balance=bsi.balanceCheck(id);
		mandv.addObject("balanceDisplay", balance);
		mandv.setViewName("balanceDisplay");
		return mandv;
	}
	@RequestMapping(value = "doTransfer",method = RequestMethod.GET)
	public ModelAndView setTransfer(ModelAndView mandv) {
		Trans trans = new Trans();
		mandv.addObject("trans", trans);
		mandv.setViewName("transfer");
		return mandv;
	}
	@RequestMapping(value = "doTransfer",method = RequestMethod.POST)
	public ModelAndView setTransfer(int uid1,int uid2,int uamount,ModelAndView mandv) {
		bsi.debit(uid1, uamount);
		bsi.credit(uid2, uamount);
		mandv.setViewName("transferred");
		return mandv;
	}
	@RequestMapping(value = "sucess",method = RequestMethod.POST)
	public ModelAndView message(ModelAndView mandv) {
		mandv.setViewName("sucess");
		return mandv;
	}
	
	
}
class Trans{
	private int uid1;
	private int uid2;
	private int uamount;
	public int getUid1() {
		return uid1;
	}
	public void setUid1(int uid1) {
		this.uid1 = uid1;
	}
	public int getUid2() {
		return uid2;
	}
	public void setUid2(int uid2) {
		this.uid2 = uid2;
	}
	public int getUamount() {
		return uamount;
	}
	public void setUamount(int uamount) {
		this.uamount = uamount;
	}
	
}
