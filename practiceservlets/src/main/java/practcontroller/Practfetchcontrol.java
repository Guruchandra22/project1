package practcontroller;

import java.io.IOException;
import java.util.List;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import practdao.Practdao;
import practdto.Practdto;

@WebServlet("/fetchall")
public class Practfetchcontrol extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		String sid=req.getParameter("sid");
//		int id=Integer.parseInt(sid);
		
		Practdao practdao=new Practdao();
		
		
		List<Practdto>l=practdao.fetchall();
		res.getWriter().print(l);
	
	}
	

}
