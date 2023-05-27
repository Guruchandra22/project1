package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Studentdto;
@WebServlet("/delete")
public class remove extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String id=req.getParameter("sid");
		int cid=Integer.parseInt(id);
		
		 Studentdao dao=new Studentdao();
	     dao.remove(cid);		 
		
		 List<Studentdto> l1=dao.fetchAll();
		 
		 req.setAttribute("studentlist",l1);
		 
		 

		 resp.getWriter().print("<h1>data deleted successfully</h1>");
		 RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		 
		rd.include(req, resp);
	     
	}
}


