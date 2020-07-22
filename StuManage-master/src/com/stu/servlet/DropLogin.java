package com.stu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DropLogin
 */
@WebServlet("/DropLogin")
public class DropLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dropInfo=request.getParameter("dropInfo");
		switch(dropInfo){
		case "manage":
			request.getSession().invalidate();//������SessionʧЧ
			request.getSession().removeAttribute("manageId");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		case "student":
			request.getSession().invalidate();//������SessionʧЧ
			request.getSession().removeAttribute("studentId");
			System.out.println("ѧ���˳�");
			request.getRequestDispatcher("indexStudent.jsp").forward(request, response);
		    break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
