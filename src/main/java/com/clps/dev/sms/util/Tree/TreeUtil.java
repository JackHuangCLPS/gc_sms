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

import org.apache.ibatis.io.ResolverUtil.IsA;

import com.alibaba.druid.support.json.JSONUtils;
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
		  /**
		   * 
		   * checkChild:
		   * @Description:判断是否有子节点
		   * @param:@param pid
		   * @param:@return
		   * @author Jack.Huang
		   * @return:boolean
		   */
		  public boolean checkChild(String pid,List<Tree> list) {
			  for(Tree a:list) {
				  if(a.getpId()==pid) {
					return true;  
				  }
			  }
			  return false;
		  }
		  /**
		   * 
		   * deleteChild
		   * @Description:删除子节点
		   * @param:@param id
		   * @param:@return
		   * @author Jack.Huang
		   * @return:boolean
		   */
		  public List<Tree> deleteChild(String id,List<Tree> list) {
			  int i = -1;
			  for(Tree a:list) {
				  i++;
				  if(a.getId()==id && a.getpId()!="0") {
					  //list.remove(i);
					  break;
				  }
			  }
			  list.remove(i);
			  return list;
		  }
		  /**
		   * 
		   * deleteParent:
		   * @Description:删除父节点
		   * @param:@param pid
		   * @param:@param list
		   * @param:@return
		   * @author Jack.Huang
		   * @return:boolean
		   */
		  public List<Tree> deleteParent(String pid,List<Tree> list) {
			  int i = -1;
			  for(Tree a : list) {
				  i++;
				  if (a.getId().equals(pid)) {
					//list.remove(i);
					if(checkChild(pid,list)) {
						deleteChild(a.getId(),list);
						break;
					}
				}
			}
			  list.remove(i);
			  return list;
		  }
		  public static void main(String[] args) {
			List<Tree> list = new ArrayList<>();
			Tree tree = new Tree("1","0","首页");
			Tree tree1 = new Tree("2","0","订单");
			Tree tree2 = new Tree("3","1","预约");
			list.add(tree);
			list.add(tree1);
			list.add(tree2);
			TreeUtil treeUtil = new TreeUtil();
			//System.out.println(JSONUtils.toJSONString(treeUtil.menuList(list)));
			List<Tree> list2 = treeUtil.deleteParent("3", list);
			System.out.println(JSONUtils.toJSONString(treeUtil.menuList(list2)));
		}
		  
}
