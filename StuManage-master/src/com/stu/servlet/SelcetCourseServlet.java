package com.stu.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stu.service.CourseService;
import com.stu.service.impl.CourseServiceImpl;

@WebServlet(name = "getteam3", urlPatterns = { "/SelcetCourseServlet" })
public class SelcetCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	
	/**
	 * �ύѡ����Ϣ
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String courseno=request.getParameter("courseid");//��ȡ�γ̱��
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=format.format(date);//��ȡ��ǰʱ��
		//��ȡѧ��ѧ�ţ�
		HttpSession sesison=request.getSession();
		String studentno=(String)sesison.getAttribute("studentId");
		CourseService cs = new CourseServiceImpl();
		if(cs.ExistCourse(studentno, courseno)){
			request.setAttribute("message", "����ѡ���ÿγ̣��޷���ѡ");
		}else{
			cs.AddCourse(studentno, courseno, time);
			request.setAttribute("message", "��ӳɹ�");
		}
		
		
		request.getRequestDispatcher("CourseQueryServlet").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}