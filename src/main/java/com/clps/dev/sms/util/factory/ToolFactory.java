/**
 * Project Name:clps.sms
 * File Name:ToolFactory.java
 * Package Name:com.clps.dev.sms.util.factory
 * Date:2018年10月31日下午2:19:18
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.clps.dev.sms.util.factory;

import com.clps.dev.sms.util.date.DateTool;

/**
 * ClassName: ToolFactory <br/>
 * Description: 工具工厂
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年10月31日 下午2:19:18
 */
public class ToolFactory {
	
	public static DateTool getInstanceOfDateTool() {
		return new DateTool();
	}

}
