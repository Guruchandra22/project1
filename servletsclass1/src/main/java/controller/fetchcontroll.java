package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.Studentdto;

@WebServlet("/fetchbyid")
public class fetchcontroll extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("sid");
	int id1=Integer.parseInt(id);
	
	Studentdao dao=new Studentdao();

	
	Studentdto dto=dao.fetchbyid(id1);
	res.getWriter().print(dto);
		
	}

}
