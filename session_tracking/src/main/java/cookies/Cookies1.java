package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  javax.servlet.http.Cookie;
@WebServlet("/cookies")
public class Cookies1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String email=req.getParameter("Username");
		String pwd=req.getParameter("pswd");
		System.out.println(email+" "+pwd+" ");
		
		Cookie c1=new Cookie("username", email);
		Cookie c2=new Cookie("password", pwd);
		resp.addCookie(c1);
		resp.addCookie(c2);
	}

}
