/**
 * Project Name:gc_sms_mvn
 * File Name:Tree.java
 * Package Name:com.gc.pojo
 * Date:2018年11月7日上午10:49:14
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.clps.dev.sms.pojo;

/**
 * ClassName: Tree <br/>
 * Description: 树形结构
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年11月7日 上午10:49:14
 */
public class Tree {
	 private String id;
	 private String pId;
	 private String name;
	/**
	 * id.
	 *
	 * @return  the id
	 */
	public final String getId() {
		return id;
	}
	/**
	 * id.
	 *
	 * @param   id    the id to set
	 */
	public final void setId(String id) {
		this.id = id;
	}
	/**
	 * pId.
	 *
	 * @return  the pId
	 */
	public final String getpId() {
		return pId;
	}
	/**
	 * pId.
	 *
	 * @param   pId    the pId to set
	 */
	public final void setpId(String pId) {
		this.pId = pId;
	}
	/**
	 * name.
	 *
	 * @return  the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * name.
	 *
	 * @param   name    the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tree [id=" + id + ", pId=" + pId + ", name=" + name + "]";
	}
	
}
