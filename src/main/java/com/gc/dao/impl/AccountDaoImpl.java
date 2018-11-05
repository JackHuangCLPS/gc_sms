/**
 * Project Name:clps.sms
 * File Name:AccountDaoImpl.java
 * Package Name:com.clps.dev.sms.dao.impl
 * Date:2018年10月31日上午11:37:01
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.gc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.gc.common.CommonSql;
import com.gc.dao.AccountDao;
import com.gc.pojo.Account;
import com.gc.util.jdbc.JDBCTemplate;


/**
 * ClassName: AccountDaoImpl <br/>
 * Description:
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年10月31日 上午11:37:01
 */
public class AccountDaoImpl implements AccountDao {
	
	private List<Account> accountList = null;
	JDBCTemplate<Account> accounttem = new JDBCTemplate<>();
	
	

	/**
	 * Creates a new instance of AccountDaoImpl.
	 *
	 * @param accountList
	 */
	
	public AccountDaoImpl() {
		this.accountList = new ArrayList<>();
	}

	/**
	 * .
	 * @param  
	 * @see com.clps.dev.sms.dao.AccountDao#queryAllAccounts()
	 */
	@Override
	public List<Account> queryAllAccounts() {
		//JDBCTemplate<Account> accounttem = new JDBCTemplate<>();
		//accountList = accounttem.queryAll(CommonSql.SQL_QUERY_ACCOUNT, JDBCIMapper<List<Account>> map);
		return accountList;
	}

	/**
	 * 
	 * @see com.clps.dev.sms.dao.AccountDao#updateAccountById(com.clps.dev.sms.pojo.Account)
	 */
	@Override
	public Boolean updateAccountById(Account account) {
		boolean flag = accounttem.updateData(CommonSql.SQL_UPDATE_ACCOUNT_ID, account.getAccountName(),account.getAccountPwd(),account.getAccountUpdatedName(),account.getAccountUpdatedDate(),account.getAccountId());
		return flag;
	}

	/**
	 * 
	 * @see com.clps.dev.sms.dao.AccountDao#deteleAccountById(com.clps.dev.sms.pojo.Account)
	 */
	@Override
	public Boolean deteleAccountById(Account account) {
		boolean flag=accounttem.updateData(CommonSql.SQL_DELETE_ACCOUNT, account.getAccountId());
		return flag;
	}

	/**
	 * 
	 * @see com.clps.dev.sms.dao.AccountDao#saveAccount(com.clps.dev.sms.pojo.Account)
	 */
	@Override
	public Boolean saveAccount(Account account) {
		boolean flag = accounttem.updateData(CommonSql.SQL_SAVE_ACCOUNT, account.getAccountId(),account.getAccountName(),account.getAccountPwd(),account.getAccountCreatedName(),account.getAccountCreatedTime(),
				account.getAccountCreatedTime(),account.getAccountUpdatedName(),account.getAccountUpdatedDate());
		return flag;
	}

	/**
	 * 
	 * @see com.clps.dev.sms.dao.AccountDao#queryAccountById(java.lang.String)
	 */
	@Override
	public Account queryAccountById(String accountId) {
		//Account account = accounttem.queryUnique(CommonSql.SQL_QUERY_ACCOUNT_ID, JDBCIMapper<Account> map, accountId);
		return null;
	}

	/**
	 * 
	 * @see com.clps.dev.sms.dao.AccountDao#queryAccountByCondition()
	 */
	@Override
	public List<Account> queryAccountByCondition() {
		
		return null;
	}

}
