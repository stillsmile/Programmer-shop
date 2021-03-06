package com.stu.dao;

import java.util.List;



public interface GenericDao<T> {
	/**
	 *查询信息
	 */
	List<T> list();
	
	/**
	 * 添加
	 */
	int add(T t);
	
	/**
	 * 删除
	 */
	int delete(String id);
	
	/**
	 * 修改
	 */
	int modify(T t);
	
	/**
	 * 加载
	 */
	T get(String i);
}
