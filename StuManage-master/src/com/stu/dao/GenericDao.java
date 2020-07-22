package com.stu.dao;

import java.util.List;



public interface GenericDao<T> {
	/**
	 *��ѯ��Ϣ
	 */
	List<T> list();
	
	/**
	 * ���
	 */
	int add(T t);
	
	/**
	 * ɾ��
	 */
	int delete(String id);
	
	/**
	 * �޸�
	 */
	int modify(T t);
	
	/**
	 * ����
	 */
	T get(String i);
}
