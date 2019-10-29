package com.river.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.river.dao.AccountDAO;
import com.river.dao.impl.AccountDAOImpl;
import com.river.model.Account;
import com.river.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountDAO accountDAO;
	
	
	@Override
	public List<Account> findAllAccount() {
		return accountDAO.findAllAccount();
	}

}
