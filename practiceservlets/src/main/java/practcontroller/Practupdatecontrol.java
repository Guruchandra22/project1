package practcontroller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import practdao.Practdao;

@WebServlet("/practupdate")
public class Practupdatecontrol extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String sid=req.getParameter("sid");
		int id=Integer.parseInt(sid);
		
		String phno=req.getParameter("phno");
		long num= Long.parseLong(phno);
		
		Practdao practdao=new Practdao();
		practdao.update(id,num);
		
	}

}
