package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.Studentdto;


//@WebServlet("/delete")
@WebServlet("/insert")
public class Controller extends GenericServlet
{
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		
		
		
		
			String sid1=	req.getParameter("sid");
	int a=Integer.parseInt(sid1);
		
	String sname1=req.getParameter("sname");
	
	String gender=req.getParameter("gender");
	
	String phno=req.getParameter("phno");
	long num=Long.parseLong(phno);
	
	Studentdto dto=new Studentdto();
	dto.setSid(a);
	dto.setSname(sname1);
	dto.setGender(gender);	
	dto.setPhno(num);
	
	Studentdao dao=new Studentdao();
	String msg= dao.insert(dto);
	res.getWriter().print(msg);
		
		
		
//		    for deletion
//		
//		String sid=req.getParameter("sid");
//		int id=Integer.parseInt(sid);
//		
//	
//		
//		Studentdao dao=new Studentdao();
//		 String msg=dao.delete(id);
//		res.getWriter().print(msg);
//		
	
	}
}






