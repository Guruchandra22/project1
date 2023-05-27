package session_trackin_ramesh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/tracking")
public class class1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String el=req.getParameter("email");
		String pd=req.getParameter("pwd");
		
		
		HttpSession h=req.getSession();
		
		h.setAttribute("ell", el);
		h.setAttribute("pdd", pd); 
		
		resp.sendRedirect("sadiq");
		System.out.println(el+"  "+pd);
				
	}
	
	
	

}
