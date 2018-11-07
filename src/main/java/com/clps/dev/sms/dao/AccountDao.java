/**
 * Project Name:clps.sms
 * File Name:AccountDao.java
 * Package Name:com.clps.dev.sms.dao
 * Date:2018年10月31日上午11:15:56
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.clps.dev.sms.dao;

import java.util.List;

import com.clps.dev.sms.pojo.Account;



/**
 * ClassName: AccountDao <br/>
 * Description: 
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年10月31日 上午11:15:56
 */
public interface AccountDao {
	/**
	 * 
	 * queryAllAccounts
	 * @Description:用于查询账号
	 * @param:@return
	 * @author Jack.Huang
	 * @return:List<Account>  返回一个集合
	 */
	public List<Account> queryAllAccounts();
	/**
	 * 
	 * updateAccountById:
	 * @Description:用于更新账号通过Id
	 * @param:@param account
	 * @param:@return
	 * @author Jack.Huang
	 * @return:Boolean  true   更新成功
	 *                  false  更新失败
	 */
	public Boolean updateAccountById(Account account);
	/**
	 * 
	 * deteleAccountById
	 * @Description:用于删除账号通过Id
	 * @param:@param id
	 * @param:@return
	 * @author Jack.Huang
	 * @return:Boolean  true   删除成功
	 *                  false  删除失败
	 */
	public Boolean deteleAccountById(Account account);
	/**
	 * 
	 * saveAccount
	 * @Description:用于保存账号通过
	 * @param:@param account
	 * @param:@return
	 * @author Jack.Huang
	 * @return:Boolean	true   保存成功
	 *                  false  保存失败
	 */
	public Boolean saveAccount(Account account);
	/**
	 * 
	 * queryAccountById
	 * @Description:通过账号Id来查询
	 * @param:@param accountId
	 * @param:@return
	 * @author Jack.Huang
	 * @return:Account    查询返回一个Account对象    
	 */
	public Account queryAccountById(String accountId);
	/**
	 * 
	 * queryAccountByCondition
	 * @Description:通过环境进行查询
	 * @param:@return
	 * @author Jack.Huang
	 * @return:List<Account>   返回一个集合
	 */
	public List<Account> queryAccountByCondition();
	
	
}
