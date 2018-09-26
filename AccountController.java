package com.raghtech.bankapp.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.ArrayList;

import com.raghtech.bankapp.model.Account;

@RestController
@RequestMapping(value="/bankservice")
public class AccountController {

	@RequestMapping(value="fetchAccounts",
	method = RequestMethod.GET)
	public List<Account> getAllAccounts() {
		List<Account> accounts = new ArrayList<Account>();
		Account account = new Account();
		account.setAccNo(111);
		account.setName("Raghu");
		accounts.add(account);
		
		account = new Account();
		account.setAccNo(112);
		account.setName("Suman");
		accounts.add(account);
		
		account = new Account();
		account.setAccNo(113);
		account.setName("Kiran");
		accounts.add(account);
		return  accounts;
	}

}