package com.river.dao;

import java.util.List;

import com.river.model.Account;

public interface AccountDAO {
	List<Account> findAllAccount();
}
