/**
 * Project Name:clps.sms
 * File Name:AccountService.java
 * Package Name:com.clps.dev.sms.service
 * Date:2018年10月31日下午1:58:16
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.clps.dev.sms.service;

import java.util.List;

import com.clps.dev.sms.pojo.Account;



/**
 * ClassName: AccountService <br/>
 * Description: 业务层
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年10月31日 下午1:58:16
 */
public interface AccountService {
	/**
	 * 
	 * addAccount:添加账号
	 * @Description:传入一个Account对象
	 * @param:@param account
	 * @param:@return
	 * @author Jack.Huang
	 * @return:String
	 */
	public String addAccount(Account account);
	
	public String queryAll();
	
	public String deleteAccountById(Account account);
	
	public String updateAccountById(Account account);


}
