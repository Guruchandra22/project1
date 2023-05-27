package controllerloginvalidtion;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daovalidation.daologinvalid;
import dtovalidation.dtologinvalidation;

@WebServlet("/login")
public class Controllerloginval extends HttpServlet{

	
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);

		  
		String email=  req.getParameter("email");

	    String password=req.getParameter("password");
	      
	    
	     daologinvalid dao1=new daologinvalid();
		    dtologinvalidation dto1 =dao1.login(email);
		    
if (dto1!=null) {
	if (password.equals(dto1.getPassword())) {
		resp.getWriter().print("<h1>Welcome to home page</h1>");
	
        resp.sendRedirect("https://www.facebook.com");
		
	}else {
		resp.getWriter().print("<h1>Invalid Password</h1>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
		dispatcher.include(req, resp);
	}
}else {
	resp.getWriter().print("<h1>Account not Found,please Signup </h1><a href='signin.html'>click here to signin </a>");
}
		    	    
	  }		    }

