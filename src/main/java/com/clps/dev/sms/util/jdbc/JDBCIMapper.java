/**
 * Project Name:clps_mms_copyright_201610
 * File Name:JdbcIMapper.java
 * Package Name:com.clps.mms.sys.factory
 * Date:2016年10月18日下午5:09:14
 * Copyright (c) 2016, tmbasama@163.com All Rights Reserved.
 *
*/

package com.clps.dev.sms.util.jdbc;

import java.sql.ResultSet;

/**
 * ClassName:JdbcIMapper 
 * Function: 获取数据ResultSet 
 * Reason:	 ResultSet 
 * Date:     2016年10月18日 下午5:09:14 
 * @author   Jack.Huang
 * 	 
 */
public interface JDBCIMapper<T> {
	/**
	 * 处理结果集
	 * 
	 * */
	T map(ResultSet rs);
}
