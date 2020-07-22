package com.stu.service;

import java.util.List;

public interface GenericService <T>{
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
