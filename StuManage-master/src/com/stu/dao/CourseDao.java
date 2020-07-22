package com.stu.dao;


import java.sql.Date;
import java.util.List;

import com.stu.entity.Course;
import com.stu.entity.SelectCourse;


public interface CourseDao {
	/**
	 * ��ѯ���пγ�
	 */
	List<Course> list();
	
	/**
	 * ��ѯ��ѡ�γ�select��
	 */
	List<SelectCourse> list2(String studentId);
	
	
	/**
	 * ѡ��
	 */
	int AddCourse(String studentId,String courseId,String date);
	
	/**
	 * ɾ����ѡ�γ�
	 */
	int DelCourse(String courseId);
	
	/**
	 * ѧ���Ƿ���ѡ�Ŀγ�
	 */
	boolean ExistCourse(String studentId,String courseId);
}
