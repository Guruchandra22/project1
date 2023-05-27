package session_trackin_ramesh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sadiq")
public class class2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	String un=	(String)req.getSession().getAttribute("el");
	String pwd=	(String)req.getSession().getAttribute("pd");
	System.out.println(un+"  "+pwd);
	
	
		
		
	}

}
