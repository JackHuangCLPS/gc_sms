/**
 * Project Name:maven-sms-demo
 * File Name:CommonSql.java
 * Package Name:com.clps.dev.sms.common
 * Date:2018年11月4日上午10:49:57
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.gc.common;


/**
 * ClassName: CommonSql <br/>
 * Description: TODO ADD REASON(可选). <br/><br/>
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年11月4日 上午10:49:57
 */
public class CommonSql {
	
   public static final String SQL_SAVE_ACCOUNT = "insert into account(account_id,account_name,account_pwd,del,"
			+ "create_user,create_time,update_user,update_time) values(?,?,?,?,?,?,?)";
	
   public static final String SQL_DELETE_ACCOUNT = "delete from account where account_id = ?";
	
   public static final String SQL_QUERY_ACCOUNT_ID = "selete * from account where account_id = ?";
	
   public static final String SQL_QUERY_ACCOUNT = "selete * from account";
	
   public static final String SQL_QUERY_ACCOUNT_CONDITION = "selete * from account where del = ?";
	
   public static final String SQL_UPDATE_ACCOUNT_ID = "update account set account_name=?,account_pwd=?,update_user=?,update_time=? where account_id=?";
	
   public static final String SQL_UPDATE_ACCOUNT_PWD_ID = "update account set account_pwd=?,update_user=?,update_time=? where account_id = ?";



}
