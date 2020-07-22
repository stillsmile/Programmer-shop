package com.stu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stu.dao.impl.ManageDaoImpl;
import com.stu.dao.impl.StudentDaoImpl;
import com.stu.entity.Manage;
import com.stu.entity.Student;

/**
 * Servlet implementation class ManageServlet
 */
@WebServlet("/ManageServlet")
public class ManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(123);	
		String manageId=request.getParameter("manageId");
	         String managePassword=request.getParameter("managePassword");
	         Manage m=new Manage();
	         m.setmanageId(manageId);
	         m.setmanagePassword(managePassword);
	         ManageDaoImpl mdao=new ManageDaoImpl();
	         Manage manage=mdao.login1(m);
	         HttpSession session=request.getSession();
	         if(manage!=null){
			session.setAttribute("manageId", manageId);
			session.setAttribute("manageName", manage.getmanageName());
			session.setAttribute("manageAutohrity", manage.getmanageAuthority());
			session.setAttribute("password", manage.getmanagePassword());
			request.getRequestDispatcher("index.jsp").forward(request, response);
	         }else{
	        	 request.setAttribute("info","�û����������������");
	        	 request.getRequestDispatcher("Login.jsp").forward(request, response);
	         }
	         
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
