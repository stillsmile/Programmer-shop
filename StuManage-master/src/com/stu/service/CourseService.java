package com.stu.service;

import java.util.List;

import com.stu.entity.Course;
import com.stu.entity.SelectCourse;



public interface CourseService {
	/**
	 * ��ѯ���пγ�
	 * @return
	 */
	List<Course> list();
	
	/**
	 * ��ѯ��ѡ�γ�
	 * @return
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
