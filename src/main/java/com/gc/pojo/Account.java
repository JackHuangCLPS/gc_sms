/**
 * Project Name:clps.sms
 * File Name:Account.java
 * Package Name:com.clps.dev.sms.pojo
 * Date:2018年10月31日上午10:48:31
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.gc.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ClassName: Account <br/>
 * Description: account模型
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年10月31日 上午10:48:31
 */
public class Account implements Serializable{
	
	/**
	 * serialVersionUID:序列号
	 * @since JDK 1.8
	 */
	private static final long serialVersionUID = 1L;
	
	private String accountId;							//账号Id
	private String accountName;							//账号名称
	private String accountPwd;							//账号密码
	//private String accountDescription;					//账号描述
	private String accountCreatedName;					//账号创建名称
	private Timestamp accountCreatedTime;				//账号创建时间
	private String accountUpdatedName;					//账号更新名称
	private Timestamp accountUpdatedDate;				//账号更新时间
	private String del;
	/**
	 * del.
	 *
	 * @return  the del
	 */
	public final String getDel() {
		return del;
	}
	/**
	 * del.
	 *
	 * @param   del    the del to set
	 */
	public final void setDel(String del) {
		this.del = del;
	}
	/**
	 * Creates a new instance of Account.
	 *
	 */
	
	public Account() {
		super();
	}
	/**
	 * accountId.
	 *
	 * @return  the accountId
	 */
	public final String getAccountId() {
		return accountId;
	}
	/**
	 * accountId.
	 *
	 * @param   accountId    the accountId to set
	 */
	public final void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/**
	 * accountName.
	 *
	 * @return  the accountName
	 */
	public final String getAccountName() {
		return accountName;
	}
	/**
	 * accountName.
	 *
	 * @param   accountName    the accountName to set
	 */
	public final void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	/**
	 * accountPwd.
	 *
	 * @return  the accountPwd
	 */
	public final String getAccountPwd() {
		return accountPwd;
	}
	/**
	 * accountPwd.
	 *
	 * @param   accountPwd    the accountPwd to set
	 */
	public final void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}
	
	/**
	 * accountCreatedName.
	 *
	 * @return  the accountCreatedName
	 */
	public final String getAccountCreatedName() {
		return accountCreatedName;
	}
	/**
	 * accountCreatedName.
	 *
	 * @param   accountCreatedName    the accountCreatedName to set
	 */
	public final void setAccountCreatedName(String accountCreatedName) {
		this.accountCreatedName = accountCreatedName;
	}
	/**
	 * accountCreatedTime.
	 *
	 * @return  the accountCreatedTime
	 */
	public final Timestamp getAccountCreatedTime() {
		return accountCreatedTime;
	}
	/**
	 * accountCreatedTime.
	 *
	 * @param   accountCreatedTime    the accountCreatedTime to set
	 */
	public final void setAccountCreatedTime(Timestamp accountCreatedTime) {
		this.accountCreatedTime = accountCreatedTime;
	}
	/**
	 * accountUpdatedName.
	 *
	 * @return  the accountUpdatedName
	 */
	public final String getAccountUpdatedName() {
		return accountUpdatedName;
	}
	/**
	 * accountUpdatedName.
	 *
	 * @param   accountUpdatedName    the accountUpdatedName to set
	 */
	public final void setAccountUpdatedName(String accountUpdatedName) {
		this.accountUpdatedName = accountUpdatedName;
	}
	/**
	 * accountUpdatedDate.
	 *
	 * @return  the accountUpdatedDate
	 */
	public final Timestamp getAccountUpdatedDate() {
		return accountUpdatedDate;
	}
	/**
	 * accountUpdatedDate.
	 *
	 * @param   accountUpdatedDate    the accountUpdatedDate to set
	 */
	public final void setAccountUpdatedDate(Timestamp accountUpdatedDate) {
		this.accountUpdatedDate = accountUpdatedDate;
	}
	/**
	 * 
	 * @see java.lang.Object#toString()
	 */

}
