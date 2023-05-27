package practcontroller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import practdao.Practdao;
import practdto.Practdto;

@WebServlet("/practinsert")
public class Practcontroller extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String sid=req.getParameter("sid");
		int id=Integer.parseInt(sid);
		
		String sname= req.getParameter("sname");
		
		String gender=req.getParameter("gender");
		
		String phno=req.getParameter("phno");
		long num= Long.parseLong(phno);
		
		Practdto practdto=new Practdto();
		practdto.setSid(id);
		practdto.setSname(sname);
		practdto.setGender(gender);
		practdto.setNumber(num);
		
		
		Practdao practdao=new Practdao();
		practdao.insert(practdto);
	}

}
