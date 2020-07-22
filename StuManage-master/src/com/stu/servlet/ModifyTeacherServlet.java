package com.stu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stu.dao.GenericDao;
import com.stu.dao.impl.ManageDaoImpl;
import com.stu.entity.Manage;

@WebServlet("/ModifyTeacherServlet")
public class ModifyTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModifyTeacherServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		GenericDao<Manage> gdao = new ManageDaoImpl();
		Manage t=new Manage();
		t.setmanageId(request.getParameter("tid"));
		t.setmanageName(request.getParameter("tname"));
		t.setmanagePassword(request.getParameter("tpwd"));
		gdao.modify(t);
		/*for (int i = 0; i < list.size(); i++) {
			Course c = list.get(i);
			System.out.println(c.getCourseid() + "\t" + c.getCoursename());
		}*/
		request.getRequestDispatcher("TeacherServlet").forward(request, response);;
	}

}
