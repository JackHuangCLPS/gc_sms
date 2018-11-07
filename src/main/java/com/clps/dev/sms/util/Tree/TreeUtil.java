/**
 * Project Name:gc_sms_mvn
 * File Name:TreeUtil.java
 * Package Name:com.gc.util.Tree
 * Date:2018年11月7日下午1:20:17
 * Copyright (c) 2018,http://www.clpsglobal.com/zh/home-cn/ All Rights Reserved.
 *
 */
package com.clps.dev.sms.util.Tree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.clps.dev.sms.pojo.Tree;


/**
 * ClassName: TreeUtil <br/>
 * Description: TODO ADD REASON(可选). <br/><br/>
 *
 * @author Jack.Huang
 * @version V1.0
 * @since JDK 1.8
   @date:2018年11月7日 下午1:20:17
 */
public class TreeUtil {
	
	public static Map<String, Object> mapArray = new LinkedHashMap<>();
	public List<Tree> menuCommon;
	public List<Object> list = new ArrayList<>();
	/**
	 * 
	 * menuList:
	 * @Description:构建树形结构
	 * @param:@param menu
	 * @param:@return
	 * @author Jack.Huang
	 * @return:List<Object>
	 */
	 public List<Object> menuList(List<Tree> menu){   
		    this.menuCommon = menu; 
		    for (Tree x : menu) {   
		      Map<String,Object> mapArr = new LinkedHashMap<String, Object>(); 
		      if(x.getpId()=="0"){ 
		        mapArr.put("id", x.getId()); 
		        mapArr.put("name", x.getName());  
		        mapArr.put("pid", x.getpId());  
		        mapArr.put("childList", menuChild(x.getId()));  
		        list.add(mapArr); 
		      } 
		    }   
		    return list; 
		  } 
		   /**
		    * menuChild
		    * @Description:构建子菜单
		    * @param:@param id
		    * @param:@return
		    * @author Jack.Huang
		    * @return:List<?>
		    */
		  public List<?> menuChild(String id){ 
		    List<Object> lists = new ArrayList<Object>(); 
		    for(Tree a:menuCommon){ 
		      Map<String,Object> childArray = new LinkedHashMap<String, Object>(); 
		      if(a.getpId() == id){ 
		        childArray.put("id", a.getId()); 
		        childArray.put("name", a.getName()); 
		        childArray.put("pid", a.getpId()); 
		        childArray.put("childList", menuChild(a.getId()));
		        lists.add(childArray); 
		      } 
		    } 
		    return lists; 
		  }
		  public boolean checkChild(String pid) {
			  for(Tree a:menuCommon) {
				  if(a.getpId()==pid) {
					return true;  
				  }
			  }
			  return false;
		  }
		  public boolean deleteChild(String id) {
			  int i = 0;
			  for(Tree a:menuCommon) {
				  i++;
				  if(a.getId()==id && a.getpId()!=null) {
					  menuCommon.remove(i);
					  return true;
				  }
			  }
			  return false;
		  }
		  
		  public boolean deleteParent(String pid) {
			  return false;
		  }
		  
}
