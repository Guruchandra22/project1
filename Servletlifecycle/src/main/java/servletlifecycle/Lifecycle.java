package servletlifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/life")
public class Lifecycle implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method is invoked");
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method is invoked");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("destroy method is invoked");
		// TODO Auto-generated method stub
		
		
	}

}
