/**
 * Project Name:clps.sms
 * File Name:DateTool.java
 * Package Name:com.clps.dev.sms.util
 * Date:2018年10月31日下午1:51:59
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.clps.dev.sms.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * ClassName: DateTool <br/>
 * Description: 时间工具类
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年10月31日 下午1:51:59
 */
public class DateTool {
	
	
	/**
	 * 
	 * dateToString:日期转字符串24小时制
	 * @Description:传入一个日期
	 * @param:@param date
	 * @param:@return
	 * @return:String
	 */
	public String dateToString(Date date,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);	
	}
	/**
	 * 
	 * stringToDate:字符串日期转日期24小时
	 * @Description:传入一个字符串类型的日期
	 * @param:@param date
	 * @param:@return
	 * @param:@throws Exception
	 * @return:Date
	 */
	public Date stringToDate(String date,String format) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}
	/**
	 * 
	 * simpleDateToString:简单的字符串日期转日期
	 * @Description
	 * @param:@param date
	 * @param:@return
	 * @return:String
	 */
	public String simpleDateToString(Date date,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	/**
	 * 
	 * simpleStringToDate:简单的日期转为字符串
	 * @Description
	 * @param:@param date
	 * @param:@return
	 * @param:@throws Exception
	 * @return:Date
	 */
	public Date simpleStringToDate(String date,String format) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}
	/**
	 * 
	 * dateToStringT:12小时
	 * @Description
	 * @param:@param date
	 * @param:@return
	 * @author Jack.Huang
	 * @return:String
	 */
	public String dateToStringT(Date date,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);	
	}
	/**
	 * 
	 * stringToDateT:12小时
	 * @Description:
	 * @param:@param date
	 * @param:@return
	 * @param:@throws Exception
	 * @author Jack.Huang
	 * @return:Date
	 */
	public Date stringToDateT(String date,String format) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}
	
	public String timeZone(Date date,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String timezone = sdf.format(date);
		return timezone;
	}
}
